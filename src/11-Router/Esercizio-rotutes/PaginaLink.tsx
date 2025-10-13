import React from "react";
import { createBrowserRouter, RouterProvider } from "react-router-dom";
import Home from "./Home";
import ProdottiEse from "./ProdottiEse";

const router = createBrowserRouter([
  { path: "c:/Users/saram/progetti-talentform/src/11-Router/Esercizio-rotutes/Home", element: <Home/> },
  { path: "c:/Users/saram/progetti-talentform/src/11-Router/Esercizio-rotutes/ProdottiEse", element: <ProdottiEse/> },
]);

const PaginaLink = () => {
  return <RouterProvider router={router} />;
};

export default PaginaLink;