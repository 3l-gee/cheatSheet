from django.db import models

# Create your models here.
class Person(models.Model):
    first_name = models.CharField(max_length=30)
    last_name = models.CharField(max_length=30)

class Bike(models.Model):
    bike_type = models.CharField(max_length=30)
    serial_number = models.IntegerField()