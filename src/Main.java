import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declare variables:
        Scanner scanner;
        File file;
        Path path;

        // Exercise 1:
        try {
            file = new File("src/Utils/inteiros.txt");
            scanner = new Scanner(file);
            System.out.println(Exercises.calcMedia(scanner));
        } catch (FileNotFoundException fnfe) {
            System.out.println("An error occured: " + fnfe);
        }

    }
}