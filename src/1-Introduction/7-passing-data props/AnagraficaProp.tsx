import React from "react";
import { IPersona } from "../model/IPersona";
const AnagraficaProp: React.FC<IPersona> = (persona) => {
  return (
    <div>
      <h1>NOME: {persona.nome} </h1>
      <h4>COGNOME: {persona.cognome} </h4>
      <h4>ETA: {persona.eta} </h4>
    </div>
  );
};

export default AnagraficaProp;