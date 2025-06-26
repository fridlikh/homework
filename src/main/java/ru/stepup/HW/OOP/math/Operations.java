package ru.stepup.HW.OOP.math;

public enum Operations {
    X_plus_Y {
        @Override
        public int calculate(int x, int y) {
            return x + y;
        }
    },
        X_minus_Y {
            @Override
            public int calculate ( int x, int y){
                return x - y;
            }
        },

        X_mult_Y {
            @Override
            public int calculate ( int x, int y){
                return x * y;
            }
        },

        X_div_Y {
            @Override
            public int calculate ( int x, int y){
                return x / y;
            }
        };

        public abstract int calculate(int x, int y);
    }

    /*
       System.out.println(Operations.X_plus_Y.calculate(1, 2));
        System.out.println(Operations.X_minus_Y.calculate(8, 2));
        System.out.println(Operations.X_mult_Y.calculate(3, 2));
        System.out.println(Operations.X_div_Y.calculate(6, 2));
     */

