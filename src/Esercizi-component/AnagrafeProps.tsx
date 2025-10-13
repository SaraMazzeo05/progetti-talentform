import React from "react";
import AnagraficaProp from "../1-Introduction/7-passing-data props/AnagraficaProp";
import AnagrafeArray from "./Figli-component/AnagrafeArray";

const AnagrafeProps = () => {
  const arr = [
    {
      id: 1,
      nome: "Matteo",
      cognome: "Di Paola",
      eta: 22,
    },
    {
      id: 2,
      nome: "Giovanni",
      cognome: "Rossi",
      eta: 32,
    },
    {
      id: 3,
      nome: "Matteo",
      cognome: "Verdi",
      eta: 28,
    },
  ];
  return (
    <div>
      <AnagrafeArray persona={arr} />
    </div>
  );
};

export default AnagrafeProps;