/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csm10jch07;

// import static is a new feature since java 1.6
import static java.lang.Math.*;
/**
 *
 * @author johnr
 */
public class PredefinedMethods {
    
    public static void UseMath(){
        System.out.println("UseMathImport");
        
        double sqrt2 = Math.sqrt(2);
        System.out.println("sqrt = " + sqrt2);
        
        // does CustomPow get called or Math.pow?
        double mega = Math.pow(2, 10);        
        
        System.out.println("megabyte == " + mega + " bytes");
    }
    
    public static void UseMathStaticImport(){
        System.out.println("UseMathImport");
        
        double sqrt2 = sqrt(2);
        System.out.println("sqrt = " + sqrt2);
        
        // does CustomPow get called or Math.pow?
        double mega = pow(2, 10);        
        
        System.out.println("megabyte == " + mega + " bytes");        
    }
    
    // try commenting out this method
    // and run UseMathStaticImport again
    // does it still compile? what prints out?
//    public static double pow(double a, double b)
//    {
//        System.out.println("CustomPow");
//        return Math.pow(a,b);
//    }
    

    
}
