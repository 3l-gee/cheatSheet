# Django 101

Start a Django-Project
```bash
django-admin startproject myproject
```

Create a new Django app/module
```bash
python myproject/manage.py startapp myapp
```

Run database migrations:
```bash
python myproject/manage.py makemigrations
python myproject/manage.py migrate
```

Create a superuser:
```bash
python myproject/manage.py createsuperuser
```

Run the development server:
```bash
python myproject/manage.py runserver
```

Run tests:
```bash
python myproject/manage.py test
python myproject/manage.py test myapp           # Module sepecif test cases
```