import React from 'react';
import './App.css';
import PersonComponent from './components/personComponent.js';
import BikeComponent from './components/bikeComponent.js'; 

function App() {
  return (
    <div className="two-columns-container">
      <div className="person-component">
        <h2>PersonComponent</h2>
        <PersonComponent/>
      </div>
      <div className="person-component">
      <h2>BikeComponent</h2>
        <BikeComponent/>
      </div>
    </div>
  );
}

export default App;
