/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csm10jch05;

import java.util.Scanner;

/**
 *
 * @author johnr
 */
public class For {
        
    static Scanner console = new Scanner(System.in);
    
    public static void Infinite1(){
        
        int i = 0;
        for(;;)
            System.out.println(i++);
    }
    
    public static void Infinite2(){
        
        int i = 0;
        
        for(;;i++)
            System.out.println(i);
    }
    
    public static void Infinite3(){
        
        int i = 0;
        
        for(;1==1;)
            System.out.println(i);
    }
    
    public static void Infinite4(){
        
        int i = 0;
        
        for(i = 1;;)
            System.out.println(i);
    }
    
    public static void Factorial(){
        // we'll see how to do this with recursion later
        System.out.println("Factorial");
        System.out.print("Enter a number: ");
        int n = console.nextInt();
        
        long result = 1;
        // rewrite using decrement
        for(int i = 1; i <= n; i++)
            result *= i;
        
        System.out.printf("%d! = %d%n%n", n, result);        
    }
    
    public static void Nest()
    {
        System.out.println("Multiplication tables");
        for(int i = 1; i <=12; i++)
        {
            for(int j = 1; j <= 12; j++)
                System.out.printf("%3d ", i * j);
            System.out.println();
        }       
    }
    
}
