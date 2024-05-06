package collectionEx2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class List1 {
    public static int maxValue(ArrayList<Integer> numbers){
        return Collections.max(numbers);
    }
    public static int minValue(ArrayList<Integer> numbers){
        return Collections.min(numbers);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a limit: ");
        int limit = scanner.nextInt();

        for (int i = 0; i < limit; i++) {
            numbers.add(scanner.nextInt());
        }

        int max = maxValue(numbers);
        System.out.println("Max value is: " + max);
        int min = minValue(numbers);
        System.out.println("Min value is: " + min);
    }
}