/*alert ("Bentrovato")
let dimmi = prompt("E che si fa?")
if ( dimmi == null) {
    alert("Non la sai?");
} else {
  confirm("...");
}*/
 let exit = false;
      while (!exit) {
        let scelta = prompt("CIAO VUOI CONTINUARE? (SI/NO)");
        if (scelta == "SI") {
          alert("BRAVO OTTIMA SCELTA");
        }
        if (scelta == "NO") {
          alert("ARRIVERDERCI");
          exit = confirm("Sei sicuro che vuoi uscire?");
        } else {
          alert("RISPOSTA NON CORRETTA");
        }
      }
           let pass = prompt("INSERISCI PASSWORD");
      if (pass == 1234) {
        alert("BRAVO PASSWORD CORRETTA");
      } else {
        alert("VAI DAL MEDICO");
      }
      let exit = false;

      while (!exit) {
        let nome = prompt("CIAO COME TI CHIAMI?");

        alert("CIAO " + nome + " BENVENUTO!");
        let scelta = prompt("CIAO VUOI CONTINUARE? (SI/NO)");
        if (scelta == "SI") {
          break;
        }
      }