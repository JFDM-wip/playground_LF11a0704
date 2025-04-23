package aufgabensammlung;

// Aufgabe 2
public class CelsiusFahrenheitTabelle {
    public static void main(String[] args) {
        // Start- und Endwerte
        int start = -20;
        int ende = 30;

        // Den Umrechner aus Aufgabe 1 benutzen
        CelsiusZuFahrenheit umrechner = new CelsiusZuFahrenheit();

        // "Tabelle" mithilfe einer for-Schleife ausgeben
        for (int i = start; i <= ende; i++) {
            if (i == -20) {
                System.out.println("°Celsius | °Fahrenheit");
            }
            System.out.print("\t" + i + "°C ");
            System.out.printf(" %.2f °F", umrechner.celsiusZuFahrenheit(i));
            System.out.println();
        }
    }
}
