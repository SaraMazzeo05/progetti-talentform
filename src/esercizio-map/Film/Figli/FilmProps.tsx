import React from "react";
import { IFilm } from "./IFilm";
import { Fragment } from "react";

const FilmProps:React.FC<IFilm> = (props) => {
  return (
    <Fragment>
        <p>{props.id}</p>
        <p>{props.titolo}</p>
        <p>{props.annoUscita}</p>
    </Fragment>
  )
}
export default FilmProps