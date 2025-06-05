package ru.stepup.HW.сycles;

public class EqualNum {
    public static boolean eqlNmb(int x) {
        int lastDigt = x % 10;
        x /= 10;
        while (x != 0) {
            int currDigt = x % 10;
            if (currDigt != lastDigt) {
                return false;
            }
            x /= 10;
        }
        return true;
    }
}
