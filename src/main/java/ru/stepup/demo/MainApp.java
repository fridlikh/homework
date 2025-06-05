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
       Point a = new Point(1,3);
       // Point b = new Point(1,3);
        Point c = new Point(5, 8);
        //System.out.println("Точка a: " + a + "; " + "Точка b: " + b + "; " + "Точка c: " + c);
        //System.out.println("Is a==b? " + (a==b) + "! " + "Is b==c? " + (b==c) + "! ");

        Line first = new Line(1, 3, 5 ,8);
        Line second = new Line(10, 11, 15 ,19);
        Line third = new Line(first.getEndPoint(), second.getStartPoint());
        System.out.println("первая " + first);
        System.out.println("вторая " + second);
        System.out.println("третья " + third);

        System.out.println("первая длина " + first.getLength());
        System.out.println("вторая длина " + second.getLength());
        System.out.println("третья длина " + third.getLength());

        third.getStartPoint().setXY(6, 9);
        third.getEndPoint().setXY(12, 13);
        System.out.println("что-то поменяли");
        System.out.println("первая " + first);
        System.out.println("вторая " + second);
        System.out.println("третья " + third);
        System.out.println("первая длина " + first.getLength());
                System.out.println("вторая длина " + second.getLength());
                        System.out.println("третья длина " + third.getLength());
        System.out.println("сумма длин " + (first.getLength()+ second.getLength()+ third.getLength()));
        //  System.out.println("Длина линии: " + s.getLength());
    }
}
