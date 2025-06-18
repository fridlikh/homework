package ru.stepup.HW.OOP;

import java.util.List;

public class ClosedPolyLine extends PolyLine {
    public ClosedPolyLine() {
        super();
    }

    public ClosedPolyLine(Point... points) {
        super(points);
        closeLine();
    }

    // Метод для замыкания линии (добавляет первую точку в конец, если она ещё не там)
    private void closeLine() {
        List<Point> points = getPoints(); // Получаем текущие точки
        if (points.size() >= 2) { // Если точек достаточно для замыкания
            Point first = points.get(0);
            Point last = points.get(points.size() - 1);
            if (!first.equals(last)) { // Если первая и последняя точки не совпадают
                addPoint(new Point(first.getX(), first.getY())); // Добавляем копию первой точки в конец
            }
        }
    }

    // Переопределяем добавление точки, чтобы линия оставалась замкнутой
    @Override
    public void addPoint(Point point) {
        super.addPoint(point); // Добавляем точку как обычно
        closeLine();           // Проверяем, нужно ли замыкание
    }

    // Переопределяем метод получения длины с учётом замкнутости
    @Override
    public double getLength() {
        List<Point> points = getPoints();
        if (points.size() < 2) {
            return 0.0;
        }
        // Добавляем отрезок от последней точки к первой
        Point first = points.get(0);
        Point last = points.get(points.size() - 1);
        double length = super.getLength(); // Берём длину как у обычной линии
        length += Math.sqrt(Math.pow((first.getX() - last.getX()), 2) +
                Math.pow((first.getY() - last.getY()), 2));
        return length;
    }

    // Переопределяем toString для ясности
    @Override
    public String toString() {
        return "Замкнутая линия " + getPoints();
    }
}
