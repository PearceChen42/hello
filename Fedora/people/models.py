from django.db import models

# Create your models here.

class Person(models.Model):
    first = models.CharField(max_length=50)
    last = models.CharField(max_length=50)
    title = models.CharField(max_length=5)
    
    class Meta:
        verbose_name_plural = "People"