package collectionExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map1 {
    public static int count(String text) {
        Map<String, Integer> map = new HashMap<>();

        for (String word : text.split(" ")) {
            map.merge(word.toLowerCase(), 1, Integer::sum);
        }
        return map.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String text = scanner.nextLine();

        int count = count(text);
        System.out.println(count);

    }
}