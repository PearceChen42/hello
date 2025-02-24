from django.urls import path
from . import views
urlpatterns = [
    path("", views.index, name="index"),
    path("<str:name>", views.greet, name="greet"),
    path("PearceChen42", views.PearceChen42, name="PearceChen"),
    path("david", views.david, name="david")
    
]
