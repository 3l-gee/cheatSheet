@echo off

REM Replace 'your_project_name' with the actual name of your Django project
set BACKEND=backend
set VENV_NAME=.venv

REM Activate virtual environment
call %VENV_NAME%\Scripts\activate.bat

REM Open web browser with localhost:8000
start http://localhost:8000

REM Run Django development server
cd %BACKEND%
python manage.py runserver