package paymentSystem;

import java.util.Scanner;

public class Card implements Payment {
    @Override
    public void pay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a card number: ");
        String num = scanner.nextLine();

        boolean isCorrect = true;

        if (num.length() != 8) {
            isCorrect = false;
        } else {
            for (int i = 0; i < num.length(); i++) {
                if (!Character.isDigit(num.charAt(i))) {
                    isCorrect = false;
                    break;
                }
            }
        }
        if (!isCorrect) {
            System.out.println("It's not correct card number");
        } else {
            System.out.println("Operation is correct");
        }
    }
}