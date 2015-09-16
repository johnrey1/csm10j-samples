/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csm10jch04.examples;

/**
 *
 * @author johnr
 */
public class LogicalOperators {
    
    public static void Or(){
        System.out.println("True || False => " + (true || false));
        System.out.println("True || True => " + (true || true));
        System.out.println("False || False => " + (false || false));
    }
    
    public static void And(){
        Boolean result = ('A' < 'a') && ('b' < 'B');
        System.out.println(result);
        
        System.out.println("True && True => " + (true && true));
        System.out.println("True && False => " + (true && false));
        System.out.println("False && False => " + (false && false));
    }
    
    public static void ShortCircuitOr(){
        int age = 20;
        Boolean incrementAge = true;
        
        // this does the exact opposite of what we intend to do
        // because of short circuiting OR
        // (see truth table)
        
        Boolean result = (incrementAge || (age++ > 0));
        System.out.printf("Result: %s, Age: %d\n", result, age);
        
        incrementAge = false;
        result = (incrementAge || (age++ > 0));
        System.out.printf("Result: %s, Age: %d\n", result, age);
    }
    
    public static void ShortCircuitAnd(){
        int age = 20;
        Boolean incrementAge = true;
        
        // this appears to do what we intend
        // age ++ is not evaluated when incrementAge is false
        // (see truth table)
        
//        Boolean result = (incrementAge && (age++ > 0));
//        System.out.printf("Result: %s, Age: %d\n", result, age);
        
        incrementAge = false;
        Boolean result = (incrementAge && (age++ > 0));
        System.out.printf("Result: %s, Age: %d\n", result, age);
    }
    
    // 5 =  0101 in binary
    // 12 = 1100 in binary
    public static void BitwiseAndOr(){
        int five = 5;
        int twelve = 12;
        
        int resultAnd = five & twelve;      // 0100
        int resultOr = five | twelve;       // 1101
        
        // what is the result?
        System.out.printf("5 & 12 = %d\n", resultAnd);
        System.out.printf("5 | 12 = %d\n", resultOr);
    }
}
