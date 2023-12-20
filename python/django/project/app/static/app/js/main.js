
document.addEventListener('DOMContentLoaded', function () {
    // Fetch and display Person data
    fetch('/api/persons/')
        .then(response => response.json())
        .then(data => {
            const personList = document.getElementById('person-list');
            data.forEach(person => {
                const listItem = document.createElement('li');
                listItem.textContent = `${person.first_name} ${person.last_name}`;
                personList.appendChild(listItem);
            });
        });

    // Fetch and display Bike data
    fetch('/api/bikes/')
        .then(response => response.json())
        .then(data => {
            const bikeList = document.getElementById('bike-list');
            data.forEach(bike => {
                const listItem = document.createElement('li');
                listItem.textContent = `${bike.bike_type} - Serial Number: ${bike.serial_number}`;
                bikeList.appendChild(listItem);
            });
        });

    // Function to add a user
    window.addUser = function () {
        const firstNameInput = document.getElementById('first-name');
        const lastNameInput = document.getElementById('last-name');

        const newUser = {
            first_name: firstNameInput.value,
            last_name: lastNameInput.value,
        };

        // Include CSRF token in headers
        const csrfToken = document.querySelector('[name=csrfmiddlewaretoken]').value;

        // Send a POST request to add a new user
        fetch('/api/persons/', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
                'X-CSRFToken': csrfToken,  // Include the CSRF token in the headers
            },
            body: JSON.stringify(newUser),
        })
        .then(response => response.json())
        .then(data => {
            // Clear the form
            firstNameInput.value = '';
            lastNameInput.value = '';

        });
    };

    
});
