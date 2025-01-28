from django.shortcuts import render

task = ["harry", "ron", "kali", "foo", "bar", "baz"]

# Create your views here.
def index(request):
    print("start tasks")
    return render(request, "tasks/index.html",{
        "names": task
    }
  )