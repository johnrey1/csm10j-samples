/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jch11;

import java.util.InputMismatchException;
import java.util.Scanner;


class DivideByZeroException extends Exception{
        public DivideByZeroException(){
            super("Divide by zero");
        }
        
        public DivideByZeroException(String msg){
            super(msg);
        }        
    }

/**
 *
 * @author johnr
 */
public class ExceptionHandlingExamples {
    public static void Example11_3(){
        Scanner console = new Scanner(System.in);
        
        int dividend, divisor, quotient;
        
        try{
            System.out.println("Enter dividend: ");
            dividend = console.nextInt();
            
            System.out.println();
            System.out.println("Enter divisor: ");
            divisor = console.nextInt();
            
            System.out.println();
            
            quotient = dividend / divisor;
            
            System.out.println("Quotient: " + quotient);
            
        }
        // what happens if i add this block?
        // catch(Exception exRef){ System.out.println("Caught the exception"); }
        catch(ArithmeticException aeRef){
            System.out.println("ArithmeticException " + aeRef.toString());

        }
        catch(InputMismatchException imeRef){
            System.out.println("InputMismatchException " + imeRef.toString());
        }
        // try adding finally to print out values of dividend / divisor / quotient
    }
    
    public static void DefaultUncaught(){
        throw new RuntimeException("not catching it");
    }
    
    public static void PrintStack(){
        
        try{
            throw new RuntimeException("I want to print the stack");
        }
        catch(Exception exRef){
            System.out.println("Printing the stack");
            exRef.printStackTrace();
        }
    }
    
    
    // modified exercise 11.9 based on checked exceptions, custom exception class
    // re-throwing exceptions
    public static void Exercise11_9(int lowerLimit, int divisor) throws DivideByZeroException{
        int result = 0;
        
        try
        {
            System.out.println("Entering try block: ");
            
            if(divisor == 0){
                throw new DivideByZeroException();
            }
            
            result = lowerLimit / divisor;
            
            if(lowerLimit < 100){
                throw new Exception("Lower limit violation");
            }
            
            System.out.println("Exiting try block");
        }
        catch(DivideByZeroException deRef){
            System.out.println("re-throwing divide by zero");
            throw deRef;
        }
        catch(ArithmeticException aeRef){
            System.out.println("Exception: "  + aeRef.getMessage());
            result = 110;
        }
        catch(Exception e){
            System.out.println("Exception: "  + e.getMessage());
        }
        
        System.out.println("Exiting Exercise11_9");
    }
    
}
