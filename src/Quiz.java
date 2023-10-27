import espressioni.OperazioneSemplice;
import util.ManagerEspressioni;
import util.ManagerQuesiti;
import util.ManagerRisultati;

import java.util.Scanner;

public class Quiz {

    ManagerEspressioni managerEspressioni = new ManagerEspressioni();
    ManagerQuesiti managerQuesiti = new ManagerQuesiti();
    ManagerRisultati managerRisultati = new ManagerRisultati(10);

    public void inizio(Scanner scanner) {

        for(int i = 0; i < 9; i++) {

            OperazioneSemplice operazione = managerEspressioni.generaOperazioneSemplice();
            int numeroRispostaGiusta = managerQuesiti.stampaQuesito(operazione) + 1;

            faseRispostaUtente(numeroRispostaGiusta, operazione, scanner);

        }

        faseRisultati();

    }

    public void faseRispostaUtente(int numeroRispostaGiusta, OperazioneSemplice operazione, Scanner scanner) {

        System.out.println("Inserire la propria risposta (1, 2, o 3): ");

        String input = scanner.nextLine();

        if(!input.equals("1") && !input.equals("2") && !input.equals("3")) {

            System.out.println("\nRisposta non valida. Attendere il prossimo quesito...");
            managerRisultati.inserisciCorrezione(operazione);
            return;

        }

        int rispostaUtente = Integer.valueOf(input);

        if(rispostaUtente != numeroRispostaGiusta) {

            System.out.println("\nRisposta errata. Attendere il prossimo quesito...");
            managerRisultati.inserisciCorrezione(operazione);
            return;

        }

        System.out.println("\nRisposta corretta! Attendere il prossimo quesito...");
        managerRisultati.assegnaPunto();

    }

    public void faseRisultati() {

        System.out.println("Il quiz è terminato! Ecco i tuoi risultati.");
        managerRisultati.stampaCorrezioni();
        System.out.println("\nIl punteggio è di " + managerRisultati.risposteCorretteSuTot() + " con " + managerRisultati.erroriCommessi() + " errori commessi.");
        System.out.println("\nLa percentuale delle risposte corrette è " + managerRisultati.percentualeRisposteCorrette() + ".");
        System.out.println("\nIl tuo voto in decimi è " + managerRisultati.voto() + ".");

    }

}
