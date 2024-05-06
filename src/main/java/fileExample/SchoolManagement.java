package fileExample;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SchoolManagement {
    public static final String FILE_NAME = "students.txt";
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        SchoolManagement manager = new SchoolManagement();

        Student student1 = manager.getNewStudent();
        Student student2 = manager.getNewStudent();
        Student student3 = manager.getNewStudent();

        manager.registerStudent(student1);
        manager.registerStudent(student2);
        manager.registerStudent(student3);

        manager.getAllStudents()
                .forEach(student -> {
                    System.out.println("Name: " + student.getName());
                });

    }


    public Student getNewStudent() {

        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Surname: ");
        String surname = scanner.nextLine();
        System.out.print("Age: ");
        int age = Integer.parseInt(scanner.nextLine());

        Student student = new Student(
                Math.abs(new Random().nextInt() % 10000), name, surname, age
        );

        return student;
    }

    public void registerStudent(Student student) {
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(FILE_NAME, true))) {
            writer.write(student.toString());
            writer.newLine();
            System.out.println("Student with id %d registered successfully!".formatted(student.getId()));
        } catch (IOException e) {
            System.out.println("Error occured during student registration!");
            System.out.println(e.getLocalizedMessage());
        }
    }

    public List<Student> getAllStudents() {
        List<Student> studentList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {

            String tmpLine = null;

            while ((tmpLine = reader.readLine()) != null) {
                studentList.add(Student.fromString(tmpLine));
            }

            System.out.println("Students data read from file. Size %d".formatted(studentList.size()));


        } catch (IOException e) {
            System.out.println("Error occurred during reading students data!");
            System.out.println(e.getMessage());
        }

        return studentList;
    }
}