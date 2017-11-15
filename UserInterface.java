/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package firstturninjava;

import java.util.Scanner;

/**
 * This program implements the UserInterface for converting a decimal number
 * into a binary number.
 * @version 1.0
 * @author Marc Bambey
 * @since 14.11.2017
 */

public class UserInterface {

    /**
     * This is the main function. It runs until the user enters either
     * a "q" or "Q".It asks the user for a decimal number input in the
     * 8 Bit Range. Its throwing an exception if the number is not a 
     * number or out of range of 8 Bit. If it is a legit number it 
     * uses the functions from the StoreDecimal class to calculate the binary.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number;
        while (true){
            System.out.println("Please type in a number: "); 
            Scanner x = new Scanner(System.in);
            String input = x.next();
            if (input.contentEquals("Q")||input.contentEquals("q")){
                break;
            }
            try{
                number=Integer.parseInt(input);
            }catch (NumberFormatException numberFormatException) {
				System.out.println("Wrong Input");
				continue;
        
            }
            if (-128 <= number && number <= 127)    {
                StoreDecimal decimal = new StoreDecimal(number);
                System.out.println(decimal.getBinary()+" " 
                        + decimal.getDecimal());          
            }else {
                System.out.println("Wrong Number");
            }
        }
    }
}