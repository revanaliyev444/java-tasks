package collectionExercises;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSet1 {
    public static <T extends Comparable<T>> void removeElement(TreeSet<T> set, T element){

        Iterator<T> iterator = set.iterator();

        T nextElement = null;
        T previousElement = null;
        boolean found = false;

        while (iterator.hasNext()){
            T current = iterator.next();
            if (found){
                nextElement = current;
                break;
            }if (current.equals(element)){
                found = true;
            }
            previousElement = current;
        }
        if (nextElement != null)
            set.remove(nextElement);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>();

        System.out.println("Enter a elements: ");
        for (int i = 0; i < 5; i++) {
            set.add(scanner.nextInt());
        }
        System.out.println("Enter a element which one participate in removing process: ");
        removeElement(set, scanner.nextInt());
        System.out.println(set);
    }
}
