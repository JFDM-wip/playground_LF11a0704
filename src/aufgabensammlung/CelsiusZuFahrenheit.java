package aufgabensammlung;

import java.util.Scanner;

// Aufgabe 1
public class CelsiusZuFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius, fahrenheit;

        // Eingabe
        System.out.print("Gib den umzuwandelnden Celsius-Wert an: ");
        celsius = scanner.nextDouble();
        scanner.close();

        // Verarbeitung über das Objekt rechner und seine Methode celsiusZuFahrenheit
        CelsiusZuFahrenheit rechner = new CelsiusZuFahrenheit();
        fahrenheit = rechner.celsiusZuFahrenheit(celsius);

        // Ausgabe
        System.out.println("In Fahrenheit wären das: " + fahrenheit);
    }

    public double celsiusZuFahrenheit(double celsius) {
        // erste Formel:
        // return (celsius * 9) / 5 + 32;
        // zweite Formel:
        // hier muss bei der Umformung darauf geachtet werden,
        // dass das Ergebnis aus 9 / 5 ohne angewiesenes Casting durch (double) einen falschen Wert zurückliefert
        return (double) 9 / 5 * celsius + 32;
    }
}
