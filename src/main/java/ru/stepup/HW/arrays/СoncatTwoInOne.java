package ru.stepup.HW.arrays;

public class СoncatTwoInOne {
    public static int[] concat(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            arr3[arr1.length + j] = arr2[j];
        }
        return arr3;
    }
}

//код для запуска:
//System.out.println(Arrays.toString(СoncatTwoInOne.concat(new int[]{1, 2, 3, 4, 5}, new int[]{11, 22, 33, 44, 55})));
