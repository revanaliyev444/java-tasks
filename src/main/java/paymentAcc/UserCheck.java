package paymentAcc;

import java.util.Scanner;

public class UserCheck implements Admin {
    public void create() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a name: ");
            String name = scanner.nextLine();
            if (!name.matches("[a-zA-Z]+")) {
                throw new IllegalArgumentException("Invalid name");
            }

            System.out.println("Enter a surname: ");
            String surname = scanner.nextLine();
            if (!surname.matches("[a-zA-Z]+")) {
                throw new IllegalArgumentException("Invalid surname");
            }

            System.out.println("Enter a FIN: ");
            String fin = scanner.nextLine();
            if (!fin.matches("[a-zA-Z]\\d{4}")) {
                throw new IllegalArgumentException("Invalid FIN");
            }

            System.out.println("Registration is successful");
        } catch (Exception e) {
            System.out.println("Registration failed: " + e.getMessage());
        }

    }
}