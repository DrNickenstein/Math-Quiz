package util;

import espressioni.OperazioneSemplice;

import java.util.ArrayList;

public class ManagerRisultati {

    int punteggioUtente;
    int punteggioMassimo;
    ArrayList<OperazioneSemplice> correzioniRisposte;
    ArrayList<Integer> numeriRisposteCorrette;
    public ManagerRisultati(int pMax) {

        punteggioUtente = 0;
        punteggioMassimo = pMax;
        correzioniRisposte = new ArrayList<>();
        numeriRisposteCorrette = new ArrayList<>();

    }

    public void inserisciCorrezione(OperazioneSemplice operazione, int numeroQuesito) {

        correzioniRisposte.add(operazione);
        numeriRisposteCorrette.add(numeroQuesito);

    }

    public void stampaCorrezioni() {

        for(int i = 0; i < correzioniRisposte.size(); i++) {

            OperazioneSemplice operazione = correzioniRisposte.get(i);
            System.out.println(numeriRisposteCorrette.get(i) + ".La risposta dell'operazione " + operazione + " era " + operazione.risultato() + ".");

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

    public float voto() {

        return (float)(punteggioUtente * 10) / (float)punteggioMassimo;

    }

}
