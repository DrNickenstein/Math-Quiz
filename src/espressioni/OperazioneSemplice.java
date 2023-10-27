package espressioni;

import java.util.ArrayList;

public class OperazioneSemplice {

    ArrayList<Integer> datiOperazione;
    int operando1;
    int operando2;
    int operatore;

    public OperazioneSemplice(ArrayList<Integer> dati) {

        datiOperazione = dati;

        operando1 = datiOperazione.get(0);
        operando2 = datiOperazione.get(1);
        operatore = datiOperazione.get(2);

    }

    public int risultato() {

        int risultato = 0;

        switch(operatore) {

            case 0:
                risultato = operando1 + operando2;
                break;
            case 1:
                risultato = operando1 - operando2;
                break;
            case 2:
                risultato = operando1 * operando2;
                break;
            case 3:
                risultato = operando1 / operando2;
                break;

        }

        return risultato;

    }

    @Override
    public String toString() {

        String operazione = "";

        operazione += operando1 + " ";

        switch(operatore) {

            case 0:
                operazione += "+ ";
                break;
            case 1:
                operazione += "- ";
                break;
            case 2:
                operazione += "* ";
                break;
            case 3:
                operazione += "/ ";
                break;
            default:
                operazione += "Numero operatore non valido.";

        }

        operazione += operando2;

        return operazione;

    }
}
