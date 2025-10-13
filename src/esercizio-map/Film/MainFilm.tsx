import React, { Fragment } from "react";
import ListaFilm from "./Figli/MapFilm";
import styled from "./Figli/Film.module.css"

const MainFilm = () => {
  const arrayFilm = [
    {
      id: 1,
      titolo: "Una vita al massimo",
      annoUscita: 1993,
    },
    {
      id: 2,
      titolo: "Inception",
      annoUscita: 2010,
    },
    {
      id: 3,
      titolo: "Memento",
      annoUscita: 2000,
    },
    {
      id: 4,
      titolo: "Her",
      annoUscita: 2013,
    },
  ];
  return (
    <Fragment>
    <div className={styled.stile}>
        <p>Ecco i film</p>
        <ListaFilm lista2={arrayFilm} />
    </div>
    </Fragment>
  );
};
export default MainFilm;
