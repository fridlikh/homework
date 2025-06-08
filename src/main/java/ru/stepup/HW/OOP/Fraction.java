package ru.stepup.HW.OOP;

public class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator <= 0)
            throw new IllegalArgumentException("Знаменатель не может быть меньше или равен нулю");
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
    // Сложение с другой дробью
    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return simplify(newNumerator, newDenominator);
    }

    // Сложение с целым числом (перегрузка метода add)
    public Fraction add(int number) {
        Fraction other = new Fraction(number, 1);
        return this.add(other);
    }

    // Вычитание другой дроби
    public Fraction subtract(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return simplify(newNumerator, newDenominator);
    }

    // Вычитание целого числа (перегрузка метода subtract)
    public Fraction subtract(int number) {
        Fraction other = new Fraction(number, 1);
        return this.subtract(other);
    }

    // Упрощение дроби (сокращение на НОД)
    private Fraction simplify(int numerator, int denominator) {
        int gcd = findGCD(Math.abs(numerator), Math.abs(denominator));
        return new Fraction(numerator / gcd, denominator / gcd);
    }

    // Нахождение НОД (алгоритм Евклида)
    private int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
