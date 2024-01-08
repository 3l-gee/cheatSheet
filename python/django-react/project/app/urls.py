from django.urls import path
from . import views
from .views import PersonView,BikeView

urlpatterns = [
    path('persons/', PersonView.as_view(), name='person-list'),
    path('persons/<uuid:uuid>/', PersonView.as_view(), name='person-detail'),
    path('bikes/', BikeView.as_view(), name='bike-list'),
    path('bikes/<uuid:uuid>/', BikeView.as_view(), name='bike-detail'),
]