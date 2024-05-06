package leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LettersOfDigits {
    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        for (char digit : digits.toCharArray()) {
            char[] letters = getLetters(digit);
            result = generateCombinations(result, letters);
        }
        return result;
    }

    private static char[] getLetters(char digit) {
        return switch (digit) {
            case '2' -> new char[]{'a', 'b', 'c'};
            case '3' -> new char[]{'d', 'e', 'f'};
            case '4' -> new char[]{'g', 'h', 'i'};
            case '5' -> new char[]{'j', 'k', 'l'};
            case '6' -> new char[]{'m', 'n', 'o'};
            case '7' -> new char[]{'p', 'q', 'r', 's'};
            case '8' -> new char[]{'t', 'u', 'v'};
            case '9' -> new char[]{'w', 'x', 'y', 'z'};
            default -> new char[0];
        };
    }

    private static List<String> generateCombinations(List<String> existCombinations, char[] letters) {
        List<String> newCombinations = new ArrayList<>();
        for (String combination : existCombinations) {
            for (char letter : letters) {
                newCombinations.add(combination + letter);
            }
        }
        return newCombinations;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter digits");
        String digits = scanner.next();
        List<String> result = letterCombinations(digits);
        System.out.println(result);
    }
}
