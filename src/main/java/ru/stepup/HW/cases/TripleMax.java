package ru.stepup.HW.cases;

public class TripleMax {
    public static int max3(int x, int y, int z){
        if (x>=y && x>=z) return x;
        if (y>=z) return y;
        return z;
    };
}
