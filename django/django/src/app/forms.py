# forms.py
from django import forms
from .models import Person

class PersonForm(forms.ModelForm):
    class Meta:
        model = Person
        fields = ['first_name', 'last_name']

# class BikeForm(forms.ModelForm):
#     class Meta:
#         model = Bike
#         fields = ['bike_type', 'bike_model', 'serial_number']

# class BikeTypeForm(forms.Form):
#     name = forms.CharField(max_length=30, required=True)
