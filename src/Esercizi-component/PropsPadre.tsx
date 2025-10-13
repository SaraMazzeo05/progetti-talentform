import React from 'react'
import PropsFiglio from '../1-Introduction/7-passing-data props/PropsFiglio'

const PropsPadre =() =>{
    const prodotti = () => [
        {
            id:1,
            brand: 'Italia-Filati',
            prezzo: 4.5,
            colore: 'Grigio topo',
            composizione: 'Acrilico 70% Lana 30%',
            peso:'100gr'
        },
         {
            id:2,
            brand: 'Italia-Filati',
            prezzo: 7,
            colore: 'Blu notte',
            composizione: 'Lana merino 100%',
            peso:'50gr'
        },
        {
            id:3,
            brand: 'Italia-Filati',
            prezzo: 8,
            colore: 'Blu notte',
            composizione: 'Poliestere 100%',
            peso:'100gr'
        }

    ]
  return (
    <div>
        <PropsFiglio id={prodotti()[0].id} brand={prodotti()[0].brand} prezzo={prodotti()[0].prezzo} colore={prodotti()[0].colore} 
        composizione={prodotti()[0].composizione} peso={prodotti()[0].peso} />
        <PropsFiglio id={prodotti()[1].id} brand={prodotti()[1].brand} prezzo={prodotti()[0].prezzo} colore={prodotti()[0].colore} 
        composizione={prodotti()[1].composizione} peso={prodotti()[1].peso} />
        <PropsFiglio id={prodotti()[2].id} brand={prodotti()[2].brand} prezzo={prodotti()[0].prezzo} colore={prodotti()[0].colore} 
        composizione={prodotti()[2].composizione} peso={prodotti()[2].peso} />
    </div>
  )
}
export default PropsPadre;
