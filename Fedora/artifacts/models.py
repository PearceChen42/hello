from django.db import models

# Create your models here.


class Artifacts(models.Model):
    name = models.CharField(max_length=100)
    shiny = models.BooleanField()
    