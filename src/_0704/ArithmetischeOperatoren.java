package _0704;

public class ArithmetischeOperatoren {
    public static void main(String[] args) {
        // Operatoren und Prioritäten/Präzedenzen
        // (), +, -, *, /, %

        // Zur Reihenfolge der Operatoren gilt:
        // *, /, %, Punkt- vor +, -, Strichrechnung.
        // Soll von dieser Reihenfolge abgewichen werden helfen runde Klammern (),
        // auch hier gilt bei mehreren Klammerpaaren wird von innen nach außen aufgelöst.

        // Kombinierter Zuweisungsoperator
        // +=, -=, /=, *=, %=
        double x, y, z;
        int n, m;

        x = 14 / 4;
        System.out.println(x); // 3.0

        x = 14.0 / 4;
        System.out.println(x); // 3.5

        n = 14 / 4;
        System.out.println(n); // 3

        m = 14 % 4;
        System.out.println(m); // 2

        y = 10.0;
        z = 11.1;

        n = (int) y + (int) z;

        System.out.println(10 + 23); // 33
        System.out.println("ABC" + 10); // ABC10

        char zeichen = 'A';
        int zahl5 = zeichen;
        System.out.println(zahl5);

        char zeichen2;
        int zahl6 = 97;
        zeichen2 = (char) zahl6;
        System.out.println(zeichen2);

        System.out.println("ABCD" + (10 / 5));

    }
}
