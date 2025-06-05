package ru.stepup.HW.arrays;

public class AddArrInPos {
    public static int[] add(int[] arr, int[] ins, int pos) {
        if (pos < 0 || pos > arr.length-1) return arr;
        int[] arrNew = new int[arr.length + ins.length];

        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if (i != pos) arrNew[j] = arr[i];
            else {
                for (int q = 0; q < ins.length; q++) {
                    arrNew[j] = ins[q];
                    j++;
                }
                arrNew[j] = arr[i];
            }
            ;
        }
        return arrNew;
    }
}

// код для запуска
// System.out.println(Arrays.toString(AddArrInPos.add(new int[]{1, 2, 3, 4, 5}, new int[]{7, 8, 9}, 4)));