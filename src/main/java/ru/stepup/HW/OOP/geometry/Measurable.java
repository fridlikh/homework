package ru.stepup.HW.OOP.geometry;

import java.util.List;

public interface Measurable {
    double getLength();

    // Статический метод для вывода длин всех объектов в списке (оставляем для совместимости)
    static void printAllLengths(List<? extends Measurable> measurables) {
        for (Measurable m : measurables) {
            System.out.println("Длина: " + m.getLength());
        }
    }

    // Перегрузка для varargs (чтобы можно было передавать line1, line2, ...)
    static void printAllLengths(Measurable... measurables) {
        for (Measurable m : measurables) {
            System.out.println(m + ": Длина = " + m.getLength());
        }
    }
}


/*
// Через список (если нужен явный контроль)
List<Measurable> shapes = List.of(line, polyLine);
Measurable.printLengths(shapes);

// Через varargs (короткая запись)
Measurable.printLengths(line, polyLine);

// Через статический импорт (ещё короче)
printLengths(line, polyLine);

пример:
        Line line1 = new Line(1, 3, 5 ,8);
        PolyLine polyLine1 = new PolyLine(new Point(1, 5), new Point(2, 8), new Point(5, 3), new Point(8,9));

        Measurable.printAllLengths(line1,polyLine1);
 */