package collectionExercises;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSet2 {
    public static <T extends Comparable<T>> T firstMax(TreeSet<T> treeSet, T element) {
        T next = null;

        for (T current : treeSet) {
            if (current.compareTo(element) > 0) {
                next = current;
                break;
            }
        }
        return next;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> treeSet = new TreeSet<>();

        System.out.println("Enter a size of elements: ");
        int length = scanner.nextInt();

        System.out.println("Enter a elements: ");
        for (int i = 0; i < length; i++) {
            treeSet.add(scanner.nextInt());
        }
        System.out.println("Enter a participate element: ");
        int element = scanner.nextInt();

        System.out.println(firstMax(treeSet, element));
    }
}
