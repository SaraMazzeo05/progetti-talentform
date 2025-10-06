// Generics con più parametri
// Traccia: Crea una funzione che combina due valori generici in una tupla.
/*function combina<T, U>(first: T, second: U): [T, U]{
    return[first, second];
}
const result4 = combina("Nicola", 24);
console.log(result4);

// Mapper generico
// Traccia: Crea una funzione che trasforma un array generico con map.
function mapArray<T, U>(arr: T[], transform: (item: T) => U) : U[] {
    return arr.map(transform);
}
const numeri = [1,2,3,4];
const double = mapArray(numeri, n => n*2);
console.log(double);
 function general<T> ( b: T) : T {

     return b;
  }
    let number = general<number>(6.5);

    console.log(number);
{
  // Traccia: Crea una funzione che accetta un array generico e ne restituisce la lunghezza.
  function arrLun<T>(arr: T[]): number {
    return arr.length;
  }
  console.log(arrLun<number>([1, 23, 4, 5, 6, 7, 8, 9]));
  console.log(arrLun<string>(["a", "b", "c"]));
}
console.log("________________________________________________________________");
{
  // Traccia: Crea una funzione che accetta un array di tipo generico e stampa ogni elemento.

  function stampaArr<T>(arr: T[]): void {
    arr.forEach((a) => console.log(a));
  }
  console.log("PRIMO");
  stampaArr<number>([1, 2, 3, 4, 5, 6]);
  console.log("SECONDO");
  stampaArr<string>(["a", "b", "c"]);
}*/



