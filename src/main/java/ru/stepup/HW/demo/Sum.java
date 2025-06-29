package ru.stepup.HW.demo;

public class Sum {
    public static void main(String[] args) {
        double result = 0;
        boolean firstNumber = true; // Флаг для первого числа чтобы перед ним не ставилась запятая
        StringBuilder numbersList = new StringBuilder();
        // Проверяем, переданы ли аргументы
        if (args.length == 0) {
            System.out.println("Numbers must be specified as command line arguments.");
        }
        for (String arg : args) {
            try {
                // Заменяем запятую на точку для унификации
                String normalizedArg = arg.replace(',', '.');

                // Пытаемся преобразовать аргумент в число
                double number = Double.parseDouble(normalizedArg);

                result += number;

                // Добавляем запятую перед числом, если это не первое число
                if (!firstNumber) {
                    numbersList.append(", ");
                } else {
                    firstNumber = false;
                }

                numbersList.append(number);
            } catch (NumberFormatException e) {
                // Если преобразование не удалось, выводим сообщение об ошибке
                System.out.println("Error: '" + arg + "' is not a number!");

            }
        }
        if (args.length > 0) {
            System.out.println("The sum of the numbers: " + numbersList.toString().trim() + " = " + result);
        }
    }
}
