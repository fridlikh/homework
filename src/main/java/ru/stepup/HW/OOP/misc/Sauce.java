package ru.stepup.HW.OOP.misc;

public class Sauce {
    private String name;
    private Spiciness spiciness;

    public Sauce(String name, Spiciness spiciness) {
        this.name = name;
        this.spiciness = spiciness;
    }


    public enum Spiciness {
        VERY_SPICY("Очень острый"),
        SPICY("Острый"),
        NOT_SPICY("Не острый");

        private final String description;

        Spiciness(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return description;
        }
    }

    @Override
    public String toString() {
        return "Соус " + name + ": " + spiciness;
    }
}
