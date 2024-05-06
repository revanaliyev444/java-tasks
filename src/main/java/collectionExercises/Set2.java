package collectionExercises;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Set2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String text = scanner.nextLine();

        Set<Character> single = new HashSet<>();
        Set<Character> repeat = new HashSet<>();

        for (char ch : text.toCharArray()){
            if (!single.add(ch)){
                repeat.add(ch);
            }
        }
        System.out.println(repeat);
    }
}
