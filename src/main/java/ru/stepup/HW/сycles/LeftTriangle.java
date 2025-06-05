package ru.stepup.HW.сycles;

public class LeftTriangle {
    public static void lftTrngle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    };
}
