from django.db import models

class Vehicle(models.Model):
    name = models.CharField(max_length=100)
    
class Part(models.Model):
    name = models.CharField(max_length=100)
    make = models.CharField(max_length=100)
    Vehicle = models.ForeignKey(Vehicle, on_delete=models.CASCADE)