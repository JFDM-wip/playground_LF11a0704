package _0804;

import java.util.Arrays;

public class JavaArrays {
    public static void main(String[] args) {
        int[] zahlenArray = {10, 11, 12, 13};
        int[] zweitesZahlenArray = new int[10];

//        for (int i : zweitesZahlenArray) {
//            System.out.println(i);
//        }
        System.out.println(zahlenArray[0]);
        // zahlenArray[4] = 14;

        for (int i = 0; i <= zweitesZahlenArray.length - 1; i++) {
            zweitesZahlenArray[i] = i + 1;
            System.out.println(zweitesZahlenArray[i]);
        }

        System.out.println(zweitesZahlenArray);
        System.out.println(Arrays.toString(zweitesZahlenArray));
    }
}
