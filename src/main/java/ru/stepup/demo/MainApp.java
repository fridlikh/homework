package ru.stepup.demo;

import ru.stepup.HW.OOP.Fraction;
import ru.stepup.HW.OOP.Line;
import ru.stepup.HW.OOP.PolyLine;
import ru.stepup.HW.arrays.*;
import ru.stepup.HW.cases.*;
import ru.stepup.HW.сycles.*;
import ru.stepup.HW.OOP.Point;
//import java.awt.*;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {

        Fraction f1 = new Fraction(1,3);
        Fraction f2 = new Fraction(2,5);
        Fraction f3 = new Fraction(7,8);
        Fraction result =f1.add(f2).add(f3).subtract(5);
        System.out.println(result);



    }
}
