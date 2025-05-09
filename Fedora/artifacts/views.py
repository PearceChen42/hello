from django.shortcuts import render
from rest_framework import viewsets

from .models import Artifacts
from .serializers import ArtifactsSerializer


class ArtifactViewSet(viewsets.ModelViewSet):
    serializer_class = ArtifactsSerializer
    
    def get_queryset(self):
        return Artifacts.objects.all()

# Create your views here.
