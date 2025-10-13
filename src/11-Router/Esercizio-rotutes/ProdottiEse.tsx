import React from "react";


const ProdottiEse = () => {
  return (
    <React.Fragment>
        <h3
          style={{ color: "orange", fontSize: "larger", textAlign: "center" }}
        >
          Elenco prodotti
        </h3>
        <ul
          style={{ fontFamily:'cursive', marginLeft: "42%" }}
        >
          <li>Cavi per batteria</li>
          <li>Batteria</li>
          <li>Cinghia di distribuzione</li>
          <li>Olio</li>
        </ul>
    </React.Fragment>
  )
}

export default ProdottiEse