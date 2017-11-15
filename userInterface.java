/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstturninjava;

import java.util.Scanner;

/**
 *
 * @author Marc
 */

public class UserInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number;
        boolean running=true;
        while (running){
        System.out.println("Please type in a number: "); 
        Scanner x =new Scanner(System.in);
        String input=x.next();
        if (input.contentEquals("Q")||input.contentEquals("q"))
            break;
        try{
        number=Integer.parseInt(input);
        }catch (NumberFormatException numberFormatException) {
				System.out.println("Wrong Input");
				continue;
        
    }
    if (-127 <=number&& number <=127)    {
      StoreDecimal decimal=new StoreDecimal(number);
        System.out.println(decimal.getBinary()+" " + decimal.getDecimal());
    }
    else {
        System.out.println("Wrong Number");
        continue;
    }
        
        
        
        
    }
}
}