package _0904;

import java.util.Scanner;

public class WiederholungVortag {
    public static void main(String[] args) {
        // increment / decrement
        int zahl1 = 1;
        int zahl2 = 1;
        System.out.println(zahl1 + zahl2++); // 2
        System.out.println(zahl1 + zahl2); // 3
        System.out.println(zahl1 + ++zahl2); // 4

        // Fußgesteuerte Schleife
        do {
            System.out.println("Hallo! " + zahl1);
            zahl1++;
        } while (zahl1 < zahl2);

        // Kopfgesteuerte Schleifen
        // while
        while (zahl1 < zahl2) {
            System.out.println("Hier wird nichts passieren");
        }

        System.out.println("Nach der while Schleife");

        // for-Schleife
        for (int i = 0; i < 10 ; i += 2) {
            System.out.println("Schleifendurchlauf mit Schrittweite 2: " + i);
        }

        int[] zahlenArray = {10, 11, 12, 13};
        // verbesserte for-Schleife
        for (int i : zahlenArray) {
            System.out.println(i);
        }

        Scanner scanner = new Scanner(System.in);
        int eingabe = scanner.nextInt();
        // switch-case
//        switch (eingabe) {
//            case 0: {
//                System.out.println("Eingabe war 0");
//                break;
//            }
//            case 1: {
//                System.out.println("Eingabe war 1");
//                break;
//            }
//            default: {
//                System.out.println("Ihre Eingabe war ungültig");
//            }
//        }

//        switch (eingabe) {
//            case 0 -> System.out.println("Eingabe war 0");
//            case 1 -> System.out.println("Eingabe war 1");
//            default -> System.out.println("Ihre Eingabe war ungültig");
//        }

        // if-else
        if (eingabe < 5) {
            System.out.println("Eingabe war kleiner 5");
        } else if (eingabe == 5) {
            System.out.println("Eingabe ist 5");
        } else {
            System.out.println("Eingabe ist definitiv größer als 5");
        }

        scanner.close();
    }
}
