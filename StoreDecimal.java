/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package firstturninjava;

/**
 * This program implements the StoreDecimal class which does the conversion
 * from decimal to binary.
 * @version 1.0
 * @author Marc Bambey
 * @since 14.11.2017
 */


public class StoreDecimal  {
    private int number;
    
    /**
 * This is the constructor 
 * @param number is the decimal number you get when calling this function
 * This constructor just saves the number you entered in the private variable
 * number of the StoreDecimal class
 * @author Marc
 */
    public StoreDecimal(int number){
        this.number=number;

    }
    /**
     * This function calculates the Binary value of the number entered.
     * @return this returns the Binary String calculated
     */
    
    public String getBinary(){
        String  tmp="";
        for (int x = 7; x >= 0; x--) {
            tmp += ((1 << x) & number) != 0 ? "1" : "0";
        }
        return  tmp;
    }
    /**
     * This returns the decimal number entered by the user
     * @return This just returns the decimal number
     */
    
    public int getDecimal(){
        return number;
    }
}
