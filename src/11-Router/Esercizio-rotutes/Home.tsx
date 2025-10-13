import React from 'react'
import { Link } from 'react-router';
const Home = () => {
    const HomePage = 'HOME';
    const subTitle =  'Benevenuti su AutoPazza'
  return (
    <> 
    <body style={{backgroundColor:'#f4d2d4'}}>
        <h2 style={{ backgroundColor: 'lightgray', padding: '0',  margin: '0'}}>
        {HomePage}</h2><br>
        </br>
        <h3 style= {{borderBlock:'auto', borderBlockColor:'purple', textAlign:'center', fontStyle:'italic'}}>
            {subTitle}
        </h3>
    </body>
    <p style={{ textAlign: "center", marginTop: "30%" }}>
        Catalogo qui:
        <Link style={{ color: "orange" }} to="c:/Users/saram/progetti-talentform/src/11-Router/Esercizio-rotutes/ProdottiEse">
          Clicca qui!
        </Link>
        .
      </p>
   </>
  )
}

export default Home