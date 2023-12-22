from django.shortcuts import render,get_object_or_404
from rest_framework.decorators import api_view
from rest_framework.response import Response
from rest_framework.views import APIView
from rest_framework import status
from .models import Person
from .serializers import PersonSerializer

@api_view(['GET'])
def hello_world(request):
    return Response({'message': 'Hello, world TEST!'})

class PersonView(APIView):
    def get(self, request, pk=None):
        if pk:
            person = get_object_or_404(Person, pk=pk)
            serializer = PersonSerializer(person)
            return Response({'person': serializer.data})
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

    def delete(self, request, pk):
        person = get_object_or_404(Person, pk=pk)
        person.delete()
        return Response({'success': True, 'message': 'Person deleted successfully'})

    def put(self, request, pk):
        person = get_object_or_404(Person, pk=pk)
        serializer = PersonSerializer(person, data=request.data)
        if serializer.is_valid():
            serializer.save()
            return Response({'success': True, 'message': 'Person updated successfully'})
        return Response(serializer.errors, status=status.HTTP_400_BAD_REQUEST)
