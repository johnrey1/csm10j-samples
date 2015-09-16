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
public class Factorial {
    public static int Factorial(int n) {
//            throws Exception{
    
        // error checking
//        if (n < 0)
//            throw new Exception("Cannot take factorial of negative number");
        
        // base cases
        if(n == 0)
            return 1;
        
        // is this base case necessary for the recursion to work?
        if(n == 1)
            return 1;
        
        return n * Factorial(n-1);                
    }
}
