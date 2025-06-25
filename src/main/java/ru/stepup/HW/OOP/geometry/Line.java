package ru.stepup.HW.OOP.geometry;

public class Line implements Measurable, Cloneable {
   private Point startPoint;
   private Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;

    }

    public Line(int x1, int y1, int x2, int y2) {
        this.startPoint = new Point(x1, y1);
        this.endPoint = new Point(x2, y2);
    }

    @Override
    public double getLength() {
        return Math.sqrt(Math.pow((endPoint.getX() - startPoint.getX()), 2) + Math.pow((endPoint.getY() - startPoint.getY()), 2));
    }

    //Геттеры для точек чтобы можно было к ним обращаться из мэйна
    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public String toString() {
        return "Линия " + "от " + startPoint + " до " + endPoint;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Line other = (Line) obj;
        return startPoint.equals(other.startPoint) && endPoint.equals(other.endPoint); //Сравнивает не ссылки на точки (startPoint == other.startPoint), а их содержимое через equals().
    }

    @Override
    public int hashCode() {
        return 31 * startPoint.hashCode() + endPoint.hashCode();
    }

    @Override
    public Line clone() {
        try {
            Line cloned = (Line) super.clone();
            cloned.startPoint = startPoint.clone();
            cloned.endPoint = endPoint.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Не произойдёт, так как Line реализует Cloneable
        }
    }
}

/* Хотелось бы так, но так НЕ работает в Java!
    public Line() {
        this.startPoint = new Point();  // "Сам запроси x,y"
        this.endPoint = new Point();    // "Сам запроси x,y"
    }
Point требует числа при создании
Класс Point уже имеет конструктор типа Point(int x, int y). Его нельзя вызвать без параметров.
Line должен получить эти числа откуда-то
Есть только три варианта:
Получить готовые Point (первый конструктор)
Получить 4 числа (второй конструктор)
Получить их из внешнего источника (например, Scanner)
 */


  /*    //Запуск для выполнения задания
        Line first = new Line(1, 3, 5 ,8);
        Line second = new Line(10, 11, 15 ,19);
        Line third = new Line(first.getEndPoint(), second.getStartPoint());
        System.out.println("Третья: " + third);
        third.getStartPoint().setXY(6, 9);
        third.getEndPoint().setXY(12, 13);
        System.out.println("Третья теперь: " + third);
        System.out.println("Сумма длин: " + (first.getLength()+ second.getLength()+ third.getLength()));

   */