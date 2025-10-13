import React from "react";
import FilmProps from "./FilmProps";
import { IFilm } from "./IFilm";

type Film = IFilm[];

const ListaFilm: React.FC<{lista2:Film}> = (props) => {
    return (
        <div>
    {props.lista2.map((e) => (
        <FilmProps key={e.id} id={e.id} titolo={e.titolo} 
        annoUscita={e.annoUscita} />
    ))}
    </div>
    );
}
export default ListaFilm