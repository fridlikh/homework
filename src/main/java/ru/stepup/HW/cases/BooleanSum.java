package ru.stepup.HW.cases;

public class BooleanSum {
    public static boolean sum3(int x, int y, int z){
          return (x == y + z) || (y == x + z) || (z == x + y);

    };
}
