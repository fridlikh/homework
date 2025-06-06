package ru.stepup.demo;

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

        Point a = new Point(1, 5);
        Point b = new Point(2, 8);
        Point c = new Point(5, 3);

        PolyLine line1 = new PolyLine(a, b, c, new Point(8,9)); // для примера 4 точка добавлена иным способом
        System.out.println("Общая длина ломаной через точки: " + line1.getLength());
       // System.out.println(line1);
        System.out.println(line1.getLines());
        System.out.println("Общая длина ломаной через линии: " + line1.getLengthThroughLines());
        System.out.println("Оба варианта расчета длины верны? " + (line1.getLength() == line1.getLengthThroughLines()));
        line1.setPointXY(1, 12,8);
        System.out.println(line1.getLines());

    }
}
