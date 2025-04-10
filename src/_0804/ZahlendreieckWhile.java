package _0804;

public class ZahlendreieckWhile {
    public static void main(String[] args) {
        int zahl = 0;
        String ausgabe = "";

        while (zahl < 10) {
            ausgabe += zahl + " ";
            System.out.println(ausgabe);
            zahl++;
        }
    }
}
