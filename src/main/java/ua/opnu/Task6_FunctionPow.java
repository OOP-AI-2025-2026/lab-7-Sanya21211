package ua.opnu;
import java.util.*;
import java.util.function.Function;

public class Task6_FunctionPow {
    public static int[] processArray(int[] input, Function<Integer, Integer> f) {
        int[] result = new int[input.length];
        for (int i = 0; i < input.length; i++) result[i] = f.apply(input[i]);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        Function<Integer, Integer> powOfTwo = n -> (int) Math.pow(2, n);

        int[] powered = processArray(arr, powOfTwo);
        System.out.println("2^n для масиву: " + Arrays.toString(powered));
    }
}
