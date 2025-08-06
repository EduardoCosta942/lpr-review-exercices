import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declare variables:
        Scanner scanner;
        File file;
        FileWriter fileWriter;

/*        // Exercise 1:
        try {
            file = new File("src/Utils/inteiros.txt");
            scanner = new Scanner(file);
            System.out.println(Exercises.calcMedia(scanner));
        } catch (FileNotFoundException fnfe) {
            System.out.println("An error occured: " + fnfe);
        }*/

/*        // Ex2:
        try{
            file = new File("src/Utils/products.txt");
            System.out.println(Arrays.deepToString(Exercises.mkproducts(file)));
        } catch (FileNotFoundException fnfe) {
            System.out.println("An error occured: + fnfe");
        }*/

        // Ex3:
        try{
            file = new File("src/Utils/salaries.txt");
            scanner = new Scanner(file);
            fileWriter = new FileWriter("src/Utils/adjusted_salaries.txt");
            Exercises.rmSalaries(scanner, 100, fileWriter);
        } catch (IOException ioe){
            System.out.println("An error occurred: " + ioe);
        }

    }
}