package collectionExercises;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Set1 {
        public static <T> int countMethod(Set<T> set, int value) {
            int count = 0;
            for (T element : set) {
                if (element.equals(value))
                    count++;
            }
            return count;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Set<Integer> elements = new HashSet<>();

            System.out.println("Enter a elements size: ");
            int size = scanner.nextInt();

            System.out.println("Enter a elements: ");
            for (int i = 0; i < size; i++) {
                elements.add(scanner.nextInt());
            }

            System.out.println("Enter a element, which u want find: ");
            int findElements = scanner.nextInt();

            int count = countMethod(elements, findElements);
            System.out.println(count);

        }
}