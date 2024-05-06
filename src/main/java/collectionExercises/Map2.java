package collectionExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map2 {
    public static Map<Integer, Integer> count(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int element : array) {
            map.merge(element, 1, Integer::sum);
        }
        return map;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a length of array: ");
        int length = scanner.nextInt();
        int [] array = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Array " + i + ":");
            array[i] = scanner.nextInt();
        }

        Map<Integer, Integer> count = count(array);
        System.out.println("Repeat nums: ");
        for (Map.Entry<Integer, Integer> entry : count.entrySet()){
            System.out.println((entry.getKey() + ": " + entry.getValue()));
        }
        System.out.println("Count size: " + count.size());
    }
}
