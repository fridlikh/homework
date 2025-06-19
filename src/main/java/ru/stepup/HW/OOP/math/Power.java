package ru.stepup.HW.OOP.math;

public class Power {
    private final String base;
    private final String exponent;
    private final double powerRes;

    public Power(String base, String exponent) {
        try {
            this.base = base;
            this.exponent = exponent;
            // Парсим строки в конструкторе
            int intBase = Integer.parseInt(base);
            int intExponent = Integer.parseInt(exponent);
            // Вычисляем результат сразу при создании объекта
            this.powerRes = Math.pow(intBase, intExponent);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Ошибка: основание и показатель степени должны быть целыми числами");
        }
    }

    public double getPowerResult() {
        return powerRes;
    }

    @Override
    public String toString() {
        return "'" + base + "'" + " в степени " + "'" + exponent + "'" + " равняется " + "'" + powerRes + "'";
    }
}