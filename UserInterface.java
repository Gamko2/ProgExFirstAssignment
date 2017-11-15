package firstturninjava;

import java.util.Scanner;

/**
 * This program implements the UserInterface for converting a decimal number
 * into a binary number.
 *
 * @version 1.0
 * @author Marc Bambey
 * @since 14.11.2017
 */
public class UserInterface {

    private int number;

    /**
     * This function gets the user input and saves it in the String input
     *
     * @return This returns the saved user input
     */
    public String getInput() {
        System.out.println("Please type in a number: ");
        Scanner x = new Scanner(System.in);
        String input = x.next();
        return input;
    }

    /**
     * This function checks if the input is either q or Q to terminate.
     *
     * @param input This is the input from the user
     * @return Either returns true if the input is q or Q or false if it isn't
     */
    public boolean checkForTermination(String input) {
        if (input.contentEquals("Q") || input.contentEquals("q")) {
            return true;
        }
        return false;
    }

    /**
     * This function converts the String input into a an Integer if possible
     *
     * @param input This is the input string
     * @return Returns either true if the conversion was successfull or false if
     * it wasn't
     */
    public boolean convertToInt(String input) {
        try {
            int number = Integer.parseInt(input);
            this.number = number;
            return true;
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Wrong Input");
            return false;
        }
    }

    /**
     * This function prints the number it gets in binary formar using the
     * StoreDecimal functions
     *
     * @param number This is the number the user entered
     */
    public void printBinary(int number) {
        if (-128 <= number && number <= 127) {
            StoreDecimal decimal = new StoreDecimal(number);
            System.out.println(decimal.getBinary() + " "
                    + decimal.getDecimal());
        } else {
            System.out.println("Wrong Number");
        }
    }

    /**
     * This is the main function. It runs until the user enters either a "q" or
     * "Q".It asks the user for a decimal number input in the 8 Bit Range. Its
     * throwing an exception if the number is not a number or out of range of 8
     * Bit. If it is a legit number it uses the functions from the StoreDecimal
     * class to calculate the binary.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        UserInterface userInterface = new UserInterface();
        while (true) {
            String input = userInterface.getInput();
            if (userInterface.checkForTermination(input)) {
                break;
            }
            if (!(userInterface.convertToInt(input))) {
                continue;
            }
            userInterface.printBinary(userInterface.number);
        }
    }
}
