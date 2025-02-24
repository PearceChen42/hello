from django.shortcuts import render
from django.http import Http404, HttpResponse, JsonResponse
import time
# Create your views here.


def index(request):
    return render(request, "singlepage/index.html")


texts =[ "Lorem ipsum dolor sit amet, consecteur adipipscing",
        "Praesent euismod auctor quam, id congue tellus malesuada",
        "Morbi imperdiet nunc ac quam hendrerit faucibus"]


def section(request, num):
    if 1 <= num <= 3:
        return HttpResponse(texts[num - 1])
    else:
        raise Http404("No such section")


def posts(request):
    # Get start and end points
    start = int(request.GET.get("start") or 0)
    end = int(request.GET.get("end") or (start + 9))
    
    # Generate list of posts
    data = []
    for i in range(start, end + 1):
        data.append(f"Post #{i}")
        
    # Artificially delay speed of response
    time.sleep(1)
    
    # Return list of post
    return JsonResponse( {
        'posts': data
    })
    