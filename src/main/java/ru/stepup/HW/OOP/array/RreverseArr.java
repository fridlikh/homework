package ru.stepup.HW.OOP.array;

import java.util.ArrayList;

//Перед вами код метода, который переставляет числа в массиве в обратном порядке.

//Для массива
public class RreverseArr {
    public static void reverse(int[] intArray) {
        int n = intArray.length - 1;
        for (int i = 0; i < intArray.length / 2; i++) {
            int temp = intArray[i];
            intArray[i] = intArray[n - i];
            intArray[n - i] = temp;
        }
    }

    //Для списка
    public static void reverse(ArrayList<Integer> list) {
        int n = list.size() - 1;
        for (int i = 0; i < list.size() / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(n - i));
            list.set(n - i, temp);
        }
    }
}
