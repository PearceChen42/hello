from django.shortcuts import render
from django.http import HttpResponse
from django.contrib.auth.decorators import login_required

from rest_framework import viewsets
from rest_framework.permissions import IsAuthenticated, IsAdminUser, BasePermission

from .models import Book
from .serializers import BookSerializer


class IsSuperUser(BasePermission):
    def has_permission(self, request, view):
        return request.user.is_superuser
    
    def has_object_permission(self, request, view, obj):
        return request.user.is_superuser


class IsIndy(BasePermission):
    def has_object_permission(self, request, view, obj):
        if not obj.restricted:
            return True
        return request.user.username == "indy"


class BookViewSet(viewsets.ModelViewSet):
    serializer_class = BookSerializer
    permission_classes = [IsIndy]
    
    def get_queryset(self):
        if self.request.user.is_staff:
            return Book.objects.all()
        return Book.objects.filter(restricted=False)
# Create your views here.

@login_required
def library(request):
    output = f"""
    <html>
    <body> 
    <h2>Library</h2>
    <p>{request.user.username}</P>
    <a href="/books/books/">Books API</a>
    <br/>

    <form id="logout-form" method="post" action="/admin/logout/">
                    <input type="hidden" name="csrfmiddlewaretoken" value="LhOZNBajtqqpI3ksMRBXFBwEFntU3UjECymu9qDuZbqYxGuswwy0AhL1yfNRY87k">
                    <button type="submit">Log out</button>
                </form>
    </body>
    </html>"""
    return HttpResponse(output)
