package ru.stepup.HW.сycles;
import java.util.Random;

public class GuessGame {
    public static void gssGm() {
        Random random = new Random();
        int randomNum = random.nextInt(10);
        int x = 0;
        int trys = 0;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        do {
            System.out.println("What number am I thinking (0 to 9)? :");
            x = sc.nextInt();
            trys++;
            if (x != randomNum) {
                System.out.println("No, try again");
            }

        } while (x != randomNum);
        System.out.println("Yes, it`s " + '"' + randomNum + '"');
        System.out.println("Number of tries: " + trys);
    }
}