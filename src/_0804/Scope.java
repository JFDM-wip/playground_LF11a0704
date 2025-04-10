package _0804;

public class Scope {
    // Gültigkeitsbereich der Klasse
    public static void main(String[] args) {
        // Gültigkeitsbereich der main-Methode
        System.out.println("Hier werden zwei Zahlen addiert: " + sum(10, 5));

        int zaehler = 0;
        while (true) {
            // Gültigkeitsbereich innerhalb der while-Schleife
            if (zaehler == 10) {
                // Gültigkeitsbereich innerhalb der if-Verzweigung
                break;
            }
            zaehler++;
        }
//        System.out.println(summe);
    }

    public static int sum(int a, int b) {
        // Gültigkeitsbereich innerhalb der sum-Methode
        int summe = a + b;
        return summe;
    }

}
