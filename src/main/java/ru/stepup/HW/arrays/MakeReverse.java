package ru.stepup.HW.arrays;

import java.util.Arrays;

public class MakeReverse {
    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        ;
    }
}

/*Код для запуска:
int[] arr = {1, 2, 3, 4, 5};
        MakeReverse.reverse(arr);
        System.out.println(Arrays.toString(arr));*/