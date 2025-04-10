package _0904;

public class ReferenzValue {
    public static void main(String[] args) {
        int zahl1 = 1;
        int zahl2 = 1;
        int zahl3 = zahl1;
        boolean b = true;
        char c = 'a';
        boolean f = true;
        char h = 'o';

        System.out.println(System.identityHashCode(zahl1));
        System.out.println(System.identityHashCode(zahl2));
        System.out.println(System.identityHashCode(zahl3));

        zahl1 = 5;

        System.out.println(System.identityHashCode(zahl1));

        Hund bobby = new Hund();
        bobby.setColor("green");
        System.out.println("Bobby ist: " + bobby.getColor());

        Hund sam = bobby;
        System.out.println("Samy ist: " + sam.getColor());

        sam.setColor("blue");
        System.out.println("Samy ist: " + sam.getColor());
        System.out.println("Bobby ist: " + bobby.getColor());
    }
}
