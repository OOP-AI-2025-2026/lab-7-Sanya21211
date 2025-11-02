package ua.opnu;

import java.util.*;
import java.util.function.Consumer;

public class Task4_ConsumerStudents {
    static class Student {
        String name, surname;
        Student(String name, String surname) { this.name = name; this.surname = surname; }
    }

    public static void forEachStudent(List<Student> students, Consumer<Student> consumer) {
        for (Student s : students) consumer.accept(s);
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Іван", "Петренко"),
                new Student("Марія", "Іванова"),
                new Student("Олег", "Коваленко")
        );

        Consumer<Student> printFullName = s -> System.out.println(s.surname + " " + s.name);
        forEachStudent(students, printFullName);
    }
}