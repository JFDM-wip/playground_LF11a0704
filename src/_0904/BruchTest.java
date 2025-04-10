package _0904;

public class BruchTest {
    public static void main(String[] args) {
        // Multiplikation testen mit 2 Brüchen

        Bruch b1 = new Bruch(2, 5);
        Bruch b2 = new Bruch(3, 4);
        Bruch ergebnis = b1.multipliziere(b2);
        System.out.println("Ergebnis = " + ergebnis.getZaehler() + " / " + ergebnis.getNenner());
        System.out.println("Ergebnis --> dezimal " + ergebnis.dezimalwert());

        // Divisision testen mit 2 Brüchen
        
        /*Bruch b1 = new Bruch(2,5);
        Bruch b2 = new Bruch(3,4);
        Bruch ergebnis = b1.dividiere(b2);
        System.out.println("Ergebnis = " + ergebnis.getZaehler() + " / " + ergebnis.getNenner());
        */

        // Addition testen mit 2 Brüchen
        
        /*Bruch b1 = new Bruch(2,5);
        Bruch b2 = new Bruch(3,4);
        Bruch ergebnis = b1.addiere(b2);
        System.out.println("Ergebnis = " + ergebnis.getZaehler() + " / " + ergebnis.getNenner());
        */

        // Subtraktion testen mit 2 Brüchen
        
        /*Bruch b1 = new Bruch(2,5);
        Bruch b2 = new Bruch(3,4);
        Bruch ergebnis = b1.subtrahiere(b2);
        System.out.println("Ergebnis = " + ergebnis.getZaehler() + " / " + ergebnis.getNenner());
        */


        /* (1/2 + 3/4) : 1/10 = 25/2 */
        Bruch test = new Bruch(1, 2).addiere(new Bruch(3, 4)).dividiere(new Bruch(1, 10));
        System.out.println("--> " + test);

        System.out.println("--> dezimal " + test.dezimalwert());

        System.out.println("Anzahl Brüche: " + Bruch.getAnzahlBrueche());


    }
}