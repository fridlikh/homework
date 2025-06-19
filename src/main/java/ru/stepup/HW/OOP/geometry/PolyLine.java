package ru.stepup.HW.OOP.geometry;

import java.util.ArrayList;
import java.util.List;

public class PolyLine implements Measurable{
    private final List<Point> points = new ArrayList<>();

    // Конструктор без точек (пустая линия)
    public PolyLine() {}

    // Конструктор с любым количеством точек
    public PolyLine(Point... points) { // После того как ты напишешь new PolyLine(p1, p2, p3) - Java АВТОМАТИЧЕСКИ делает следующее: Берёт все переданные точки (p1, p2, p3). Упаковывает их в массив Point[]. Передаёт этот массив в конструктор. То есть внутри конструктора points - это обычный массив типа Point[].
        for (Point p : points) {      // Это упрощённый цикл for, он делает: Берёт массив points (который Java сделала из наших аргументов). Последовательно достаёт из него каждую точку и временно называет её p. Для каждой точки p выполняет this.points.add(p)
            if (p != null) {          // Проверка на null
                this.points.add(p);   // this.points - это наш внутренний список точек линии (поле класса) .add(p) - команда "добавить текущую точку в этот список"
            }
        }
    }

    // Добавление точки когда линия уже создана
    public void addPoint(Point point) {
        if (point != null) {
            points.add(point);
        }
    }

    public void setPointXY(int index, int x, int y) {
        if (index < 0 || index >= points.size()) {
            throw new IndexOutOfBoundsException("Неверный индекс точки: " + index);
        }
        points.get(index).setXY(x, y); // Используем существующий метод в Point
    }

    // Получение списка точек (защитная копия). Нужен для просмотра точек линии извне
    public List<Point> getPoints() {
        return new ArrayList<>(points);
    }

    // Формирование списка линий (отрезков)
    public List<Line> getLines() {
        List<Line> lines = new ArrayList<>();

        if (points.size() < 2) {
            System.out.println("Точек меньше двух, линий нет");
            return lines; // Возвращаем пустой список, если точек меньше 2
        }
        for (int i = 0; i < points.size() - 1; i++) {
            lines.add(new Line(points.get(i), points.get(i + 1)));
        }
        return lines;
    }

    // Возвращает общую длину ломаной линии через точки
    @Override
    public double getLength() {
        double length = 0.0;

        if (points.size() < 2) {
            System.out.println("Точек меньше двух, линий нет");
            return length; // 0 если точек меньше 2
        }
        for (int i = 0; i < points.size() - 1; i++) {
            Point current = points.get(i);
            Point next = points.get(i + 1);
            length += Math.sqrt(Math.pow((next.getX() - current.getX()), 2) + Math.pow((next.getY() - current.getY()), 2));
        }

        return length;
    }
    // Возвращает общую длину ломаной линии через линии
    public double getLengthThroughLines() {
        if (points.size() < 2) {
            System.out.println("Точек меньше двух, линий нет");
            return 0.0;
        }

        double length = 0.0;
        List<Line> lines = getLines(); // Используем метод getLines()

        for (Line line : lines) {
            length += line.getLength(); // Суммируем длины всех линий
        }

        return length;
    }
    public int getPointCount() { return points.size(); }
    public Point getPoint(int index) { return points.get(index); }

    public String toString() {
        return "Ломаная " + points ;
    }

}

/*        Point a = new Point(1, 5);
        Point b = new Point(2, 8);
        Point c = new Point(5, 3);

        PolyLine line1 = new PolyLine(a, b, c, new Point(8,9)); // для примера 4 точка добавлена иным способом
        System.out.println("Общая длина ломаной через точки: " + line1.getLength());
       // System.out.println(line1);
        System.out.println(line1.getLines());
        System.out.println("Общая длина ломаной через линии: " + line1.getLengthThroughLines());
        System.out.println("Оба варианта расчета длины верны? " + (line1.getLength() == line1.getLengthThroughLines()));
        line1.setPointXY(1, 12,8);
        System.out.println(line1.getLines());
*/