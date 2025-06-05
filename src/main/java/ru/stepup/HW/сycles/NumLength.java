package ru.stepup.HW.сycles;

public class NumLength {
    public static int numLen(long x) {
        if (x == 0) return 1;
        int count = 0;
        while (x > 0) {
            x /= 10;
            count++;
        }
        return count;
    }
}