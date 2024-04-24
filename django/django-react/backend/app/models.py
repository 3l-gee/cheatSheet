import uuid
from django.db import models
from django.core.validators import MinValueValidator, MaxValueValidator

class Person(models.Model):
    UUID = models.UUIDField(primary_key=True, default=uuid.uuid4, editable=False)
    first_name = models.CharField(max_length=30)
    last_name = models.CharField(max_length=30)

    def __str__(self):
        return f'{self.UUID} {self.first_name} {self.last_name}'
    

class Bike(models.Model):
    BIKE_TYPES = [
        ('Road_Bike', 'Road Bike'),
        ('Mountain_Bike', 'Mountain Bike'),
        ('City_Bike', 'City Bike'),
    ]

    UUID = models.UUIDField(primary_key=True, default=uuid.uuid4, editable=False)
    person = models.ForeignKey(Person, on_delete=models.CASCADE, null=True)
    bike_type = models.CharField(max_length=15, choices=BIKE_TYPES)
    bike_size = models.IntegerField(validators=[MinValueValidator(20), MaxValueValidator(60)])

    def __str__(self):
        return f'{self.UUID} {self.person} {self.bike_type} {self.bike_size}'