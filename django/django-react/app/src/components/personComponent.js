import React, { useState, useEffect} from 'react';
import { PersonApi } from './api';

function PersonComponent() {
    const [persons, setPersons] = useState([]);
    const [editedPerson, setEditedPerson] = useState({
        data: {
            first_name: '',
            last_name: '',
        },
        UUID: ''
    });
    const [editablePersonPage, setEditablePersonPage] = useState(false);
    const [newPerson, setNewPerson] = useState({
        first_name: '',
        last_name: '',
        person: '',
    });

    useEffect(() => {
        async function get() {
            try {
                const response = await PersonApi.get();
                setPersons(response.data.persons);
            } catch (error) {
                console.error(error);
            }
        }
        get();
    }, []);

    const handleInputChange = ({ target: { name, value } }) => {
        setNewPerson((prev) => ({ ...prev, [name]: value }));
    };

    const handleInputChangePut = ({ target: { name, value } }) => {
        setEditedPerson((prev) => ({ ...prev, data: { ...prev.data, [name]: value } }));
    };

    const handleModify  = (person) => {
        setEditablePersonPage(true)
        setEditedPerson({
            data: {
                first_name: person.first_name,
                last_name: person.last_name
            },
            UUID: person.UUID
        })
    };


   //POST & GET
    const addPerson = async (e) => {
        e.preventDefault();

        try {
            await PersonApi.post(newPerson)
            const response = await PersonApi.get();
            setPersons(response.data.persons);
        } catch (error) {
            console.error(error)
        }
    };

    //DEL & GET
    const deletePerson = async (uuid) => {
        try {
            await PersonApi.delete(uuid)
            const response = await PersonApi.get();
            setPersons(response.data.persons);
        } catch (error) {
            console.error(error)
        }
    };


    //PUT
    const modifyPerson = async (e) => {
        try {
            await PersonApi.put(editedPerson.UUID, editedPerson.data)
            const response = await PersonApi.get();
            setPersons(response.data.persons);
        } catch (error) {
            console.error(error)
        }
        setEditablePersonPage(false);
        };



    return (
        <div>
            <h2>GET Persons</h2>
            <ul>
                {persons.map((person) => (
                    <li key={person.id}>
                        {person.first_name} {person.last_name} {person.UUID}
                    </li>
                ))}
            </ul>

            <h2>POST Person</h2>
            <form onSubmit={addPerson}>
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

            <h2>DEL Person</h2>
            <ul>
                {persons.map((person) => (
                    <li key={person.id}>
                        <button onClick={() => deletePerson(person.UUID)}>
                            Delete
                        </button>
                        {person.first_name} {person.last_name}
                    </li>
                ))}
            </ul>

            <h2>PUT Person</h2>
            <ul>
                {persons.map((person) => (
                <li key={person.id}>
                    <button onClick={() => handleModify(person)}>
                        Modify
                    </button>
                    {person.first_name} {person.last_name}
                </li>
                ))}
            </ul>

            {editablePersonPage && (
                <div>
                    <div>
                        <h2>Modify Person</h2>
                        <form>
                        <label>
                            First Name:
                            <input
                            type="text"
                            name="first_name"
                            value={editedPerson.data.first_name || ''}
                            onChange={handleInputChangePut}

                            />
                        </label>
                        <br />
                        <label>
                            Last Name:
                            <input
                            type="text"
                            name="last_name"
                            value={editedPerson.data.last_name || ''}
                            onChange={handleInputChangePut}
                            />
                        </label>
                        <br />
                        <button type="button" onClick={modifyPerson}>
                            Save Changes
                        </button>
                        <button type="button" onClick={() => setEditablePersonPage(false)}>
                            Cancel
                        </button>
                        </form>
                    </div>
                </div>
            )}

        </div>
    );
}

export default PersonComponent;