from django.shortcuts import render

tasks = ["foo", "bar", "baz"]

# Create your views here.
def index(request):
    print("start tasks")
    return render(request, "tasks/index.html",{
        "tasks": tasks
    }
  )