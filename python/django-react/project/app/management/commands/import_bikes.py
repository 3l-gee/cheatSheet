from django.core.management.base import BaseCommand
from app.models import Person, Bike
import uuid

class Command(BaseCommand):
    help = 'Import bikes data to the database'

    def handle(self, *args, **options):
        bikes_data = [
            {'bike_type': 'Road_Bike', 'bike_size': 22},
            {'bike_type': 'Mountain_Bike', 'bike_size': 26},
            {'bike_type': 'City_Bike', 'bike_size': 24},
            {'bike_type': 'City_Bike', 'bike_size': 30, 'person_uuid': 'dca6ce16-cbcf-499f-97e1-25d915c7303a'},
            {'bike_type': 'Road_Bike', 'bike_size': 30, 'person_uuid': 'dca6ce16-cbcf-499f-97e1-25d915c7303a'},
        ]

        for data in bikes_data:
            person_uuid = data.pop('person_uuid', None)

            if person_uuid:
                person = Person.objects.get(UUID=uuid.UUID(person_uuid))
            else:
                person = None

            bike = Bike(person=person, **data)
            bike.save()

        self.stdout.write(self.style.SUCCESS('Bikes data imported successfully.'))
