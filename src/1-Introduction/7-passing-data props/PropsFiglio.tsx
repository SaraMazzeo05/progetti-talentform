import { IProdotti } from "../model/IProdotti";

const PropsFiglio: React.FC<IProdotti> = (props) => {
  return (
    <div>
      <ul>
        <li>{props.id}</li>
        <li>{props.brand}</li>
        <li>{props.prezzo}</li>
        <li>{props.colore}</li>
        <li>{props.composizione}</li>
        <li>{props.peso}</li>
      </ul>
    </div>
  );
};
export default PropsFiglio;