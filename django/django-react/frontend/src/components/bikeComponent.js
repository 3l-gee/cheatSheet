import React, { useState, useEffect} from 'react';
import { BikeApi } from './api';

function BikeComponent() {
    const [bikes, setBikes] = useState([]);
    const [editedBike, setEditedBike] = useState({
        data: {
            bike_type: '',
            bike_size: '',
            person: '',
        },
        UUID: ''
    });
    const [editableBikePage, setEditableBikePage] = useState(false);
    const [newBike, setNewBike] = useState({
        bike_type: '',
        bike_size: '',
        person: '',
    });

    useEffect(() => {
        async function get() {
            try {
                const response = await BikeApi.get();
                setBikes(response.data.bikes);
            } catch (error) {
                console.error(error);
            }
        }
        get();
    }, []);

    return (
        <div>
            <h2>GET Bikes</h2>
            <ul>
                {bikes.map((bike) => (
                    <li key={bike.id}>
                        {bike.bike_type} {bike.bike_size} {bike.person} {bike.UUID}
                    </li>
                ))}
            </ul>
        </div>
    )
}

export default BikeComponent;