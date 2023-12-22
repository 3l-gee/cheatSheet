from django.urls import path
from . import views
from .views import PersonView

urlpatterns = [
    path('hello-world/', views.hello_world, name='hello_world'),
    path('persons/', PersonView.as_view(), name='person-list'),
    path('persons/<int:pk>/', PersonView.as_view(), name='person-detail'),
]