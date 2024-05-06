package paymentSystem;

import java.util.Scanner;

public class Pin implements Payment {
    @Override
    public void pay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Pincode: ");
        String pin = scanner.next();

        boolean isCorrect = pin.matches("[a-zA-Z]\\d{4}");

        if (!isCorrect) {
            System.out.println("Pincode is not correct");
        } else {
            System.out.println("Pincode is correct");
        }
    }
}