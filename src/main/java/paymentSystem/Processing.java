package paymentSystem;

import java.util.Scanner;

public class Processing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentFactory paymentFactory = new PaymentFactory();

        System.out.println("Choose your payment type: ");
        System.out.println("card - (1) or pin - (2) ");
        String type = scanner.next();

        Payment payment = paymentFactory.paymentWay(type);
        payment.pay();
    }
}