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
}
