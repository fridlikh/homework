package ru.stepup.HW.arrays;

public class CountPositive {
    public static int cntPos(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i]>0) count++;
        }
        return count;
    };
}
