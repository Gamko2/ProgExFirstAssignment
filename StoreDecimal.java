/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstturninjava;

/**
 *
 * @author Marc
 */
public class StoreDecimal  {
    private int number;
public StoreDecimal(int number){
    this.number=number;

}
public String getBinary(){
    String  tmp="";
for (int x = 7; x >= 0; x--) {
    tmp += ((1 << x) & number) != 0 ? "1" : "0";
}
return  tmp;
}

public int getDecimal(){
    return number;
}

public static void main(String[] args){
    StoreDecimal decimal=new StoreDecimal((int)0);
    
    StoreDecimal decimal2=new StoreDecimal((int)1);
    StoreDecimal decimal3=new StoreDecimal((int)16);
    StoreDecimal decimal1=new StoreDecimal((int)-70);
    StoreDecimal decimal4=new StoreDecimal((int)70);
    StoreDecimal decimal5=new StoreDecimal((int)'A');
    System.out.println(decimal.getBinary());
    
    System.out.println(decimal2.getBinary());
    System.out.println(decimal3.getBinary());
    System.out.println(decimal1.getBinary());
    System.out.println(decimal4.getBinary());
    System.out.println(decimal5.getBinary());
}
}
