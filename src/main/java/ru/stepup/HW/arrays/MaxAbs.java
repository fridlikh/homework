package ru.stepup.HW.arrays;

public class MaxAbs {
    public static int mxAbs(int[] arr) {
        int maxAbs = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int cur = arr[i];
            if ((cur < 0 ? -cur : cur) > (maxAbs < 0 ? -maxAbs : maxAbs)) {
                maxAbs = cur;
            }
        }
        return maxAbs;
    }
}
