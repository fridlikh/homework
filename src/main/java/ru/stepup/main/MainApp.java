package ru.stepup.main;

import ru.stepup.HW.OOP.geometry.*;
import ru.stepup.HW.OOP.math.Operations;
import ru.stepup.HW.OOP.misc.Sauce;


public class MainApp {
    public static void main(String[] args) {

        System.out.println(Operations.X_plus_Y.calculate(1, 2));
        System.out.println(Operations.X_minus_Y.calculate(8, 2));
        System.out.println(Operations.X_mult_Y.calculate(3, 2));
        System.out.println(Operations.X_div_Y.calculate(6, 2));
    }
}
