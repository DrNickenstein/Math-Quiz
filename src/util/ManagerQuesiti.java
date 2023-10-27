package util;

import espressioni.OperazioneSemplice;

import java.util.Random;

public class ManagerQuesiti {

    Random rand = new Random();

    public int stampaQuesito(OperazioneSemplice operazione) {

        System.out.println(operazione + "\n");

        int risultato = operazione.risultato();
        int numeroRispostaGiusta = rand.nextInt(2);
        stampaRisposte(risultato, numeroRispostaGiusta);

        return numeroRispostaGiusta;

    }

    public void stampaRisposte(int risultato, int numeroRispostaGiusta) {

        for(int i = 0; i < 3; i++) {

            if (i == numeroRispostaGiusta) {

                System.out.println(i + 1 + ": " + risultato);

            } else {

                int risultatoSbagliato = risultato + 3 + rand.nextInt(15) - rand.nextInt(15);

                if (risultatoSbagliato == risultato) {

                    risultatoSbagliato = risultato - 4;

                }

                System.out.println((i + 1) + ": " + risultatoSbagliato);

            }

        }

        System.out.println("\n");

    }

}
