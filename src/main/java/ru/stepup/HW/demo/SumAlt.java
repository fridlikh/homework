package ru.stepup.HW.demo;

public class SumAlt {
    public static void main(String[] args) {
        double result = 0;
        boolean firstNumber = true; // Флаг для первого числа чтобы перед ним не ставилась запятая
        StringBuilder numbersList = new StringBuilder();
        // Проверяем, переданы ли аргументы
        if (args.length == 0) {
            System.out.println("Numbers must be specified as command line arguments.");
        }
        for (String arg : args) {
            if (arg.matches("[-+]?\\d+([.,]\\d+)?")) /*
           [-+]? [-+] – один из двух символов: - (минус) или + (плюс) ? – предыдущий элемент ([-+]) может отсутствовать (0 или 1 раз). Пример: "", "+", "-"
           \\d+ \\d – цифра (0-9) (экранирование \ требуется в Java-строках) + – одна или больше цифр. Пример: "0", "123"

            */

                {

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
            }
        }
        if (args.length > 0) {
            System.out.println("The sum of the numbers: " + numbersList.toString().trim() + " = " + result);
        }
    }
}