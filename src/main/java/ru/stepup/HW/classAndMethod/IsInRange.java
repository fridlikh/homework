package ru.stepup.HW.classAndMethod;

public class IsInRange {
    public static boolean isInRng(int a, int b, int num){
        return (a <= num && num <= b) ^ (b <= num && num <= a);
    }
}
