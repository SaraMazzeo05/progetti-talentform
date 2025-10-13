import React from "react";
import { IFilati } from "./IFilati";
import PropsFilati from "./PropsFilati";

type filati = IFilati[];

const ListaFilati: React.FC<{lista:filati}> = (props) => {
    return (
        <div>
    {props.lista.map((e) => (
        <PropsFilati key={e.id} id={e.id} composizione={e.composizione} 
        peso={e.peso} prezzo={e.prezzo} />
    ))}
    </div>
    );
}
export default ListaFilati;








/*const fialtiApp = () => {
  const listaFilati = [
        {id : 1, composizione: '70% Lana 30% Acrilico', peso : "50 gr", prezzo : (4.5)},
        {id : 2, composizione: '100% Poliestere', peso : "100 gr", prezzo : (5)},
        {id : 3, composizione: '70% Lana 30% Acrilico', peso : "50 gr", prezzo : (4.5)}
  ];

  return (
    <div>
      <ul>
        {listaFilati.map((listaFilati) => (<PropsFilati key={listaNome.id} nome={listaNome.nome} eta={listaNome.eta} />))}
      </ul>
    </div>
  )
}
export default fialtiApp;*/