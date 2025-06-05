package ru.stepup.HW.arrays;

public class AddXInPos {
    public static int[] add(int[] arr, int x, int pos) {
        if (pos < 0 || pos > arr.length) return arr;
        int[] arrNew = new int[arr.length + 1];
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if (i != pos) arrNew[j] = arr[i];
                        else {
                arrNew[j] = x;
                arrNew[j+1] = arr[i];
                j++;
            } ;
        }
        return arrNew;
    }
}

//код для запуска
//System.out.println(Arrays.toString(AddXInPos.add(new int[]{1, 2, 3, 4, 5}, 9, 3)));
