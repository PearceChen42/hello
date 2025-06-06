from django.shortcuts import render
from rest_framework.decorators import api_view
from rest_framework.response import Response 


from .models import Person
from .serializers import PersonSerializer

# Create your views here.


@api_view(["GET"])
def list_people(request):
    people = Person.objects.all()
    serializer = PersonSerializer(people, many=True)
    content = {
        "people": serializer.data,
    }
    
    return Response(content)
    

