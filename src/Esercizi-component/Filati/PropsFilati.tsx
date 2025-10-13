import React from "react";
import { IFilati } from "./IFilati";

const PropsFilati: React.FC<IFilati> = (props) => {
  return (
    <div>
        <ol>
            <li>{props.id}</li>
            <li>{props.composizione}</li>
            <li>{props.peso}</li>
            <li>{props.prezzo}</li>
        </ol>
    </div>
  )
}

export default PropsFilati;