package _0704;

public class Casting {
    public static void main(String[] args) {
        // Wir müssen unterscheiden zwischen explizitem und implizitem Casting
        // explizites Casting muss extra angewiesen werden, weil Werteverlust möglich ist
        // implizites Casting wird von Java automatisch angenommen, es besteht keine Gefahr eines Werteverlustes

        // hier wird vom kleineren in den größeren Datentypen umgewandelt, also besteht keine Gefahr
        // Widening passiert Implizit
        // byte -> short -> int -> long -> float -> double
        int zahl = 10;
        double zahl2 = zahl;

        // Narrowing muss Explizit angewiesen werden
        // vom größeren zum kleineren Datentypen
        double zahl3 = 1000.12345;
        int zahl4 = (int)zahl3;
        System.out.println(zahl4); // Ausgabe: 1000

    }
}
