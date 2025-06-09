package ru.stepup.demo;

import ru.stepup.HW.OOP.*;
import ru.stepup.HW.arrays.*;
import ru.stepup.HW.cases.*;
import ru.stepup.HW.сycles.*;
//import java.awt.*;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {

        Student s1 = new Student("Олег");
        Student s2 = new Student("Семён", 5,4,2);
        System.out.println(s1);
        System.out.println(s2);
        s2.addGrade(2);
        System.out.println(s2);
        System.out.println(s2.getGrades());
        s2.addGrade(2);
        System.out.println(s2.getGrades());

    }
}
