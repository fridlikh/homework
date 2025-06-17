package ru.stepup.HW.OOP;

public class Point3D extends Point {
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    // Геттер для координаты Z
    public int getZ() {
        return z;
    }

    // Сеттер для изменения всех трех координат
    public void setXYZ(int x, int y, int z) {
        setXY(x, y); // Используем родительский метод для установки X и Y
        this.z = z;
    }

    // Переопределение метода toString() для вывода всех трех координат
    @Override
    public String toString() {
        return "{" + getX() + ";" + getY() + ";" + z + "}";
    }
}
