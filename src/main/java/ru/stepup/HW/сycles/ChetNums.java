package ru.stepup.HW.сycles;

public class ChetNums {
    public static String chet(int x){
        String line = "";
        for (int i = 0; i <= x; i+=2)
            line += " " + i;
        return line;
    };
}
