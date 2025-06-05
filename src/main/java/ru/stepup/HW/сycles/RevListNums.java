package ru.stepup.HW.сycles;

public class RevListNums {
    public static String revLstNms(int x) {
        String line = "";
        for (int i = x; i >= 0; i--)
            line += " " + i;
        return line;
    }
}
