import React from "react";
import Figlio1 from "./Figli-component/Figlio1";
const Padre = () => {

  const a = "Maria";
  const b = 34;

  return (
    <div>
      <p>Sono il padre</p>
      <div>
        <h1> {a}</h1>
        <h2>{b}</h2>
      </div>

      <div>
        <Figlio1 />
        <Figlio1 />
      </div>
      <br />
      <Figlio1 />
    </div>
  );
};

export default Padre;