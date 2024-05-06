package fileExample;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Source file name: ");
        String sourceFileName = scanner.nextLine();
        File sourceFile = new File(sourceFileName);

        if (!sourceFile.exists()) {
            System.out.println("Please enter correct file name for source!");
            main(null);
        }

        System.out.print("Destination file name: ");
        String destinationFileName = scanner.nextLine();

        String tmpLine = null;

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFileName, true))) {

            while ((tmpLine = reader.readLine()) != null) {
                writer.write(tmpLine);
                System.out.println(tmpLine);
                writer.newLine();
            }

            System.out.println(String.format("%s file's content copied to %s", sourceFile, destinationFileName));


        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}
