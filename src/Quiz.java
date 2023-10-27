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

        int rispostaUtente = Integer.valueOf(scanner.nextLine());
        System.out.println("\n");

        if(rispostaUtente != numeroRispostaGiusta) {

            System.out.println("Risposta errata. Attendere il prossimo quesito...");
            managerRisultati.inserisciCorrezione(numeroRispostaGiusta, operazione);
            return;

        }

        System.out.println("Risposta corretta! Attendere il prossimo quesito...");
        managerRisultati.assegnaPunto();

    }

    public void faseRisultati() {

        System.out.println("Il quiz è terminato! Ecco i tuoi risultati.");

    }

}
