package hospital;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.function.Supplier;

public class HospitalSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number of Patient: ");
        int numberPatient = Integer.parseInt(scanner.nextLine());
        Supplier<Patient> patientSupplier = () -> {
            System.out.print("Enter a name of Patient: ");
            String name = scanner.nextLine();
            System.out.print("Enter a emergency level of Patient: ");
            int emergency = Integer.parseInt(scanner.nextLine());

            return new Patient(name, emergency);
        };

        Queue<Patient> patientQueue = new PriorityQueue<>();
        for (int i = 0; i < numberPatient; i++) {
            Patient patient = patientSupplier.get();
            patientQueue.add(patient);
        }

        while (!patientQueue.isEmpty()) {
            Patient patient = patientQueue.poll();
            System.out.println(patient.getName() + " " + patient.getEmergency());
        }

    }
}
