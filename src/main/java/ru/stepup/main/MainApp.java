package ru.stepup.main;

import ru.stepup.HW.OOP.geometry.*;
import ru.stepup.HW.OOP.misc.Sauce;


public class MainApp {
    public static void main(String[] args) {

        Sauce mayo = new Sauce("mayo", Sauce.Spiciness.NOT_SPICY);
        Sauce ketchup = new Sauce("ketchup", Sauce.Spiciness.SPICY);
        Sauce tabasco = new Sauce("tabasco", Sauce.Spiciness.VERY_SPICY);
        System.out.println(mayo);
        System.out.println(ketchup);
        System.out.println(tabasco);

    }
}
