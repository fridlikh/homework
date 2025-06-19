package ru.stepup.HW.OOP.students;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private final List<Integer> grades = new ArrayList<>();

    public Student(String name, Integer... grades) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Имя обязательно!");
        }
        this.name = name;

        if (grades != null) {
            for (Integer grade : grades) {
             addGrade(grade);
            }
        }
    }

    // Добавление оценки
    public void addGrade(Integer grade) {
        if (grade != null && grade >= 2 && grade <= 5) {
            grades.add(grade);
        } else
            throw new IllegalArgumentException("Оценка должна быть в диапазоне от 2 до 5!");
    }

    public List<Integer> getGrades() {
        return new ArrayList<>(grades); // Возвращаем копию списка оценок
    }

    @Override
    public String toString() {
        return name + ": " + new ArrayList<>(grades)
                ;
    }
}

/*
        Student s1 = new Student("Олег");
        Student s2 = new Student("Семён", 5,4,2);
        System.out.println(s1);
        System.out.println(s2);
        s2.addGrade(2);
        System.out.println(s2);
        System.out.println(s2.getGrades());
        s2.addGrade(2);
        System.out.println(s2.getGrades());
 */