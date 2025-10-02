/*class BankAccount {
  balance = 0;
  firstDeposit = 0;
  firstDraw = 0;
  secondDeposit = 0;
  secondDraw = 0;
  canoneAnnuo = 0;

  constructor(
    balance,
    firstDeposit,
    firstDraw,
    secondDeposit,
    secondDraw,
    canoneAnnuo
  ) {
    this.balance = balance;
    this.firstDeposit = firstDeposit;
    this.firstDraw = firstDraw;
    this.secondDeposit = secondDeposit;
    this.secondDraw = secondDraw;
    this.canoneAnnuo = canoneAnnuo;
  }

  getFirstDeposit() {
    return this.balance + this.firstDeposit;
  }
  getFirstDraw() {
    return this.getFirstDeposit() - this.firstDraw;
  }
  getSecondDeposit() {
    return this.getFirstDraw() + this.secondDeposit;
  }
  getSecondDraw() {
    return this.getSecondDeposit() - this.secondDraw;
  }
  getCanoneAnnuo() {
    return (this.getSecondDraw() * this.canoneAnnuo) / 100;
  }
  getTotalAccount() {
    return this.getSecondDraw() - this.getCanoneAnnuo();
  }
}
let banca = new BankAccount(1000, 100, 100, 80, 30, 5);
let account = banca.getTotalAccount();
console.log(account);
//console.log(banca.getTotalAccount());*/

class Professionista {
    
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
  getAliquotaInps() {
    return (this.getUtileTasse() * this.aliquotaInps) / 100;
  }
  getAliquotaIrpef() {
    return (this.getUtileTasse() * this.aliquotaIrpef) / 100;
  }
  getRedditoAnnuoNetto() {
    return (
      this.reditoAnnuoLordo - (this.getAliquotaInps() + this.getAliquotaIrpef())
    );
  }
}
let netto = new Professionista(86000, 78, 26, 15);
console.log(netto.getRedditoAnnuoNetto());
