/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jch13;

/**
 *
 * @author johnr
 */
public class DecToBin {
    // why take in a base value?
    
    public static void PrintDecToBin(int num, int base){
        // base case
        if(num == 0)
            System.out.print(0);
        else if(num > 0){
            PrintDecToBin(num / base, base);
            System.out.print(num % base);
        }        
    }
}
