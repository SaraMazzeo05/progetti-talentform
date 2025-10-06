/// <reference lib="es2015" />
/*let teacher :string = "Fabio";
console.log(teacher);

let arr : string[] = ["ciao", "a", "tutti"];
arr.unshift("primo");
arr.push("ultimo");
console.log(arr);
console.log(arr.pop());
console.log(arr.sort());
console.log(arr.reverse())*/

//Crea un array di interi e stampane ogni elemento.
/*let abc: number[] = [1,2,3,4,5,6];
for (let i = 1; i <= abc.length; i++){
    console.log(i);
}*/

//Calcola la somma di tutti gli elementi di un array.
/*let abc1: number[] = [1, 2, 3, 4, 5, 6];
let somma: number = 0;
for (let i = 0; i < abc1.length; i++) {
  somma += abc1[i];
}
console.log(somma);*/

//Calcola la media aritmetica degli elementi di un array.
/*let numeri: number[] = [1, 2, 3, 4, 5, 6];
let somma1: number = 0;
let avg = 0;
for (let numero of numeri) {
  somma1 += numero;
}
avg = somma1 / numeri.length;
console.log(avg)*/

//Trova il valore massimo in un array di interi.
/*let array1 : number[] = [1,2,3,4,5,6];
let max : number = 0;
for (let numero1 of array1) {
    if (max < numero1) {
        max = numero1
    }
}
console.log(max)*/

//Conta il numero di elementi pari in un array.
/*let array2 : number[]= [1,2,3,4,5];
let pari: number = 0;
for (let i1 = 0; i1 < array2.length; i1++){
    if (array2[i1] %2 == 0) {
        pari++;
    }
}
console.log(pari);*/

//Stampa gli elementi dell’array in ordine inverso.
/*let array3 : number[]= [1,2,3,4,5];
array3.reverse();
console.log(array3);*/

//Scrivi una funzione che prende due numeri e ritorna la loro somma.
/*function somma3(a : number, b : number) :number{
    return a+b;
}
console.log(somma3(2,5));*/

//Scrivi una funzione che riceve un numero e stampa se è pari o dispari
/*function pari1(n : number):void{
    if (n %2 == 0){
        console.log("é pari");
    }else {
        console.log("è dispari");
    }
}
pari1(5);*/

// Scrivi una funzione che prende una stringa e la ritorna in maiuscolo.
/*function str2( stringa3 : string ):string{
    return stringa3.toLocaleUpperCase();
}
console.log(str2("ciao come stai?"));*/

//Scrivi una funzione che ritorna il primo carattere di una stringa.
/*function str3(b : String) : String {
    return b[0];
}
console.log(str3("prova"));*/

//Scrivi una funzione che ritorna il numero di elementi in un array.
/*function arr(x:number[]): number {
    return x.length;
}
console.log(arr([10,20,30,40]));
console.log("");*/

//Traccia: Scrivi una funzione che somma tutti i numeri in un array.
/*function arr1(y:number[]): number {
    let somma = 0;
    for(let i = 0; i < y.length; i++) {
        somma += y[i];
    }
    return somma;
}
console.log(arr1([10,20,30]));
console.log("");*/

//Traccia: Scrivi una funzione che ritorna il maggiore tra due numeri.
/*let max = (a:number,b:number):number => {
  return a>b?a:b;
}
console.log(max(50,30));

// Traccia: Scrivi una funzione che conta quante vocali ci sono in una stringa.
let vocali=(str:string):number=>{
  let count=0;
  for(let i=0;i<str.length;i++){
    if ("aeiouAEIOU".includes(str[i]))
    count++;
  }
  return count;
}
console.log(vocali("Ciao a tutti"));
for (let i in vocali) {
  console.log(vocali[i], i);
}
console.log(vocali("benvenuti a tutti"));
// Traccia: Scrivi una funzione che controlla se un valore è presente in un array.
let n=[1,2,3,4,5,6,7,8,9];
let check=(val:number,n:number[]):number=>{
  return n.indexOf(val);
}
console.log(check(5,n));*/

//
/*enum Stagioni {
    Inverno = "Inverno",
    Primavera = "Primavera",
    Estate = "Estate",
    Autunno = "Autunno"
}
function scegliStagione(s: Stagioni): void {
  switch (s) {
    case Stagioni.Inverno:
      console.log("Brr!");
      break;
    case Stagioni.Primavera:
      console.log("Allergia");
      break;
    case Stagioni.Estate:
      console.log("Lu mare");
      break;
    case Stagioni.Autunno:
      console.log("Cadono le foglie!");
      break;
  }
}

let s: Stagioni = Stagioni.Autunno;
scegliStagione(s);*/

//Type alias con più campi
//Traccia: Definisci un tipo Persona con nome e età.
/*type Persona = {nome : string, eta : number}
const mario : Persona = {nome:"Mario", eta: 30}
console.log(mario);*/

//Crea un tipo Risultato che può essere "success" o "error".
/*type Risultato = "success" | "error";
function unione(r: Risultato): void {
  if (r === "success") {
    console.log("Operazione riuscita");
  } else {
    console.log("Operazione fallita");
  }
}*/

//Crea un tipo Studente e un array di studenti.
/*class Studente {
  nome: string = "";
  cognome: string = "";
  matricola: number | undefined;
  dataDiNascita: string = "";
  luogoDiNascita: string = "";

  constructor(
    nome: string,
    cognome: string,
    matricola: number,
    dataDiNascita: string,
    luogoDiNascita: string
  ) {
    this.nome = nome;
    this.cognome = cognome;
    this.matricola = matricola;
    this.dataDiNascita = dataDiNascita;
    this.luogoDiNascita = luogoDiNascita;
  }
  toString() {
    return JSON.stringify({
      nome: this.nome,
      cognome: this.cognome,
      matricola: this.matricola,
      data_di_nascita: this.dataDiNascita,
      luogo_di_nascita: this.luogoDiNascita,
    });
  }
}

let studenti: Studente[] = [];
studenti.push(new Studente("Mario", "Rossi", 1, "01-01-1980", "Napoli"));
studenti.push(new Studente("Maria", "Verdi", 2, "01-01-1990", "Torino"));

studenti.forEach((valore) => {
  console.log(JSON.parse(valore.toString()));
});*/

//Crea un tipo che rappresenta una funzione somma(a,b).
/*type Numero = number | null;
function somma(a: Numero, b: Numero): Numero {
  if (a != null && b != null) {
    return a + b;
  } else {
    return -1;
  }
}
let res = somma(5, 6);
let res2 = somma(1, null);
console.log(res);
console.log(res2);*/

//Altra soluzione
/*type SommaFn = (a: number, b: number) => number;

const somma: SommaFn = (x, y) => x + y;
console.log(somma(5, 3));*/

//
/*type Composizione = {
    composizione : String;
    costo : number;
}
type Tipologia= {
    colore : string;
    finezza : number;
}
type Filato = Composizione & Tipologia;
const filato : Filato = {
  composizione: '100% Lana',
  costo: 5,
  colore: "Bianco",
  finezza: 4
};

console.log(filato);*/

//Unisci i tipi Persona e Contatti.
/*type Persona ={
    nome: string,
    eta : number
}
type Contatti = {
    telefono: number,
    email: string
}
function persona(){
     const utenti : Persona & Contatti = {
        nome : "Mario",
        eta: 30,
        telefono :123456789,
        email: "mario.rossi@mail.com"
     }
console.log(utenti);
}
persona();*/

//Crea un tipo Studente e uno Indirizzo, poi uniscili.
/*type Studente = {
    nome: string,
    corso: string
}
type Indirizzo = {
    citta : string,
    via : string
}
function studenti(){
    const g : Studente & Indirizzo = {
        nome : "Mario",
        corso : "Archeologia",
        citta : "Agrigento",
        via : "Via dei Dinosauri 7"
    }
console.log(g);
}
studenti()*/

