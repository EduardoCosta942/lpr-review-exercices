import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declare variables:
        Scanner scanner;
        File file;

/*        // Exercise 1:
        try {
            file = new File("src/Utils/inteiros.txt");
            scanner = new Scanner(file);
            System.out.println(Exercises.calcMedia(scanner));
        } catch (FileNotFoundException fnfe) {
            System.out.println("An error occured: " + fnfe);
        }*/

        // Ex2:
        try{
            file = new File("src/Utils/products.txt");
            System.out.println(Arrays.deepToString(Exercises.mkproducts(file)));
        } catch (FileNotFoundException fnfe) {
            System.out.println("An error occured: + fnfe");
        }
    }
}