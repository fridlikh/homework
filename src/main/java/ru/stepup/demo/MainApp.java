package ru.stepup.demo;

import ru.stepup.HW.OOP.*;
import ru.stepup.HW.arrays.*;
import ru.stepup.HW.cases.*;
import ru.stepup.HW.сycles.*;
//import java.awt.*;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        PolyLine polyLine1 = new PolyLine(new Point(1, 5), new Point(2, 8), new Point(5, 3), new Point(8,9));
        ClosedPolyLine closedPolyLine = new ClosedPolyLine(new Point(2, 7), new Point(4, 9), new Point(1, 6),new Point(8, 5));


        Measurable.printAllLengths(polyLine1, closedPolyLine);
    }
}
