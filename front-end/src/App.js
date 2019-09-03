import React from 'react';
import CampingItem from "./CampingItem"


function App() {
  return (
    <div className='app'>
      <CampingItem ItemBrand='MSR' ItemName='Elixar 2' ItemWeight="2.640kg" />
      <CampingItem ItemBrand='Mountain Hardwear' ItemName='Lamina 30F/-1C' ItemWeight="0.985kg" />
      <CampingItem ItemBrand='Thermarest' ItemName='NeoAir Xlite Mattress' ItemWeight="0.358kg" />
      <CampingItem ItemBrand='Gregory' ItemName='Zulu 40' ItemWeight="1.340kg" />
    </div>
  ) 
};

export default App;
  