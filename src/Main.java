import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sei pronto a iniziare il quiz? \nScrivi 'Sì' per iniziare.");

        while(true) {

            String conferma = scanner.nextLine();

            if(conferma.equals("Sì") || conferma.equals("sì")) {

                break;

            }

        }

        System.out.println("Il quiz inizierà tra poco... \n");

        Quiz quiz = new Quiz();
        quiz.inizio(scanner);

    }
}