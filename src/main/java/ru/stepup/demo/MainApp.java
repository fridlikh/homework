package ru.stepup.demo;

import ru.stepup.HW.OOP.Line;
import ru.stepup.HW.arrays.*;
import ru.stepup.HW.cases.*;
import ru.stepup.HW.сycles.*;
import ru.stepup.HW.OOP.Point;
//import java.awt.*;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {

        Line first = new Line(1, 3, 5 ,8);
        Line second = new Line(10, 11, 15 ,19);
        Line third = new Line(first.getEndPoint(), second.getStartPoint());
        System.out.println("Третья: " + third);
        third.getStartPoint().setXY(6, 9);
        third.getEndPoint().setXY(12, 13);
        System.out.println("Третья теперь: " + third);
        System.out.println("Сумма длин: " + (first.getLength()+ second.getLength()+ third.getLength()));

    }
}
