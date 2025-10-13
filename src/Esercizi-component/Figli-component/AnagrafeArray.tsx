import React from "react";
import AnagraficaProp from "../../1-Introduction/7-passing-data props/AnagraficaProp";
import { IPersona } from "../../1-Introduction/model/IPersona";
import "./Anagrafe.css";

type Persona = IPersona[];

const AnagrafeArray: React.FC<{ persona: Persona }> = (props) => {
  return (
    <div className="anagrafe">
      <AnagraficaProp
        nome={props.persona[0].nome}
        cognome={props.persona[0].cognome}
        eta={props.persona[0].eta}
      />

      <AnagraficaProp
        nome={props.persona[1].nome}
        cognome={props.persona[1].cognome}
        eta={props.persona[1].eta}
      />

      <AnagraficaProp
        nome={props.persona[2].nome}
        cognome={props.persona[2].cognome}
        eta={props.persona[2].eta}
      />
    </div>
  );
};

export default AnagrafeArray;