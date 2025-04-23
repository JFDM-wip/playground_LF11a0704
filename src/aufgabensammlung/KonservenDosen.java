package aufgabensammlung;

import java.util.Scanner;

// Aufgabe 9
public class KonservenDosen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double umfang, hoehe, dosenbodenDurchmesser, dosenbodenFlaeche, dosenmantel, gesamtflaeche, dosenvolumen;
        final double PI = 3.141592;

        // Eingabe
        System.out.print("Bitte gib als nächstes den Umfang der Dose ein: ");
        umfang = scanner.nextDouble();
        System.out.print("Bitte gib als nächstes die Höhe der Dose ein: ");
        hoehe = scanner.nextDouble();
        scanner.close();

        // Verarbeitung
        dosenbodenDurchmesser = umfang / PI;
        dosenbodenFlaeche = PI * Math.pow((dosenbodenDurchmesser/2), 2);
            // Alternativ: PI * ((dosenbodenDurchmesser/2) * (dosenbodenDurchmesser/2))
        dosenmantel = umfang * hoehe;
        gesamtflaeche = 2 * dosenbodenFlaeche + dosenmantel;
        dosenvolumen = dosenbodenFlaeche * hoehe;

        // Ausgabe
        System.out.printf("""
                **********************************************
                Folgende Maße wird die Konservendose besitzen:
                    Der Durchmesser des Bodens:     %.2f
                    Die Fläche des Bodens:          %.2f
                    Die Fläche des Mantels:         %.2f
                    Die Gesamtfläche der Dose:      %.2f
                    Das Volumen der Dose:           %.2f
                **********************************************
                
                """, dosenbodenDurchmesser, dosenbodenFlaeche, dosenmantel, gesamtflaeche, dosenvolumen);


    }
}
