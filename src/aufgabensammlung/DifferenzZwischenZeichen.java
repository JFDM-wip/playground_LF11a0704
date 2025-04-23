package aufgabensammlung;

import java.util.Scanner;

// Aufgabe 11
public class DifferenzZwischenZeichen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ersterBuchstabe, zweiterBuchstabe;
        int differenz;

        // Eingabe
        System.out.print("Bitte gebe einen einzelnen kleinen Buchstaben ein: ");
        ersterBuchstabe = scanner.next().charAt(0);
        System.out.print("Bitte gebe einen weiteren einzelnen kleinen Buchstaben ein: ");
        zweiterBuchstabe = scanner.next().charAt(0);
        scanner.close();

        // Verarbeitung
        differenz = (int) ersterBuchstabe > (int) zweiterBuchstabe ?
                (int) ersterBuchstabe - (int) zweiterBuchstabe :
                (int) zweiterBuchstabe - (int) ersterBuchstabe;

        // Ausgabe
        System.out.printf("Die Differenz zwischen %c und %c ist %d", ersterBuchstabe, zweiterBuchstabe, differenz);
    }
}
