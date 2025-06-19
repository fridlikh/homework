package ru.stepup.main;

import ru.stepup.HW.OOP.geometry.ClosedPolyLine;
import ru.stepup.HW.OOP.geometry.Measurable;
import ru.stepup.HW.OOP.geometry.Point;
import ru.stepup.HW.OOP.geometry.PolyLine;
//import java.awt.*;


public class MainApp {
    public static void main(String[] args) {

        PolyLine polyLine1 = new PolyLine(new Point(1, 5), new Point(2, 8), new Point(5, 3), new Point(8,9));
        ClosedPolyLine closedPolyLine = new ClosedPolyLine(new Point(2, 7), new Point(4, 9), new Point(1, 6),new Point(8, 5));


        Measurable.printAllLengths(polyLine1, closedPolyLine);
    }
}
