package ru.stepup.HW.OOP.geometry;

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
        if (getPointCount() >= 2) { // Используем getPointCount() вместо getPoints()
            Point first = getPoint(0); // Получаем первую точку
            Point last = getPoint(getPointCount() - 1); // Получаем последнюю точку
            if (!first.equals(last)) {
                super.addPoint(new Point(first.getX(), first.getY()));
            }
        }
    }

    // Переопределяем добавление точки, чтобы линия оставалась замкнутой
    @Override
    public void addPoint(Point point) {
        super.addPoint(point); // Добавляем точку как обычно
        closeLine();           // Проверяем, нужно ли замыкание
    }

    @Override
    public double getLength() {
        // Используем реализацию из PolyLine
        double length = super.getLength();

        // Добавляем замыкающий отрезок только если линия не замкнута
        if (getPointCount() >= 2) {
            Point first = getPoint(0);
            Point last = getPoint(getPointCount() - 1);
            if (!first.equals(last)) {
                length += Math.hypot(first.getX() - last.getX(),
                        first.getY() - last.getY());
            }
        }

        return length;
    }

    // Переопределяем toString для ясности
    @Override
    public String toString() {
        return "Замкнутая ломаная " + getPoints();
    }
}