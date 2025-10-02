let num = 5;
let str = "fabio";
let bool = true;
let obj = {};
let fun = function () {};
let nan = isNaN;//verifica se il parametro inserito è un numero e restituisce un valore booleano
console.log(typeof num);
console.log(typeof str);
console.log(typeof bool);
console.log(typeof obj);
console.log(typeof fun);
console.log(isNaN("STRING")); // ritorna true se al parametro il valore non e' un numero
