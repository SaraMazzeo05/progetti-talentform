//Scrivi un programma che controlla se un numero è positivo o negativo.
/*let numero = 5;
if (numero > 0) {
  console.log("Il numero è positivo");
} else {
  console.log("Il numero è negativo");
}

//Verifica se un numero è pari o dispari.
if (numero % 2 == 0) {
  console.log("Il numero è pari");
} else {
  console.log("Il numero è dispari");
}*/

//Controlla se un utente è maggiorenne (>=18 anni).
/*let utente = 19;
if (utente >= 18) {
  console.log("L'utente è maggiorenne");
} else {
  console.log("L'utente è minorenne");
}*/

//Controlla se un numero è multiplo di 5.
/*let numero =  25;
if (numero %5 == 0) {
  console.log("Il numero è multiplo di 5");
} else {
  console.log("il numero non è un multiplo di 5");
}*/

//Dato un carattere, controlla se è una vocale o una consonante.
/*let carattere = "b";
if (carattere == "a" || carattere == "e" || carattere == "i" || carattere == "o" || carattere == "u" || carattere == "y") {
  console.log("Il carattere è una vocale");
} else {
  console.log("Il carattere è una consonante");
}*/

//Controlla se un numero è compreso tra 10 e 100.
/*let numero = 99;
if (numero >= 10 && numero <= 100) {
  console.log ("Il numero è compreso");
}else {
  console.log("Il tuo numero non è compreso");
}*/

//Dato il voto di uno studente, stampa "promosso" se >= 6, altrimenti "bocciato".
/*let studente = 7;
if (studente >= 6) {
  console.log("Sei promosso");
} else {
  console.log("Sei bocciato");
}

//Verifica se due numeri sono uguali
let numero = 6;
let numero2 = 9;
if (numero == numero2) {
  console.log("I numeri sono uguali");
} else {
  console.log("I numeri non sono ugluali");
}*/

//Stabilisci il maggiore tra due numeri interi.
/*let numero = 5;
let numero2 = 7;
if (numero > numero2) {
  console.log(numero + " è maggiore di " + numero2);
} else {
  console.log(numero + " è minore di " + numero2);
}

//Verifica se una stringa è vuota.
let a = "";
if (a.length == 0) {
  console.log("è vuota");
} else {
  console.log("non è vuota");
}*/

//Scrivi un programma che stampa i numeri da 1 a 10 usando un ciclo for.
/*let num;
for (num = 1; num, num <= 10; num++) {
  console.log(num);
}*/

//Scrivi un programma che calcola la somma dei numeri da 1 a 100 usando un ciclo for
/*let somma = 0;
for (num =1; num <= 100; num++) 
  somma += num;
  console.log(somma);
*/

//Scrivi un programma che stampa la tabellina del 7 (da 1×7 a 10×7).
/*let tabellina = 7;
for (i = 1; i <= 10; i++) 
  console.log(i*tabellina);
*/
//Scrivi un programma che stampa i numeri pari da 2 a 20.
/*for (let j =2; j <=20; j +=2){
                    console.log(j);
                  }
                    */
//Scrivi un programma che stampa tutti i numeri da 1 a 50 divisibili per 3.
/*let num;
for (num = 1; num <= 50; num++) {
  if (num % 3 == 0) {
    console.log(num);
  }
}*/

//Stampa il quadrato di ogni numero da 1 a 10 (es: 1² = 1, 2² = 4, ecc.).
/*let num;
for (num = 1; num <= 10; num++) console.log(num + "^2=" + num * num);
*/

//Calcola e stampa la somma dei primi n numeri dispari (es. n = 5 → 1 + 3 + 5 + 7 + 9 = 25).
/*let n = 5;
let somma = 0;
let numero = 1;
for (i = 1; i <= n; i++) {
  somma += numero;
  numero += 2;
}
console.log("Somma primi " + n + " numeri dispari " + somma);
*/

//Dato base = 2 ed esponente = 5, calcola 2 elevato a 5
/*let base = 2;
let esponente = 5;
let calcolo = 1;
for (i = 0; i < esponente; i++){
  calcolo *=base;
}
console.log(calcolo);
*/

//Scrivi un programma che stampa tutti i numeri primi da 2 a 100 usando solo for.
/*for (i = 2; i <= 100; i++) {
  let primo = true;
    for( n = 2; i <= i/2; n++) {
      if(i %1 == 0) {
        let primo= false;
        break;
      }
    }
    if (primo)
      console.log(i+"")
}*/

// stampa da 1 a 10
/*let num = 1;
while(num <= 10) {
    console.log(num);
    num++;
}*/
//Scrivi un programma che calcola la somma dei numeri da 1 a 100 usando while.
/*let num = 1;
let somma = 0;
while(num7 <= 100) {
    sum2 += num7;
    num7 ++;
}
console.log(sum2);
*/
//Scrivi un programma che stampa tutti i numeri pari da 2 a 20 usando while.
/*num8 = 1;
while(num8 <= 20) {
    if(num8 % 2 == 0) {
        console.log(num8);
    }
    num8++;
}*/

//Scrivi un programma che calcola il fattoriale di 5 usando while.
/*let i5 = 1;
while(i5 <= 10){
    console.log(i5 + " x 4 = " + i5*4);
    i5++;
}*/

//Stampa la tabellina del 4 da 1×4 a 10×4 usando while.
/*let num = 1;
while (num <= 10) {
  console.log(num+ " x 4 = "+num *4);
  num++;
}*/

//Scrivi un programma che calcola quante cifre ha un numero intero positivo (es. numero = 3456 ha 4 cifre).
/*let numero = 3456;
let conta = 0;
while (numero > 0) {
  numero = Math.floor(numero/10);
  conta++;
}
console.log("Il numero: " + numero + " ha " + conta + " cifre.");
*/

//Scrivi un programma che calcola la somma delle cifre di un numero intero positivo.
//Scrivi un programma che inverte un numero intero positivo.
//Esempio: 1234 → 4321
/*let numero = 1234;
let invertito = 0;
while (numero > 0) {
  let cifra = numero % 10;
  invertito = invertito * 10 + cifra;
  numero = parseInt(numero / 10);
}
console.log(invertito);*/

//Scrivi un programma che stampa tutti i divisori di un numero intero positivo.
//Esempio: n = 12 → 1 2 3 4 6 12

/*
let num = 5;
let count = num;
let primo = true;
while (count > 2) {
  count--;
  //   primo = true;
  if (num % count == 0) {
    primo = false;
    break;
  }
}
// console.log("Il numero " + num + "è: " + primo ? " PRIMO" : " NON PRIMO");
if (primo) {
  console.log(num + " è primo.");
} else {
  console.log(num + " non è primo.");
}*/

//Scrivi un programma che stampa i numeri da 1 a 10 usando do-while.
/*let num = 1;
do {
  console.log(num);
  num++;
} while (num <= 10);
 */

//Scrivi un programma che somma i numeri da 1 a 100 usando do-while.
/*let somma = 0;
let num = 1;
do {
  somma += num;
  num++;
} while (num <= 100);
console.log(somma);
*/

//Scrivi un programma che stampa la tabellina del 5 da 1×5 a 10×5.
/*let num = 1;
do {
  console.log(num+ " x 5 = " + num*5)
  num++;
}while (num<=10)
*/
//Scrivi un programma che stampa i numeri pari da 2 a 20 usando
/*let num = 2;
do {
  if (num % 2 == 0) {
    console.log(num);
  }
  num++;
} while (num <= 20); */

//Scrivi un programma che conta quante cifre ha un numero intero positivo, ad esempio n = 12345 ha 5 cifre.
/*let n = 12345;
let conta = 0;
do {
  n = Math.floor(n / 10);
  conta++;
} while (n > 0);
console.log("Il numero ha " + conta + " cifre.");*/

//Scrivi un programma che somma tutte le cifre di un numero intero positivo.
//Esempio: 456 → 4 + 5 + 6 = 15.
/*let somma = 0;
let cifre = 456;
do {
  let cifra = cifre % 10;
  somma += cifra;
  cifre = Math.floor(cifre / 10);
} while (cifre > 0);
console.log("La somma delle cifre è di: " + somma);
*/

//Usa uno switch per stampare il giorno della settimana dato un numero da 1 a 7.
/*let giorno = 3;
switch (giorno) {
  case 1:
    console.log("Lundedì");
    break;
   case 2:
    console.log("Martedì");
    break;
   case 3:
    console.log("Mercoledì");
    break;
   case 4:
    console.log("Giovedì");
    break;
   case 5:
    console.log("Venerdì");
    break;
   case 6:
    console.log("Sabato");
    break;
   case 7:
    console.log("Domenica");
    break;
}*/

//Usa uno switch per stampare la stagione dato un mese (es. 1 = gennaio = inverno).
/*let mese = 3;
switch (mese) {
  case 11: case 9: case 10:
  console.log("Autunno")
  break;
  
  case 12: case 1: case 2:
  console.log("Inverno")
  break;

  case 3: case 4: case 5:
  console.log("Primavera")
  break;
  
  case 6: case 7: case 8:
  console.log("Estate")
  break;
  default:
    break;
}*/

//Dato un codice prodotto, usa uno switch per mostrare nome e prezzo
/*let codice = "A001";
switch (codice) {
  case "A001":
    console.log("Bagnoschiuma");
    break;
  case "A002":
    console.log("Crema corpo");
    break;
  case "A003":
    console.log("Dentifricio");
    break;
  default:
    break;
}*/

//Simula una calcolatrice base con switch (+, -, *, /).
/*let numero1 = 5;
let numero2 = 3;
let operazione = 1;
let risultato = 0;
switch (operazione) {
  case 1:
    console.log(numero1+numero2);
    break;
  case 2:
    console.log(numero1-numero2);
    break;
  case 3:
    console.log(numero1/numero2);
    break;
  case 4:
    console.log(numero1*numero2);
    break;
  default:
    break;
}*/

//Scrivi un programma che usa if per verificare l'età, e switch per decidere il tipo di biglietto (es. junior, adulti, senior).
/*let eta = 35;
let biglietto;
if(eta <= 18) {
    biglietto = "junior";
} else if(eta <= 45) {
    biglietto = "adulto";
} else {
    biglietto = "senior";
}
switch(biglietto) {
    case "junior":
        console.log("Biglietto junior: 5,99€");
        break;
    case "adulto":
        console.log("Biglietto per adulti: 10,50€");
        break;
    case "senior":
        console.log("Biglietto per senior: 7,80€");
        break;
    default:
        console.log("Biglietto invalido");
}*/
//Usa uno switch per stampare il nome del mese e con if stampa se ha 31 o 30 giorni.
/*let mese1 = 4;
switch(mese1) {
    case 4: case 6: case 9: case 11:
        console.log("Il mese è di 30 giorni");
        break;
    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        console.log("Il mese è da 31 giorni");
        break;
    default:
        console.log("Siamo a Febbraio");
}*/

//Dato un voto in lettere (A, B, C, ecc.), stampa con switch il valore numerico equivalente.
/*let voto = "C";
switch(voto) {
    case "A":
        console.log("Il voto preso rientra tra 80 e 100");
        break;
    case "B":
        console.log("Il voto preso rientra tra 60 e 80");
        break;
    case "C":
        console.log("Rimandato, il voto è al di sotto dei 60");
        break;
    case "D":
        console.log("Bocciato");
        break;
    default:
        console.log("Test non ancora eseguito");
}*/

//Crea una simulazione bancomat: con if verifica il PIN, con switch scegli l’operazione.
/*
let saldo = 6000;
let pin = 1234;
let ope = 2;
let cifra;
let ultima_operazione = 2;

if (pin == 1234) {
  switch (ope) {
    case 1:
      console.log("hai scelto prelievo");
      cifra = 50;
      saldo -= cifra;
      ultima_operazione = 1;
      console.log(saldo: ${saldo});
      if (ultima_operazione != 0) {
        if (ultima_operazione == 1) {
          console.log("ultima operazione: prelievo");
        } else {
          console.log("ultima operazione: deposito");
        }
      }
      break;

    case 2:
      console.log("hai scelto deposito");
      cifra = 100;
      saldo += cifra;
      ultima_operazione = 2;
      console.log(saldo: ${saldo});
      if (ultima_operazione != 0) {
        if (ultima_operazione == 1) {
          console.log("ultima operazione: prelievo");
        } else {
          console.log("ultima operazione: deposito");
        }
      }
      break;

    case 3:
      console.log(saldo: ${saldo});
      if (ultima_operazione != 0) {
        if (ultima_operazione == 1) {
          console.log("ultima operazione: prelievo");
        } else {
          console.log("ultima operazione: deposito");
        }
      }

    default:
      break;
  }
} else {
  console.log("pin non valido!");
}*/
//Dato un segno zodiacale ("Ariete", "Toro", ecc.), usa switch per stampare il mese corrispondente.
/*
let s = "Toro";

switch (s) {
  case "Acquario":
    console.log("gennaio");
    console.log("febbraio");
    break;

  case "Pesci":
    console.log("febbraio");
    console.log("marzo");
    break;

  case "Ariete":
    console.log("marzo");
    console.log("aprile");
    break;

  case "Toro":
    console.log("aprile");
    console.log("maggio");
    break;

  case "Gemelli":
    console.log("maggio");
    console.log("giugno");
    break;

  case "Cancro":
    console.log("giugno");
    console.log("luglio");
    break;

  case "Leone":
    console.log("luglio");
    console.log("agosto");
    break;

  case "Vergine":
    console.log("agosto");
    console.log("settembre");
    break;

  case "Bilancia":
    console.log("settembre");
    console.log("ottobre");
    break;

  case "Scorpione":
    console.log("ottobre");
    console.log("novembre");
    break;

  case "Saggitario":
    console.log("novembre");
    console.log("dicembre");
    break;

  case "Capricorno":
    console.log("dicembre");
    console.log("gennaio");
    break;

  default:
    console.log("non trovato");
    break;
}*/


