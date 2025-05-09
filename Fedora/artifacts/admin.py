from django.contrib import admin
from .models import Artifacts
# Register your models here.
@admin.register(Artifacts)
class ArtifactsAdmin(admin.ModelAdmin):
    list_display = ("name", "shiny")

