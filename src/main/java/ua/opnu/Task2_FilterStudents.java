package ua.opnu;
import java.util.*;
import java.util.function.Predicate;

public class Task2_FilterStudents {
    static class Student {
        private String name;
        private String group;
        private int[] marks;

        public Student(String name, String group, int[] marks) {
            this.name = name;
            this.group = group;
            this.marks = marks;
        }

        public boolean hasDebt() {
            for (int m : marks) if (m < 60) return true;
            return false;
        }

        @Override
        public String toString() {
            return name + " (" + group + ") " + Arrays.toString(marks);
        }
    }

    public static List<Student> filterStudents(List<Student> students, Predicate<Student> p) {
        List<Student> result = new ArrayList<>();
        for (Student s : students) if (p.test(s)) result.add(s);
        return result;
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Іван Петренко", "AТ-221", new int[]{90, 75, 100}),
                new Student("Олег Коваленко", "AД-224", new int[]{50, 65, 70}),
                new Student("Марія Іванова", "AI-247", new int[]{85, 88, 90})
        );

        Predicate<Student> noDebts = s -> !s.hasDebt();
        List<Student> passed = filterStudents(students, noDebts);

        System.out.println("Студенти без заборгованостей:");
        for (Student s : passed) System.out.println(s);
    }
}