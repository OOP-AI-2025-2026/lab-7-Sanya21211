package ua.opnu;
import java.util.*;
import java.util.function.*;

public class Task5_PredicateConsumer {
    public static <T> void doIf(List<T> list, Predicate<T> condition, Consumer<T> action) {
        for (T t : list) if (condition.test(t)) action.accept(t);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 6, 9, 3, 10);
        Predicate<Integer> greaterThanFive = n -> n > 5;
        Consumer<Integer> printNum = n -> System.out.println("Значення: " + n);

        doIf(numbers, greaterThanFive, printNum);
    }
}