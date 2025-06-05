package ru.stepup.HW.сycles;

public class RightTriangle {
    public static void rghtTrngle(int x){
        for (int i = 1; i <= x; i++) {
            for (int q=1; q<=x-i; q++){
                System.out.print(' ');
            };
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    };
}
