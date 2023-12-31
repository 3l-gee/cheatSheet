from django.shortcuts import render,get_object_or_404
from rest_framework.decorators import api_view
from rest_framework.response import Response
from rest_framework.views import APIView
from rest_framework import status
from .models import Person, Bike
from .serializers import PersonSerializer, BikeSerializer

import uuid

class PersonView(APIView):
    def get(self, request, uuid=None):
        if uuid:
            try : 
                person = get_object_or_404(Person, UUID=uuid)
                serializer = PersonSerializer(person)
                return Response({'person': serializer.data})  
            except :
                return Response(serializer.errors, status=status.HTTP_400_BAD_REQUEST)
        else:
            persons = Person.objects.all()
            serializer = PersonSerializer(persons, many=True)
            return Response({'persons': serializer.data})

    def post(self, request):
        serializer = PersonSerializer(data=request.data)
        if serializer.is_valid():
            serializer.save()
            return Response({'success': True, 'message': 'Person created successfully'})
        return Response(serializer.errors, status=status.HTTP_400_BAD_REQUEST)

    def delete(self, request, uuid):
        try :
            person = get_object_or_404(Person, UUID=uuid)
            person.delete()
            return Response({'success': True, 'message': 'Person deleted successfully'})
        except :
            return Response(status=status.HTTP_404_NOT_FOUND)

    def put(self, request, uuid):
        person = get_object_or_404(Person, UUID=uuid)
        serializer = PersonSerializer(person, data=request.data)
        if serializer.is_valid():
            serializer.save()
            return Response({'success': True, 'message': 'Person updated successfully'})
        return Response(serializer.errors, status=status.HTTP_400_BAD_REQUEST)


class BikeView(APIView):
    def get(self, request, uuid=None):
        if uuid:
            try :
                bike = get_object_or_404(Bike, UUID=uuid)
                serializer = BikeSerializer(bike)
                return Response({'bike': serializer.data})
            except :
                return Response(status=status.HTTP_404_NOT_FOUND)
        else :             
            bikes = Bike.objects.all()
            serializer = BikeSerializer(bikes, many=True)
            return Response({'bikes': serializer.data})
    
    def post(self, request):
        serializer = BikeSerializer(data=request.data)
        if serializer.is_valid():
            serializer.save()
            return Response({'success': True, 'message': 'Bike created successfully'})
        return Response(serializer.errors, status=status.HTTP_400_BAD_REQUEST)

    
    def delete(self, request, uuid):
        try :
            bike = get_object_or_404(Bike, UUID=uuid)
            bike.delete()
            return Response({'success': True, 'message': 'Bike deleted successfully'})
        except :
            return Response(status=status.HTTP_404_NOT_FOUND)
        
    def put(self, request, uuid):
        bike = get_object_or_404(Bike, UUID=uuid)
        serializer = BikeSerializer(bike, data=request.data)
        if serializer.is_valid():
            serializer.save()
            return Response({'success': True, 'message': 'Bike updated successfully'})
        return Response(serializer.errors, status=status.HTTP_400_BAD_REQUEST)




