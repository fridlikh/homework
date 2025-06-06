package ru.stepup.HW.OOP;

public class Point {
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
