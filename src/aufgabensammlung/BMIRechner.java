package aufgabensammlung;

import java.util.Scanner;

// Aufgabe 3 & 4
public class BMIRechner {
    // Hier eine statische Methode zum Berechnen des BMIs
    public static double berechne(double gewicht, double groesse) {
        return gewicht / (Math.pow(groesse, 2));
    }

    /* Erweiterung für Aufgabe 4 */
    // Methode um zu überprüfen in welchem Bereich der BMI des Nutzers liegt
    public static String checkBMI(double bmi, int alter) {
        String ausgabe;
        String untergewicht = "Sie haben Untergewicht!";
        String uebergewicht = "Sie haben Übergewicht!";
        String normalgewicht = "Sie haben Normalgewicht, sehr gut!";

        if (alter < 25) {
            ausgabe = bmi < 19 ? untergewicht : bmi > 24 ? uebergewicht : normalgewicht;
        } else if (alter > 25 && alter < 64) {
            ausgabe = bmi < 22 ? untergewicht : bmi > 27 ? uebergewicht : normalgewicht;
        } else {
            ausgabe = bmi < 24 ? untergewicht : bmi > 29 ? uebergewicht : normalgewicht;
        }

        return ausgabe;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gewichtEingabe;
        double groesseEingabe;
        double berechneterBMI;
        /* Erweiterung für Aufgabe 4 */
        int alterEingabe;
        String gepruefterBMI;

        // Eingabe
        System.out.print("Bitte geben Sie ihr Körpergewicht in kg an: ");
        gewichtEingabe = scanner.nextDouble();

        System.out.print("Bitte geben Sie ihre Körpergröße in m an: ");
        groesseEingabe = scanner.nextDouble();

        /* Erweiterung für Aufgabe 4 */
        System.out.print("Bitte geben Sie ihr Alter an: ");
        alterEingabe = scanner.nextInt();

        scanner.close();

        // Verarbeitung
        // innerhalb der eigenen Klasse kann die statische berechne Methode über ihren Bezeichner aufgerufen werden.
        // Um die Methode an anderer Stelle zu benutzen, muss die Klasse vorangestellt werden -> BMIRechner.berechne()
        // alternativ könnte die Klasse auch über eine import-Anweisung hinzugefügt werden
        berechneterBMI = berechne(gewichtEingabe, groesseEingabe);
        /* Erweiterung für Aufgabe 4 */
        gepruefterBMI = checkBMI(berechneterBMI, alterEingabe);

        // Ausgabe
        System.out.printf("Ihr BMI ist: %.2f", berechneterBMI);
        /* Erweiterung für Aufgabe 4 */
        System.out.println();
        System.out.println(gepruefterBMI);

    }
}
