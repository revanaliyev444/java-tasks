package collectionExercises;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Set3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        System.out.println("Enter a set's size: ");
        int size = scanner.nextInt();

        System.out.println("Enter a elements: ");
        for (int i = 0; i < size; i++) {
            set.add(scanner.nextInt());
        }

        int max = -1;
        int min = -1;

        for (int num:
                set) {
            if (max == -1){
                max = num;
            } else if (num > max) {
                max = num;
            }
        }
        for (int num:
                set) {
            if (min == -1){
                min = num;
            }else if(num < min){
                min = num;
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
