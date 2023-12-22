import React, { useState, useEffect } from 'react';
import axios from 'axios';

function PersonComponent() {
    const [persons, setPersons] = useState([]);
    const [newPerson, setNewPerson] = useState({
        first_name: '',
        last_name: '',
    });

    useEffect(() => {
        const fetchPersons = async () => {
          try {
            const response = await axios.get('http://localhost:8000/app/persons/');
            setPersons(response.data.persons);
          } catch (error) {
            console.error('Error fetching persons:', error);
          }
        };
      
        fetchPersons();
    }, []);

    const handleInputChange = (e) => {
        const { name, value } = e.target;
        setNewPerson({
            ...newPerson,
            [name]: value,
        });
    };

    const handleSubmit = async (e) => {
        e.preventDefault();

        try {
            await axios.post('http://localhost:8000/app/persons/', newPerson);
            const response = await axios.get('http://localhost:8000/app/persons/');
            setPersons(response.data.persons);
            setNewPerson({
                first_name: '',
                last_name: '',
            });
        } catch (error) {
            console.error('Error creating person:', error);
        }
    };

    return (
        <div>
            <h2>Persons</h2>
            <ul>
                {persons.map((person) => (
                    <li key={person.id}>
                        {person.first_name} {person.last_name}
                    </li>
                ))}
            </ul>

            <h2>Add New Person</h2>
            <form onSubmit={handleSubmit}>
                <label>
                    First Name:
                    <input
                        type="text"
                        name="first_name"
                        value={newPerson.first_name}
                        onChange={handleInputChange}
                    />
                </label>
                <br />
                <label>
                    Last Name:
                    <input
                        type="text"
                        name="last_name"
                        value={newPerson.last_name}
                        onChange={handleInputChange}
                    />
                </label>
                <br />
                <button type="submit">Add Person</button>
            </form>
        </div>
      );
}

export default PersonComponent;