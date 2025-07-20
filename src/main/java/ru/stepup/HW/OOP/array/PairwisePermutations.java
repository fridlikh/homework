package ru.stepup.HW.OOP.array;

import java.util.ArrayList;

public class PairwisePermutations {
    public static void main(String[] args) {
        int N = 8;
        ArrayList<Integer> pairsList = new ArrayList<>(N);
        if (N % 2 != 0) {
            throw new IllegalArgumentException("N должно быть чётным числом!");
        } else {
            for (int i = 1; i <= N; i++) {
                pairsList.add(i);
            }
        }
        System.out.println(pairsList);

        for (int i = 0; i < pairsList.size(); i+=2) {
            int temp = pairsList.get(i);
            pairsList.set(i, pairsList.get(i + 1));
            pairsList.set(i + 1, temp);
        }
        System.out.println(pairsList);
    }
}
