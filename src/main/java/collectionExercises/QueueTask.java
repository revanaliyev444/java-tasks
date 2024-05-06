package collectionExercises;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Queue<Integer> numbers = new LinkedList<>();

        System.out.println("Enter a length of numbers: ");
        int length = scanner.nextInt();

        System.out.println("Enter a numbers: ");
        for (int i = 0; i < length; i++) {
            numbers.add(scanner.nextInt());
        }
        System.out.println("Enter a number, which u want filtering: ");
        int filterNumber = scanner.nextInt();

        int originalSize = numbers.size();
        for (int i = 0; i < originalSize; i++) {
            int currentNumber = numbers.poll();
            if (currentNumber <= filterNumber) {
                numbers.add(currentNumber);
            }
        }
        System.out.println(numbers);
    }
}
