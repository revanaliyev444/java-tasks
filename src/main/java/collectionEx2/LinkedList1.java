package collectionEx2;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList1 {
    public static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
        LinkedList<Integer> reversedLinkedList = new LinkedList<>();

        for (Integer integer : list) {
            reversedLinkedList.addFirst(integer);
        }
        return reversedLinkedList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a elements: ");
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextInt());
        }
        LinkedList<Integer> reverseList = reverseList(list);
        System.out.println(reverseList);
    }
}
