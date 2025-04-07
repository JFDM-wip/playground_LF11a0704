package _0704;

public class Zeichenketten {
    public static void main(String[] args) {
        // Der Datentyp String ist ein komplexer/referenz Datentyp.
        // Mögliche Wertezuweisung wie bei einfachen Datentypen
        String zeichenkette = "abc";
        System.out.println(zeichenkette); // abc

        // Oder wie bei einer Objektinstantiierung
        String zeichenkette2 = new String(); // = ""
        System.out.println(zeichenkette2); // nichts

        System.out.println(zeichenkette.charAt(0)); // a

        System.out.println(zeichenkette.length()); // 3

        System.out.println(zeichenkette.equals(zeichenkette2)); // false
        // System.out.println(10 == 11); // false


    }
}
