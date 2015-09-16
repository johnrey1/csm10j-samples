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
public class Fibonacci {
    // is this tail recursion?
    public static void PrintFibonacci(int a, int b, int steps){
        System.out.println(a);
        if(steps-1 > 0)
            PrintFibonacci(b, a+b, steps-1 );
    }
    
    // is this tail recursion
    public static int GetNthFibonacci(int a, int b, int n){
        if(n == 1)
            return a;
        if(n == 2)
            return b;
        
        return GetNthFibonacci(a, b, n-1) + GetNthFibonacci(a, b, n-2);
    }
}
