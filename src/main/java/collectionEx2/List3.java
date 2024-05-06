package collectionEx2;

import java.util.ArrayList;
import java.util.Scanner;

public class List3 {
    public static ArrayList<Integer> subListMethod(ArrayList<Integer> sublists, int start, int end) {
        int min = start;
        int max = end;

        if (start > end) {
            min = end;
            max = start;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = min; i <= max && i < sublists.size(); i++) {
            list.add(sublists.get(i));
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a elements: ");
        list.add(scanner.nextInt());
        list.add(scanner.nextInt());
        list.add(scanner.nextInt());
        list.add(scanner.nextInt());
        list.add(scanner.nextInt());
        list.add(scanner.nextInt());

        System.out.print("Enter a startIndex: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter a endIndex: ");
        int endIndex = scanner.nextInt();

        ArrayList<Integer> subList = subListMethod(list, startIndex, endIndex);
        System.out.println(subList);
    }
}
