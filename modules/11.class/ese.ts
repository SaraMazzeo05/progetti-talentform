/*class MotherAccount{
    private balance: number 
    private firstDeposit: number
    private firstDraw: number
    private secondDeposit: number
    private secondDraw:number

    constructor( balance = 0,firstDeposit = 0, firstDraw = 0, secondDeposit = 0, secondDraw = 0) {
        this.balance = balance
        this.firstDeposit = firstDeposit
        this.firstDraw = firstDraw
        this.secondDeposit = secondDeposit
        this.secondDraw = secondDraw
    }

    public getFirstDeposit() : number{
        return this.balance + this.firstDeposit;
    }

    public getFirstDraw() : number {
        return this.getFirstDeposit() - this.firstDraw;
    }

    public getSecondDeposit() : number {
        return this.getFirstDraw() + this.secondDeposit;
    }

    public getTotalAccount() : number {
        return this.getSecondDeposit() - this.secondDraw;
    }
}
let conto = new MotherAccount (0, 300, 100, 50, 30);
console.log(conto.getTotalAccount());*/

/*abstract class distributore {

    abstract rifornisci(a: number): void;
    abstract vendi(a: number): void;
}
interface distributore1 {
    aggiorna(prezzo: number) : void;
}
class distributoreBenzina extends distributore implements distributore1 {
    private deposito: number;
    private euroPerLitro: number;
    constructor(deposito: number, euroPerLitro: number) {
        super();
        this.deposito = deposito;
        this.euroPerLitro = euroPerLitro;     
    }
    public rifornisci(a: number) : void {
        this.deposito += a;
    }
    public vendi(a: number): void {
        let quantitativo: number = a / this.euroPerLitro;
        if(quantitativo <= this.deposito) {
            this.deposito -= quantitativo;
        } else {
            console.log("Non c'è abbastanza benzina");
        }
    }
    public aggiorna(prezzo: number): void {
        this.euroPerLitro = prezzo;
    }
    public getDeposito(): number {
        return this.deposito;
    }
    public getPrezzo(): number {
        return this.euroPerLitro;
    }
}
let distributore3 = new distributoreBenzina(100, 1.74);
console.log("\n");
distributore3.rifornisci(10);
console.log(distributore3.getDeposito());
console.log("\n");

distributore3.vendi(50);
console.log(distributore3.getDeposito());
console.log("\n");

distributore3.aggiorna(1.78);
console.log(distributore3.getPrezzo());
console.log("\n");

distributore3.vendi(600);
console.log("\n");*/

/*interface ICellulare {
    ricarica(unaRicarica : number) : void;
    chiama(minutiDurata : number) : void;
    numero404() : number;
}

abstract class Smartphone{
    abstract getNumeroChiamate() : number;
    abstract azzeraChiamate() : void;
}

class Cellulare extends Smartphone implements ICellulare{

    private carica: number;
    private numeroChiamate: number;

    constructor(unaCarica: number){
        super();
        this.carica = unaCarica;
        this.numeroChiamate = 0;
    }

    public ricarica(unaRicarica: number) : void {
        this.carica += unaRicarica;
    }

    public chiama(minutiDurata: number) : void {
        const costoPerMinuto = 0.2;
        const costoTotale = minutiDurata * costoPerMinuto;

        if(costoTotale <= this.carica){
            this.carica -= costoTotale;
            this.numeroChiamate++;
        } else {
            console.log("Il credito per effettuare la chiamata non è sufficiente. Effettua una ricarica.");
        }
    }

    public numero404() : number {
        return this.carica;
    }

    public getNumeroChiamate() : number {
        return this.numeroChiamate;
    }

    public azzeraChiamate() : void {
        this.numeroChiamate = 0;
    }

}

    const cellulare = new Cellulare(20);

    cellulare.chiama(10);
    console.log("Credito residuo: €", cellulare.numero404());
    console.log("Numero chiamate effettuate: ", cellulare.getNumeroChiamate());

    cellulare.ricarica(10);
    console.log("Nuovo credito telefonico: €", cellulare.numero404());

    cellulare.azzeraChiamate();
    console.log("Numero chiamate effettuate dopo l'azzeramento: ", cellulare.getNumeroChiamate());*/
