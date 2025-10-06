// Generics con più parametri
// Traccia: Crea una funzione che combina due valori generici in una tupla.
function combina(first, second) {
    return [first, second];
}
var result4 = combina("Nicola", 24);
console.log(result4);
// Mapper generico
// Traccia: Crea una funzione che trasforma un array generico con map.
function mapArray(arr, transform) {
    return arr.map(transform);
}
var numeri = [1, 2, 3, 4];
var double = mapArray(numeri, function (n) { return n * 2; });
console.log(double);
function general(b) {
    return b;
}
var number = general(6.5);
console.log(number);
{
    // Traccia: Crea una funzione che accetta un array generico e ne restituisce la lunghezza.
    function arrLun(arr) {
        return arr.length;
    }
    console.log(arrLun([1, 23, 4, 5, 6, 7, 8, 9]));
    console.log(arrLun(["a", "b", "c"]));
}
console.log("________________________________________________________________");
{
    // Traccia: Crea una funzione che accetta un array di tipo generico e stampa ogni elemento.
    function stampaArr(arr) {
        arr.forEach(function (a) { return console.log(a); });
    }
    console.log("PRIMO");
    stampaArr([1, 2, 3, 4, 5, 6]);
    console.log("SECONDO");
    stampaArr(["a", "b", "c"]);
}
