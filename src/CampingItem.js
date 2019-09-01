import React from 'react';
import './App.css'

function campingItem({ItemBrand, ItemName, ItemWeight}) {
    return (
        <div className='CampingItem'>
            <h2>{ItemBrand} {ItemName}</h2>
            <h3>{ItemWeight}</h3>
      </div>
    );
}

export default campingItem;
