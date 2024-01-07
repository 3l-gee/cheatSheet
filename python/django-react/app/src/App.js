import React from 'react';
import './App.css';
import PersonComponent from './components/personComponent.js';

function App() {
  return (
    <div className="two-columns-container">
      <div className="person-component">
        <h2>PersonComponent</h2>
        <PersonComponent/>
      </div>
      <div className="person-component">
      <h2>BikeComponent</h2>
        <PersonComponent/>
      </div>
    </div>
  );
}

export default App;
