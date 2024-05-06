package paymentAcc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Registration_Process {
    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AccConfig.class)) {
            Admin admin = context.getBean(UserCheck.class);
            admin.create();
        } catch (Exception e) {
            System.out.println("Invalid Operation: " + e.getMessage());
        }
    }
}