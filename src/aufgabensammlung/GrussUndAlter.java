package aufgabensammlung;

import java.util.Scanner;

// Aufgabe 6
public class GrussUndAlter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int alter;

        // Eingabe
        System.out.print("Hallo, bitte gib deinen Namen an: ");
        name = scanner.next();
        System.out.print("Und jetzt noch wie alt du bist: ");
        alter = scanner.nextInt();
        scanner.close();

        // Verarbeitung
        // da hier keine Rücksicht auf Schaltjahre genommen werden muss, können wir das eingegebene Alter einfach mit
        // 365 (Tage pro Jahr) multiplizieren
        alter *= 365;

        // Ausgabe
        System.out.printf("Hallo %s, du bist %d Tage alt!", name, alter);
    }
}
