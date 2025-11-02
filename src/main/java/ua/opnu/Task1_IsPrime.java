package ua.opnu;
import java.util.function.Predicate;

public class Task1_IsPrime {
    public static void main(String[] args) {
        Predicate<Integer> isPrime = n -> {
            if (n < 2) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        System.out.println("Прості числа до 20:");
        for (int i = 1; i <= 20; i++) {
            if (isPrime.test(i)) System.out.print(i + " ");
        }
    }
}