package ru.stepup.HW.arrays;

public class FindAllXes {
    public static int[] findAll(int[] arr, int x) {
            int count = 0;
            int countSecond = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == x) count++;
            }
            int[] arrNew = new int[count];
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == x) {
                    arrNew[countSecond] = j;
                    countSecond++;
                }

            }
            return arrNew;
        }
        ;
    }
    // код для запуска
    // System.out.println(Arrays.toString(FindAllXes.findAll(new int[]{1, 2, 3, 2, 5, 7, 2, 9, 1}, 2)));