from django.db import models

# Create your models here.
class Person(models.Model):
    first_name = models.CharField(max_length=30)
    last_name = models.CharField(max_length=30)

    def __str__(self):
        return f'{self.first_name} {self.last_name}'
   
# class BikeType(models.Model):
#     name = models.CharField(max_length=30, unique=True)

#     def __str__(self):
#         return self.name
    
# class Bike(models.Model):
#     bike_type = models.ForeignKey(BikeType, on_delete=models.CASCADE)
#     bike_model = models.CharField(max_length=30)
#     serial_number = models.IntegerField()

#     def __str__(self):
#         return f'{self.bike_type} - Serial Number: {self.serial_number}'
