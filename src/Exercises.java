import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Exercises {
    public static double calcMedia(Scanner scanner){
        // Declare variables:
        String file;
        char[] NUMBERS_CHAR_ARRAY = "1234567890".toCharArray();
        int amountOfNumbers;
        int average;

        // Reade file and store at var file:
        file = "";
        while (scanner.hasNextLine()) {
            file = file + scanner.nextLine();
        }

        // Sum the numbers:
        average = 0;
        amountOfNumbers = 0;
        for (int x = 0; x < file.length(); x++){
            char letter = file.toCharArray()[x];
            for (int n = 0; n < NUMBERS_CHAR_ARRAY.length; n++) {
                if (letter == NUMBERS_CHAR_ARRAY[n]) {
                    average+=Integer.parseInt(String.valueOf(NUMBERS_CHAR_ARRAY[n]));
                    amountOfNumbers++;
                }
            }
        }

        // Return average:
        return (double) average / amountOfNumbers;
    }

    public static String[][] mkproducts(File file) throws FileNotFoundException {
        // Create variables:
        Scanner scanner = new Scanner(file);
        String[] lines;
        String[] productsName;
        String[] prices;
        String[][] returnable;

        // Count amount of lines:
        int count = 0;
        while (scanner.hasNextLine()) {
            scanner.nextLine();
            count++;
        }
        scanner.close();

        // Store lines at variable lines
        lines = new String[count];
        scanner = new Scanner(file); // Re-open Scanner
        for (int x = 0; x < count; x++) {
            lines[x] = scanner.nextLine();
        }
        scanner.close();


        // Get the product name and their prices
        productsName = new String[count];
        prices = new String[count];
        for (int x = 0; x < lines.length; x++) {
            String[] line = lines[x].split(";");
            productsName[x] = line[0];
            prices[x] = line[1];
        }

        // Return
        returnable = new String[2][count];
        returnable[0] = productsName;
        returnable[1] = prices;

        return returnable;
    }
}
