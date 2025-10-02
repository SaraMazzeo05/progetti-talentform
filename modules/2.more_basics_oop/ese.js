/*let stringa = "COME STAI?";
console.log(stringa.toLocaleLowerCase());
let stringa2 = "come stai?";
console.log(stringa2.toLocaleUpperCase());*/

/*let stringa = "ciao";
let stringa2 = "come stai?";
console.log(stringa.concat(" " + stringa2));
*/

/*str = "ciao Ciao";
let str2 = str.replace("Ciao", "come stai?"); 
console.log(str2);*/

/*Dato un numero intero, stampa il suo valore assoluto.
Calcola 2 elevato alla 5 utilizzando Math.pow.
Trova la radice quadrata di 49.
Arrotonda il numero 3.6.
Stampa il maggiore tra 15 e 27.
let a = 18;
console.log(Math.abs(a));
console.log(Math.pow(2,5))
console.log(Math.sqrt(40))
console.log(Math.max(15,27))*/

//Stampa il minore tra 23 e 12.
//console.log(Math.min(23,12))

//Stampa la differenza assoluta tra 20 e 35.
//console.log(Math.abs(20-35))
//Stampa il floor e il ceil di 3.7.
//console.log(Math.floor(3,7))

//
/*let data = new date;
console.log(data.getDay());
console.log(data.get)*/

// Data Odierna
//let oggi = new Date();
//console.log("La data odierna e': " + oggi);

// // Set Data 24 Dicembre
// let data = new Date("December 24, 2025 18:30:00");
// console.log("Data: " + data);

// //Aggiungi 7 giorni alla data precedentemente settata
// data.setDate(data.getDate() + 7);
// console.log("La nuova data e': " + data);

//crea array di un prodotto
/*let prodotti = ["Bagnoschiuma","Spazzolino","Dentifricio"]
console.log(prodotti)
console.log(prodotti[1])
for(i = 0; i < prodotti.length; i++){
    console.log(prodotti[i])
}*/

//aggiungi
/*let frutta = ["Banane", "Fragole", "Mele"]
frutta.push("Arancie");
console.log(frutta)*/

//rimuovi
/*let frutta = ["Banane", "Fragole", "Mele", "Arancie"]
frutta.pop();
frutta.pop();
console.log(frutta)*/

//aggiungi in prima posizione
/*let frutta = ["Banane", "Fragole", "Mele", "Arancie"]
frutta.unshift("Meloni")
console.log(frutta)
//aggiungi due elementi all'indice 3
frutta.splice(3,0, "Nespole", "Mango")
console.log(frutta)
*/

//Scrivi una funzione che prende una stringa e la ritorna in maiuscolo.
/*function str(strMaiusc) {
    return strMaiusc.toUpperCase()
}
console.log(str("Stringa di prova"))*/

// Scrivi una funzione che ritorna il primo carattere di una stringa.
/*function primoCarattere(stringa) {
    return stringa.charAt(0);
}
console.log(primoCarattere("prova"));*/

//Traccia: Scrivi una funzione che ritorna l’ultimo carattere di una stringa.
/*function ultimoCar(stringa) {
    return stringa(stringa.length -1)
}
console.log(ultimoCar("ciao"))*/

//Scrivi una funzione che somma tutti i numeri in un array.
//Scrivi una funzione che ritorna il numero di elementi in un array.
/*function lunghezzaArray(array) {
  return array.length;
}
console.log(lunghezzaArray([1, 2, 3, 4]));*/

//Scrivi una funzione che somma tutti i numeri in un array.
/*function sommaNumeri(num) {
    let somma =0;
    for (let i of num) {
        somma+= i;
    }
    return somma;
}
console.log(sommaNumeri([1,2,3,4,5,6,7,8,9]))*/

//Scrivi una funzione che ritorna il maggiore tra due numeri.
/*function maggiore(a,b){
    if (a > b){
        return a;
    }else {
        return b;
    }
}
let a = 4;
let b = 2;
console.log(maggiore(a,b))*/

//Scrivi una funzione che ritorna la stringa al contrario.
/*function invertiStringa(str){
    return str.split("").reverse().join();
}
console.log(invertiStringa("Nicola Narducci"));*/

//Scrivi una funzione che conta quante vocali ci sono in una stringa.
/*function getFattoriale(numero) {
    let f = numero;
    for (let i=1; i<numero; i++) {
        f *= i;
    }
    return f;
}
//Scrivi una funzione che conta quante vocali ci sono in una stringa.
function getNumeroVocali(stringa) {
    let n = 0;
    for(let c of stringa) {
        switch (c) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
                n++;
                break;
            default:
                break;
        }
    }
    return n;
}
//Scrivi una funzione che controlla se un numero è primo.
//un numero è primo quando è divisibile solo per se stesso e per 1
function getCheckPrimo(numero) {
    let check = true;
    for (let i=2; i<numero; i++) {
        if (numero % i == 0) { 
            check = false;
            break;
        }
    }
    return check;
}
console.log("fattoriale = ".concat(getFattoriale(120)));
console.log("le vocali sono = ".concat(getNumeroVocali("prova")));
console.log("il numero è: ".concat(getCheckPrimo(7) ? "primo" : "non primo"))*/

//Scrivi una funzione che stampa la tabellina di un numero fino a 10.
/*function tabellina() {
    for (let i = 1; i <=10 ; i++) {
        console.log(10*i);
    }
}
tabellina();
//Scrivi una funzione che controlla se un valore è presente in un array.
function check(arr,value) {
    return arr.includes(value)
}
console.log(check([1,2,3,4,5],2))*/