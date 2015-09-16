/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csm10jch07;

/**
 *
 * @author johnr
 */
public class Overload {
    public static double Add(double x, double y){
        return x + y;
    }
    
    // illegal, uncomment to get 'method already defined
    // Name + Formal Parameters list is the signature
//    public static void Add(double a, double b){
//        
//    }
    
    public static int Add(int x, int y){
        return x + y;
    }
    
    public static int Add(int x, int y, int z){
        return x + y + z;
    }
}
