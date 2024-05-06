package collectionEx2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List4 {
    public static List<Integer> nonDublicate(List<Integer> numbers) {

        List<Integer> elements = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i).equals(numbers.get(j))){
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate){
                elements.add(numbers.get(i));
            }
        }
        return elements;
    }

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a elements: ");
        for (int i = 0; i < 5; i++) {
            numbers.add(scanner.nextInt());
        }

        List<Integer> duplicate = nonDublicate(numbers);
        System.out.println(duplicate);
    }
}