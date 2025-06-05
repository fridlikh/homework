package ru.stepup.HW.cases;

public class MakeDecision {
    public static String makDecsn(int x, int y){
        if (x>y) return x + " > " + y;
        if (x<y) return x + " < " +y;
        return x + " = " + y;
    };
}
