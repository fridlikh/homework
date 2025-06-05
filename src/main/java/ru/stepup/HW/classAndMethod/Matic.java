package ru.stepup.HW.classAndMethod;

public class Matic {
    public static double fraction(double x) {
        // Получаем целую часть числа
        int intPart = (int) x;
        // Вычисляем дробную часть
        double fractionPart = x - intPart;
        // Обеспечиваем точность до трёх знаков после запятой
        fractionPart = Math.round(fractionPart * 1000.0) / 1000.0;


        return (double) fractionPart;
    }
}
