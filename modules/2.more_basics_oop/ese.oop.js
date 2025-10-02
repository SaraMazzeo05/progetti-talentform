/*class Psicologa {
  reditoAnnuoLordo = 0;
  coefRedd = 0;
  aliquotaInps = 0;
  aliquotaIrpef = 0;

  constructor(reditoAnnuoLordo, coefRedd, aliquotaInps, aliquotaIrpef) {
    this.aliquotaInps = aliquotaInps;
    this.aliquotaIrpef = aliquotaIrpef;
    this.reditoAnnuoLordo = reditoAnnuoLordo;
    this.coefRedd = coefRedd;
  }

  getUtileTasse() {
    return (this.reditoAnnuoLordo * this.coefRedd) / 100;
  }

  getIrpef() {
    return (this.aliquotaIrpef * this.getUtileTasse()) / 100;
  }

  getInps() {
    return (this.aliquotaInps * this.getUtileTasse()) / 100;
  }

  getUtileNetto() {
    return this.reditoAnnuoLordo - (this.getInps() + this.getIrpef());
  }
}

let ps1 = new Psicologa(30000, 78, 26, 15);
console.log("inps " + ps1.getInps());
console.log("irpef " + ps1.getIrpef());
console.log("utile già tassato " + ps1.getUtileNetto());

class Artigiano extends Psicologa {
  importoEccedente = 0;
  costoFissoInps = 0;

  constructor(
    reditoAnnuoLordo,
    coefRedd,
    aliquotaInps,
    aliquotaIrpef,
    importoEccedente,
    costoFissoInps
  ) {
    //parametri per la classe padre
    super(reditoAnnuoLordo, coefRedd, aliquotaInps, aliquotaIrpef);

    //parametri per this
    this.importoEccedente = importoEccedente;
    this.costoFissoInps = costoFissoInps;
  }

  getInps() {
    return (
      this.getUtileTasse() * this.aliquotaInps +
      this.getUtileTasse() * this.aliquotaIrpef
    );
  }

  getUtileEccedente() {
    return (
      ((this.reditoAnnuoLordo - this.importoEccedente) * this.coefRedd) / 100
    );
  }

  getInps() {
    return (this.getUtileEccedente() * this.aliquotaInps) / 100;
  }

  getRedditoNetto() {
    console.log("annuo lordo = " + this.reditoAnnuoLordo);
    console.log("ral " + this.coefRedd);
    return (
      this.reditoAnnuoLordo -
      (this.getIrpef() + this.getInps() + this.costoFissoInps)
    );
  }
}

let artigiano = new Artigiano(90000, 67, 24, 15, 15000, 3500);
console.log(artigiano.getRedditoNetto());*/

/*class BankAccount {
  balance = 0;
  firstDeposit = 0;
  firstDraw = 0;
  secondDeposit = 0;
  secondDraw = 0;
  canoneAnnuo = 0;

  getFirstDeposit(balance = 0, firstDeposit = 500) {
    return balance + firstDeposit;
  }
  getFirstDraw(firstDraw = 20) {
    return this.getFirstDeposit() - firstDraw;
  }
  getSecondDeposit(secondDeposit = 50) {
    return this.getFirstDraw() + secondDeposit;
  }
  getTotalAccount(secondDraw = 10) {
    return this.getSecondDeposit() - secondDraw;
  }
}
let banca = new BankAccount();
console.log(banca.getTotalAccount());*/

/*class Avvocato {
  reddAnnuoLordo = 0;
  coefRedd = 0;
  aliquotaInps = 0;
  aliquotaIrpef = 0;

constructor(reddAnnuoLordo, coefRedd, aliquotaInps, aliquotaIrpef) {
    this.reddAnnuoLordo = reddAnnuoLordo;
    this.coefRedd = coefRedd;
    this.aliquotaInps = aliquotaInps;
    this.aliquotaIrpef = aliquotaIrpef
}
getUtileTasse(){
    return this.reddAnnuoLordo * this.coefRedd /100;
}
getTasseInps(){
    return this.getUtileTasse() *this.aliquotaInps /100;
}
getTasseIrpef(){
    return this.getUtileTasse() * this.aliquotaIrpef /100;
}
getRedAnnuoNetto(){
    return this.reddAnnuoLordo - (this.getTasseInps() + this.getTasseIrpef());
}
}
let avvocato = new Avvocato(70000, 67, 22, 15);
console.log("Utile tasse: " + avvocato.getUtileTasse() + "€");
console.log("Tassa inps: " + avvocato.getTasseInps() + "€");
console.log("Tassa irpef: " + avvocato.getTasseIrpef() + "€");
console.log("Reddito annuo netto avvocato: " + avvocato.getRedAnnuoNetto() + "€");

class Elettricista extends Avvocato {
    importoEccedente = 0;
    inpsFissa = 0;

    constructor (reddAnnuoLordo, coefRedd, aliquotaInps, aliquotaIrpef, importoEccedente, inpsFissa) {
        super (reddAnnuoLordo,coefRedd,aliquotaInps,aliquotaIrpef)
        this.importoEccedente = importoEccedente;
        this.inpsFissa = inpsFissa;
    } 
    getUtileTasse(){
    return this.reddAnnuoLordo * this.coefRedd /100;
    }
    getUtileEccedente(){
        return (this.reddAnnuoLordo - this.importoEccedente) * this.coefRedd /100;
    }
    getTasseInps(){
    return this.getUtileEccedente() *this.aliquotaInps /100;
}
getTasseIrpef(){
    return this.getUtileTasse() * this.aliquotaIrpef /100;
}
getRedAnnuoNetto(){
    return this.reddAnnuoLordo - (this.getTasseInps() + this.getTasseIrpef() + this.inpsFissa);
}
}
let elettricista = new Elettricista(90000, 67, 24, 15, 15000, 3500)
console.log("Utile eccedente: " + elettricista.getUtileEccedente() + "€");
console.log("Tassa inps : " + elettricista.getTasseInps() + "€");
console.log("Tassa irpef: " + elettricista.getTasseIrpef() + "€");
console.log("Reddito annuo netto elettricista: " + elettricista.getRedAnnuoNetto() + "€")*/

/*class Motorino {
    colore = "";
    velocita = 0;
    tipo ="";
    antifurto = false;

    constructor (colore, tipo, velocita, antifurto) {
        this.colore = colore;
        this.tipo = tipo;
        this.velocita = velocita;
        this.antifurto = antifurto;
    }
    getVelocita(){
        return this.velocita;
    }
    getAccelera(kmAggiunti){
        if(!this.antifurto){
            this.velocita += kmAggiunti;
        }else{
            console.log("Non è consentito accelerare")
        }
    }
    inserisciAntifurto(){
        this.antifurto = true;
    }
}
let motorino = new Motorino ("Nero", "Piaggio Scarabeo", 50.4, false );
console.log("Velocità iniziale: " + motorino.getVelocita());
motorino.getAccelera();
console.log("Velocità raggiunta con l'accelerazione: " + motorino.getVelocita());

motorino.inserisciAntifurto();
motorino.getAccelera(20.4);
console.log("Inserito l'antifurto, il motorino non accelera, la velocità è: " + motorino.getVelocita());

class MotorinoImmatricolato extends Motorino{
        maxVelocità = 100;
        targa = "AD2334AD";

        constructor(colore, tipo, velocità, antifurto, maxVelocità, targa){
            super(colore, tipo, velocità, antifurto);
            this.maxVelocità = maxVelocità;
            this.targa = targa;
        }

        getMax(){
            return this.maxVelocità;
        }
        accelera(kmAggiunti){
            if(!this.antifurto){
                let s = this.velocità + kmAggiunti;
                if(s < this.maxVelocità){
                    this.maxVelocità = s;
                } else {
                    this.velocità = this.maxVelocità;
                }
            } else {
                console.log("Impossibile accelerare, l'antifurto è stato inserito. ");
            }
        }
    }
    let motorino1 = new MotorinoImmatricolato("Nero", "Piaggio Scarabeo", 50.4, false, 100, "AD2334AD");
    console.log("Velocità attuale: " + motorino1.getVelocità());
    console.log("Velocità massima consentita: " + motorino1.getMax());
    motorino1.accelera(51);
    console.log("Velocità dopo la prima accelerazione: " + motorino1.getVelocità());
    motorino1.inserisciAntifurto();
    motorino1.accelera(10);
    console.log("Velocità dopo la seconda accelerazione: " + motorino1.getVelocità());*/

/*class Dipendente {
  matricola = "";
  stipendio = 0.0;
  straordinario = 0.0;
  constructor(matricola, stipendio, straordinario) {
    this.matricola = matricola;
    this.stipendio = stipendio;
    this.straordinario = straordinario;
  }
  getStipendio() {
    return this.stipendio;
  }
  paga(oreStraordinario) {
    this.stipendio =
      this.getStipendio() + this.straordinario * oreStraordinario;
    return this.stipendio;
  }
  stampa() {
    return {
      matricola: this.matricola,
      stipendio: this.getStipendio(),
      straordinario: this.straordinario,
    };
  }
}
let d1 = new Dipendente("A01", 2000, 10);
console.log(d1.getStipendio());
console.log(d1.paga(5));
console.log(d1.stampa());*/

class TipoCapoAbigliamento {
  marca = "";
  modello = "";
  costo = 0;

  constructor(marca, modello, costo) {
    this.marca = marca;
    this.modello = modello;
    this.costo = costo;
  }
  getCosto() {
    return this.costo;
  }
  applicaSconto(sconto) {
    return this.costo - (this.costo / 100) * sconto;
  }
  modificaCosto(newCosto) {
    this.costo = newCosto;
  }
}
let capo = new TipoCapoAbigliamento("adidas", "maglia", 29.99);
console.log("Il costo iniziale del capo è di: " + capo.getCosto() + " €");
console.log(
  "Il costo scontato del capo è di: " + capo.applicaSconto(20) + " €"
);
capo.modificaCosto(50);
console.log(
  "Il costo dopo modifica costo del capo è di: " + capo.getCosto() + " €"
);

class CapoAbbigliamento extends TipoCapoAbigliamento {
  taglia = 0;
  quantitàAcquistata = 0;
  quantitàDisponibile = 0;

  constructor(
    marca,
    modello,
    costo,
    taglia,
    quantitàAcquistata,
    quantitàDisponibile
  ) {
    super(marca, modello, costo);
    this.taglia = taglia;
    this.quantitàAcquistata = quantitàAcquistata;
    this.quantitàDisponibile = quantitàDisponibile;
  }

  getCosto() {
    return this.costo;
  }
  applicaSconto(sconto) {
    return this.costo - (this.costo / 100) * sconto;
  }
  modificaCosto(newCosto) {
    this.costo = newCosto;
  }
  venduto(quantità) {
    if (this.quantitàDisponibile > quantità) {
      this.quantitàDisponibile -= quantità;
    } else {
      console.log("Chiama il fattorino antipatico");
    }
  }
  getDettagli() {
    console.log("MARCA: " + this.marca);
    console.log("MODELLO: " + this.modello);
    console.log("COSTO: " + this.costo + " €");
    console.log("TAGLIA: " + this.taglia);
    console.log("QUANTITA' ACQUISTATA: " + this.quantitàAcquistata);
    console.log("QUANTITA' DISPONIBILE: " + this.quantitàDisponibile);
  }
}
let capo1 = new CapoAbbigliamento("adidas", "maglia", 29.99, "M", 35, 20);
console.log("Il costo iniziale del capo è di: " + capo1.getCosto() + " €");
console.log(
  "Il costo scontato del capo è di: " + capo1.applicaSconto(20) + " €"
);
capo1.modificaCosto(50);
console.log(
  "Il costo dopo modifica costo del capo è di: " + capo1.getCosto() + " €"
);
capo1.getDettagli();
capo1.venduto(10);
capo1.getDettagli();
capo1.venduto(15);