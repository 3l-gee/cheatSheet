from django.db import models

# Create your models here.
class Person(models.Model):
    first_name = models.CharField(max_length=30)
    last_name = models.CharField(max_length=30)
   
class BikeType(models.Model):
    name = models.CharField(max_length=30, unique=True)

    def __str__(self):
        return self.name
    
class Bike(models.Model):
    bike_type = models.ForeignKey(BikeType, on_delete=models.CASCADE)
    bike_model = models.CharField(max_length=30)
    serial_number = models.IntegerField()
