package ru.stepup.HW.cases;

public class IsThereSix {
    public static boolean magic6(int x, int y){
        if (x==6 || y==6) return true;
        return (x+y==6) || (x-y==6) || (y-x==6);
    };
}
