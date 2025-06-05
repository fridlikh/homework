package ru.stepup.HW.arrays;

public class DeleteNegative {
    public static int[] deleteNegative(int[] arr) {
        int count = 0;
        int countSecond = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) count++;
        }
        int[] arrPositive = new int[count];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > 0) {
                arrPositive[countSecond] = arr[j];
                countSecond++;
            }
        }
        return arrPositive;
    }

    ;
}

// код для запуска
// System.out.println(Arrays.toString(DeleteNegative.deleteNegative(new int[]{1,2,-3,4,-2,2,-5})));