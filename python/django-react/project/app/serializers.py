from rest_framework import serializers
from .models import Person

class PersonSerializer(serializers.ModelSerializer):
    class Meta:
        model = Person
        fields = ['UUID','first_name', 'last_name']
        read_only_fields = ['UUID']