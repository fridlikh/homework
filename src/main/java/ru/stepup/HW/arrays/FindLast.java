package ru.stepup.HW.arrays;

public class FindLast {
    public static int fndLst(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    ;
}
