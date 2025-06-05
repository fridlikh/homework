package ru.stepup.HW.classAndMethod;

public class IsDivisor {
    public static boolean isDiv(int a, int b) {
        if (a == 0 || b == 0) {
            return false;
        }
        return ((a % b) == 0) || ((b % a) == 0);
    }
}
