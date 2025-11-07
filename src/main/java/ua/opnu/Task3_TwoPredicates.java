package ua.opnu;
import java.util.*;
import java.util.function.Predicate;

public class Task3_TwoPredicates {
    public static <T> List<T> filterByTwoPredicates(List<T> list, Predicate<T> p1, Predicate<T> p2) {
        List<T> result = new ArrayList<>();
        for (T t : list) if (p1.and(p2).test(t)) result.add(t);
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 5, 6, 7, 8, 9);

        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> greaterThan5 = n -> n > 5;

        List<Integer> result = filterByTwoPredicates(numbers, isEven, greaterThan5);
        System.out.println("Парні числа > 5: " + result);
    }
}