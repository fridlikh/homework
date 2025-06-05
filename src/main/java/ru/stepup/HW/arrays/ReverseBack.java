package ru.stepup.HW.arrays;
import java.util.Arrays;

public class ReverseBack {
    public static int[] reverseBack(int[] arr){
        int[] arr1 = new int [arr.length];
        for (int i = 0; i < arr.length; i++){
            arr1[i] = arr[arr.length - 1 - i];
        }
        return arr1;
    };
}

//  Строка запуска:
//  System.out.println(Arrays.toString(ReverseBack.reverseBack(new int[]{1, 2, 3, 4, 5})));