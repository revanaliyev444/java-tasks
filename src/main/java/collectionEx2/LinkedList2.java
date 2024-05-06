package collectionEx2;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Enter a elements: ");
        for (int i = 0; i < 4; i++) {
            list.add(scanner.nextInt());
        }
        int size = list.size();
        int num = size / 2;
        System.out.println(num);
    }
}
