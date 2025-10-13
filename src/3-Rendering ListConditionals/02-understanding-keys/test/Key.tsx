import React from "react";
const Product:React.FC<{brand:string, prodotto: string, color: string}>=(props)=> {
    return <ul>
      <li>{ props.brand }</li>
      <li>{ props.prodotto}</li>
      <li>{props.color}</li>
          </ul>
  }

export default function Key() {
  const products = [{id:1,brand: 'Dior', prodotto: 'Felpa con zip', color: 'Bianca'}, 
    {id:2,brand: 'Givenchy', prodotto: 'Tubino', color: 'Nero'},
    {id:3,brand: 'Chanel', prodotto: 'Pochette', color: 'Viola prugna'}
  ];
  return (
    <div>

      <h1>My product</h1>
      <ul>
        {products.map((product) => <Product key={product.id}
          brand={product.brand} prodotto={product.prodotto} color={product.color}
        />)}
      </ul>
    </div>
  );
}
