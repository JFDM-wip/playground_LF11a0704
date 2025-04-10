package _0904;

import java.util.Scanner;

public class Notenauswertung {

    public static void main(String[] args) {
        // Scanner für die Eingabe der Noten
        Scanner scanner = new Scanner(System.in);

        // Eingabe wie viele Noten berücksichtigt werden sollen:
        System.out.print("Wie viele Noten wollen Sie eingeben?: ");
        int anzahlNoten = scanner.nextInt();
        int[] noten = new int[anzahlNoten];
        double summeNoten = 0.0;
        double notenDurchschnitt = 0.0;
        int[] moeglicheNoten = new int[6];

        System.out.println("Geben Sie die Noten nacheinander ein.");
        for (int i = 0; i < noten.length; i++) {
            System.out.print("\t" + (i + 1) + ". Note: ");
            noten[i] = scanner.nextInt();
            summeNoten += noten[i];

            switch (noten[i]) {
                case 1 -> moeglicheNoten[0]++;
                case 2 -> moeglicheNoten[1]++;
                case 3 -> moeglicheNoten[2]++;
                case 4 -> moeglicheNoten[3]++;
                case 5 -> moeglicheNoten[4]++;
                case 6 -> moeglicheNoten[5]++;
            }
        }
        scanner.close();

        notenDurchschnitt = summeNoten / anzahlNoten;

        String ausgabeTemplate = """
                Es wurden in der Arbeit folgende Noten erreicht:
                *******************
                    Note 1: %dx
                    Note 2: %dx
                    Note 3: %dx
                    Note 4: %dx
                    Note 5: %dx
                    Note 6: %dx
                *******************
                """;

        System.out.printf(ausgabeTemplate, moeglicheNoten[0], moeglicheNoten[1], moeglicheNoten[2], moeglicheNoten[3], moeglicheNoten[4], moeglicheNoten[5]);

        System.out.println("Der Notendurchschnitt liegt bei: " + notenDurchschnitt);
    }
}
