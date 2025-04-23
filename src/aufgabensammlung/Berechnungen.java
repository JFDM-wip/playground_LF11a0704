package aufgabensammlung;

// Aufgabe 5
public class Berechnungen {
    public static void main(String[] args) {
        /*
        Berechne den double-Wert (1 / 107751) * (1682xy4 + 3x3 + 29xy2 – 2x5 + 832)
        für x = 192119201
        für y = 35675640
        Verwende dabei nur die Grundoperationen +, -, * und /
        stelle Ausdrücke wie x2 bzw. x4 als x * x bzw. x * x * x * x dar.
         */

        // Erfassen der Werte
        long x = 192119201;
        long y = 35675640;

        // Berechnung der Potenzen
        long x2 = x * x;
        long x3 = x2 * x;
        long x4 = x3 * x;
        long x5 = x4 * x;
        long y2 = y * y;
        long y4 = y2 * y2;

        // Berechnung der einzelnen Terme
        long term1 = 1682 * x * y4;
        long term2 = 3 * x3;
        long term3 = 29 * x * y2;
        long term4 = -2 * x5;
        long term5 = 832;

        // Gesamtausdruck
        double result = (1.0 / 107751) * (term1 + term2 + term3 + term4 + term5);

        // Ausgabe des Ergebnisses
        System.out.println("Das Ergebnis des Ausdrucks ist: " + result);

    }
}