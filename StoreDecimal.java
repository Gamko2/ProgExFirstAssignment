package firstturninjava;

/**
 * This program implements the StoreDecimal class which does the conversion from
 * decimal to binary.
 *
 * @version 1.0
 * @author Marc Bambey
 * @since 14.11.2017
 */
public class StoreDecimal {

    private int number;

    /**
     * This is the constructor This constructor just saves the number you
     * entered in the private variable number of the StoreDecimal class
     *
     * @param number is the decimal number you get when calling this function
     * @author Marc
     */
    public StoreDecimal(int number) {
        this.number = number;
    }

    /**
     * This function calculates the Binary value of the number entered.
     *
     * @return this returns the Binary String calculated
     */
    public String getBinary() {
        String tmp = "";
        for (int x = 7; x >= 0; x--) {
            tmp += ((1 << x) & number) != 0 ? "1" : "0";
        }
        return tmp;
    }

    /**
     * This returns the decimal number entered by the user
     *
     * @return This just returns the decimal number
     */
    public int getDecimal() {
        return number;
    }
}
