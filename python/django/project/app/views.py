
from django.shortcuts import render
from django.http import JsonResponse
from .models import Person, Bike

def index(request):
    return render(request, 'index.html')

def get_persons(request):
    persons = Person.objects.all()
    data = [{'first_name': person.first_name, 'last_name': person.last_name} for person in persons]
    return JsonResponse(data, safe=False)

def get_bikes(request):
    bikes = Bike.objects.all()
    data = [{'bike_type': bike.bike_type, 'serial_number': bike.serial_number} for bike in bikes]
    return JsonResponse(data, safe=False)
