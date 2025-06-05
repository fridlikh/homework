package ru.stepup.HW.arrays;

public class FindFirst {
    public static int fndFrst(int[] arr, int x){
            for(int i=0; i<arr.length; i++){
            if(arr[i]==x) return i;
        }
        return -1;
    };

}
