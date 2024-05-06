package collectionEx2;

import java.util.Scanner;
import java.util.Stack;

public class StackTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Əməliyyatı daxil edin:
                 1-push
                 2-pop
                 3-back
                 4-size
                 5-clear
                 6- Exit.""");
        int menu = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        switch (menu) {
            case 1:
                System.out.println("add element: ");
                stack.push(scanner.nextInt());
                break;
            case 2:
                try {
                    stack.pop();
                    //  stack.elements().equals(false);
                } catch (Exception exception) {
                    System.out.println(exception.getMessage());
                    System.out.printf("""
                            Stack Is empty
                            Error""");
                }
                break;
            case 3:
                try {
                    stack.lastElement();
                } catch (Exception exception) {
                    System.out.println(exception.getMessage());
                    System.out.printf("""
                            Stack Is empty
                            Error""");
                }
                break;
            case 4:
                stack.size();
                break;
            case 5:
                stack.clear();
                break;
            default:
                System.out.println("Exit the system !");
        }

    }
}