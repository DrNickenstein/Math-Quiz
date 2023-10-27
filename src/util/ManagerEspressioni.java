package util;

import espressioni.OperazioneSemplice;

import java.util.ArrayList;
import java.util.Random;

public class ManagerEspressioni {

    Random rand = new Random();
    public OperazioneSemplice generaOperazioneSemplice() {


        int operando1 = rand.nextInt(250);
        int operando2 = rand.nextInt(250);

        int operatore = rand.nextInt(3); //0 = addizione, 1 = sottrazione, 2 = moltiplicazione, 3 = divisione

        ArrayList<Integer> datiOperazione = new ArrayList<>();

        datiOperazione.add(operando1);
        datiOperazione.add(operando2);
        datiOperazione.add(operatore);

        OperazioneSemplice operazione = new OperazioneSemplice(datiOperazione);

        return operazione;

    }

}
