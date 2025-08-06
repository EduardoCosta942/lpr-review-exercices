import Utils.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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

    public static void rmSalaries(Scanner scanner, double adjustment, FileWriter fileWriter) throws IOException {
        // Declare variables:
        int vectorSize;

        // Read file and record adjusted salaries
        while (scanner.hasNextLine()){
            fileWriter.write(String.valueOf(scanner.nextDouble() * (1 + adjustment/100.00)));
        }
        fileWriter.close();
    }

    public static void signPeople(File fileOfNames, File fileOfCPFs, File fileOfAges,FileWriter fileWriter) throws IOException {
        // Declare variables:
        Scanner readNames = new Scanner(fileOfNames);
        Scanner readCPFs = new Scanner(fileOfCPFs);
        Scanner readAges = new Scanner(fileOfAges);
        String[] names;
        String[] cpf;
        String[] ages;
        Person[] people = new Person[10];
        int lines;

        // Validate files
        lines = 0;
        names = new String[10];

        while (readNames.hasNextLine()){
            if (lines == 10) throw new IllegalArgumentException("Parameter fileOfNames must have 10 Lines. Have more.");
            names[lines] = readNames.nextLine();
            lines++;
        }
        readNames.close();
        if (lines!=10) throw new IllegalArgumentException("Parameter fileOfNames must have 10 Lines. Have less.");

        lines = 0;
        cpf = new String[10];
        while (readCPFs.hasNextLine()){
            if (lines==10) throw new IllegalArgumentException("Parameter fileOfCPFs must have 10 Lines. Have more.");
            cpf[lines] = readCPFs.nextLine();
            lines++;
        }
        readCPFs.close();
        if (lines!=10) throw new IllegalArgumentException("Parameter fileOfCPFs must have 10 Lines. Have less.");

        lines = 0;
        ages = new String[10];
        while (readAges.hasNextLine()){
            if (lines==10) throw new IllegalArgumentException("Parameter fileOfAges must have 10 Lines. Have more.");
            ages[lines] = readAges.nextLine();
            lines++;
        }
        readAges.close();
        if (lines!=10) throw new IllegalArgumentException("Parameter fileOfAges must have 10 Lines. Have less.");

        // Instantiate Person and store in a vector
        for (int l = 0; l < 10; l++){
            people[l] = new Person(names[l], cpf[l], Integer.parseInt(ages[l]));
        }

        // Write instances of People by FileWriter
        for (int l = 0; l < 10; l++){
            fileWriter.write(people[l].toString() + "\n");
        }
        fileWriter.close();
    }
}
