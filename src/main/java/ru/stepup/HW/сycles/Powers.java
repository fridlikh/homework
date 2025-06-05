package ru.stepup.HW.сycles;

public class Powers {
    public static int pow(int x, int y){
        int res = 1;
        for (int i = 1; i <= y; i++)
            res*=x;
        return res;
    };
}
