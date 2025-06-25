package ru.stepup.HW.OOP.geometry;

public class Point implements Cloneable {
    private int x;
    private int y;

    //оба параметра обязательные потому что указаны внутри скобок, если бы были не указаны - были бы не обязательные
    public Point(int x, int y) {
        this.x = x;
        this.y = y;

    }
    //геттеры для того чтобы заработало в других классах
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    //двойной сеттер для изменения точки
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Point other = (Point) obj;
        return x == other.x && y == other.y;
    }

    @Override
    public int hashCode() {
        return 31 * x + y;
    }

    @Override
    public Point clone() {
        try {
            return (Point) super.clone();
        } catch (CloneNotSupportedException e) {
            // Это не должно произойти, так как класс реализует Cloneable
            throw new AssertionError();
        }
    }
    //если делать соут объекта, то тустринг вызывается автоматически дефолтный, а если его прописать, то будет вызываться тот что прописан, как тут
    public String toString() {
        return "{" + x + ";" + y + "}";
    }

}

/*
       Point a = new Point(1,3);
       Point b = new Point(1,3);
        Point c = new Point(5, 8);
        System.out.println("Точка a: " + a + "; " + "Точка b: " + b + "; " + "Точка c: " + c);
        System.out.println("Is a==b? " + (a==b) + "! " + "Is b==c? " + (b==c) + "! ");
 */
