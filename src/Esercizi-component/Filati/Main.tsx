import React from "react";
import ListaFilati from "./MapFilati";
import styled from "./Filati.module.css";
const Filati = () => {
  const arrayFilati = [
    {
      id: 1,
      composizione: "70% Lana 30% Acrilico",
      peso: "50 gr",
      prezzo: 4.6,
    },
    {
      id: 2,
      composizione: "100% Poliestere",
      peso: "100 gr",
      prezzo: 5,
    },
    {
      id: 3,
      composizione: "70% Lana 30% Alpaca",
      peso: "100 gr",
      prezzo: 12,
    },
  ];

  return (
    <div className={styled.stile}>
    <h1 style={{fontStyle: 'initial', textAlign:'center'}}>Filati</h1>
      <ListaFilati lista={arrayFilati} />
    </div>
  );
};
export default Filati;
