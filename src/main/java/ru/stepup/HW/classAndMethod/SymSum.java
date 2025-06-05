package ru.stepup.HW.classAndMethod;

public class SymSum {
    public static int sumLastNums(int x){
int lastDigit = (x%10);
int secondLastDigit = ((x / 10) % 10);
int sumTwoLastDigit = (lastDigit + secondLastDigit);
        return  (int) sumTwoLastDigit;
    };
}
