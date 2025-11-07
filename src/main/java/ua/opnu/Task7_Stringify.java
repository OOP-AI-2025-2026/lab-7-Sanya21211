package ua.opnu;
import java.util.*;
import java.util.function.Function;

public class Task7_Stringify {
    public static String[] stringify(int[] input, Function<Integer, String> f) {
        String[] result = new String[input.length];
        for (int i = 0; i < input.length; i++) result[i] = f.apply(input[i]);
        return result;
    }

    public static void main(String[] args) {
        Function<Integer, String> numToWord = n -> {
            switch (n) {
                case 0: return "нуль";
                case 1: return "один";
                case 2: return "два";
                case 3: return "три";
                case 4: return "чотири";
                case 5: return "п’ять";
                case 6: return "шість";
                case 7: return "сім";
                case 8: return "вісім";
                case 9: return "дев’ять";
                default: return "?";
            }
        };

        int[] digits = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] words = stringify(digits, numToWord);
        System.out.println("Слова: " + Arrays.toString(words));
    }
}