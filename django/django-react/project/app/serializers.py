from rest_framework import serializers
from .models import Person, Bike

class PersonSerializer(serializers.ModelSerializer):
    class Meta:
        model = Person
        fields = ['UUID','first_name', 'last_name']
        read_only_fields = ['UUID']

class BikeSerializer(serializers.ModelSerializer):
    class Meta:
        model = Bike
        fields = ['UUID', 'person', 'bike_type', 'bike_size']
        read_only_fields = ['UUID']