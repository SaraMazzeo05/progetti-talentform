import React, { Component } from 'react'

export class Prodotti extends Component<{cod? : number, nome? : string, prezzo? : number}> {
    state = {
        cod: 1,
        nome: 'Dentifricio',
        prezzo: 1.20
    };
  render() {
    return (
      <div>
        <p>{this.state.cod}</p>
        <p>{this.state.nome}</p>
        <p>{this.state.prezzo}</p>
        <button onClick={()=> console.log(this.state)}
        > Acquista</button>
      </div>
    )
  }
}
export default Prodotti