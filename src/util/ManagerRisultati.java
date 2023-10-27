package util;

import espressioni.OperazioneSemplice;

import java.util.HashMap;

public class ManagerRisultati {

    int punteggioUtente;
    int punteggioMassimo;
    HashMap<Integer, OperazioneSemplice> correzioniRisposte;

    public ManagerRisultati(int pMax) {

        punteggioUtente = 0;
        punteggioMassimo = pMax;
        correzioniRisposte = new HashMap<>();

    }

    public void inserisciCorrezione(int numeroRispostaGiusta, OperazioneSemplice operazione) {

        correzioniRisposte.put(numeroRispostaGiusta, operazione);

    }

    public void stampaCorrezioni(HashMap<Integer, OperazioneSemplice> correzioni) {

        for(int i = 0; i < correzioni.size(); i++) {

            OperazioneSemplice operazione = correzioni.get(i);
            System.out.println("\n" + i + 1 + ".La risposta dell'operazione " + operazione + " era " + operazione.risultato());

        }

    }

    public void assegnaPunto() {

        punteggioUtente++;

    }

    public String risposteCorretteSuTot() {

        return punteggioUtente + "/" + punteggioMassimo;

    }

    public int erroriCommessi() {

        return punteggioMassimo - punteggioUtente;

    }

    public String percentualeRisposteCorrette() {

        return (float)(punteggioUtente / punteggioMassimo) * 100 + "%";

    }

}
