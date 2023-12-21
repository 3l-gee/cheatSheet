
from django.shortcuts import render
from django.http import JsonResponse
from django.views import View
from django.views.decorators.csrf import csrf_exempt
from django.utils.decorators import method_decorator
import json
from .models import Person


def index(request):
    return render(request, 'index.html')

class PersonView(View):
    def get(self, request):
        persons = Person.objects.all()
        return render(request, 'person_list.html', {'persons': persons})
    
    def post(self,request):
        try :
            data = json.loads(request.body)
            first_name = data.get('first_name')
            last_name = data.get('last_name')

            if not first_name or not last_name:
                return JsonResponse({'success': False, 'message': 'First name and last name are required.'}, status=400)
            
            new_person = Person.objects.create(first_name=first_name, last_name=last_name)

            response_data = {
                'success': True,
                'message': 'Person created successfully',
                'person': {
                    'first_name': new_person.first_name,
                    'last_name': new_person.last_name,
                }
            }
            return JsonResponse(response_data, status=201)
        except Exception as e:
            return JsonResponse({'success': False, 'message': str(e)}, status=500)
        
# @method_decorator(csrf_exempt, name='dispatch')
# class BikeTypeView(View):
#     def get(self, request):
#         bike_types = BikeType.objects.all()
#         bike_types_data = [{'id': bike_type.id, 'name': bike_type.name} for bike_type in bike_types]
#         return JsonResponse({'bike_types': bike_types_data})
    
#     def post(self, request):
#         try:
#             data = json.loads(request.body)
#             name = data.get('name')
#             new_bike_type = BikeType.objects.create(name=name)

#             response_data = {
#                 'success': True,
#                 'message': 'Bike Type created successfully',
#                 'person': {
#                     'name': new_bike_type.name
#                 }
#             }

#             return JsonResponse(response_data, status=201)
#         except Exception as e:
#             return JsonResponse({'success': False, 'message': str(e)}, status=500)

# @method_decorator(csrf_exempt, name='dispatch')
# class BikeView(View):
#     def get(self, request):
#         bikes = Bike.objects.all()
#         data = [{'bike_type': bike.bike_type, 'bike_model': bike.bike_model, 'serial_number': bike.serial_number} for bike in bikes]
#         return JsonResponse(data, safe=False)

#     def post(self, request):
#         try : 
#             data = json.loads(request.body)
#             bike_type = data.get('bike_type')
#             bike_model = data.get('bike_model')
#             serial_number = data.get('serial_number')

#             if not bike_type or not bike_model or not serial_number:
#                 return JsonResponse({'success': False, 'message': 'bike_type, bike_model and serial_number are required.'}, status=400)

#             new_bike = Bike.objects.create(bike_type=bike_type, bike_model=bike_model, serial_number=serial_number)

#             response_data = {
#                 'success': True,
#                 'message': 'bike created successfully',
#                 'bike': {
#                     'bike_type': new_bike.bike_type,
#                     'bike_model': new_bike.bike_model,
#                     'serial_number': new_bike.serial_number,
#                 }
#             }
#             return JsonResponse(response_data, status=201)
#         except Exception as e:
#             return JsonResponse({'success': False, 'message': str(e)}, status=500)
