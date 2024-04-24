@echo off

REM Replace 'your_project_name' with the actual name of your Django project
set BACKEND=backend
set FRONTEND=frontend
set VENV_NAME=.venv

REM Activate virtual environment
call %VENV_NAME%\Scripts\activate.bat

REM Open web browser with localhost:8000
start http://localhost:8000

REM Run React development server in a new command prompt window
start cmd /k "cd %FRONTEND% && npm start"

REM Run Django development server in the current command prompt window
cd %BACKEND%
python manage.py runserver