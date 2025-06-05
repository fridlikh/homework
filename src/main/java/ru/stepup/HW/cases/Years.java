package ru.stepup.HW.cases;

public class Years {
    public static String age(int x){
        String yrs = " Лет";
        if (x%10==1 && x%100!=11) yrs = " Год";
        if ((x%10==2 || x%10==3 || x%10==4) && (x%100!=12 && x%100!=13 && x%100!=14)) yrs = " Года";
        return x + yrs;

    };
}
