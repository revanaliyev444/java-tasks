package collectionEx2;

import java.util.ArrayList;
import java.util.Scanner;

public class List2 {
    public static String reverseMethod(ArrayList<String> elements){
        String str = " ";
        for (int i = elements.size() - 1; i >= 0; i--) {
            str += elements.get(i) + " ";
        }
        return str;
    }

    public static void main(String[] args) {
        ArrayList<String> reverseElements = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a elements: ");
        reverseElements.add(scanner.nextLine());
        reverseElements.add(scanner.nextLine());
        reverseElements.add(scanner.nextLine());

        String reverse = reverseMethod(reverseElements);
        System.out.println(reverse);
    }
}
