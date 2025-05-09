from rest_framework import serializers
from .models import Artifacts


class ArtifactsSerializer(serializers.ModelSerializer):
    class Meta:
        model = Artifacts
        fields = "__all__"