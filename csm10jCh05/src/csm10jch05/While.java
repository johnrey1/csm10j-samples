/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csm10jch05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author johnr
 */
public class While {
    
    static Scanner console = new Scanner(System.in);
    
    public static void Example51(){
        System.out.println("Example 5-1");
        int i = 0;
        while( i <= 20){
            System.out.print(i + " ");
            i = i + 5;
        }
    }
    
    public static void Example52(){
        System.out.println("Example 5-2");
        int i = 20;
        while( i < 20){
            System.out.print(i + " ");
            i = i + 5;
        }
        
    }
    
    public static void Counter(){
        System.out.println("Counter");
        
        int i = 0;
        
        while(i < 20){
            System.out.print((i * 5) + " ");
            i = i + 5;
        }
        System.out.println("i = " + i);
        System.out.println();
        System.out.println();
    }
    
    public static void Sentinel() throws FileNotFoundException{
        System.out.println("Sentinel");
        int SENTINEL = -99;
        
        Scanner file = new Scanner(new FileReader("numbers.txt"));
        
        int number = file.nextInt();
        while(number != SENTINEL){
            System.out.println(number);
            number = file.nextInt();
            // what happens if i put the println here
        }
        System.out.println();
    }
    
    public static void Flag(){
        // note i could write this as a sentinel controlled loop
        
        Boolean stop = false;
        int limit = 100;
        
        int total = 0;
        while(!stop){
            System.out.print("Enter a number: ");
            total += console.nextInt();
            System.out.println("Total is " + total);
            if(total > limit)
                stop = true;
        }        
        
        System.out.println();
    }
    
    public static void EOF() throws FileNotFoundException{
        System.out.println("EOF");
        Scanner file = new Scanner(new FileReader("numbers.txt"));
        // try changing the contents of numbers.txt
        
        while(file.hasNextInt()){            
            int number = file.nextInt();
            System.out.println(number);
        }
    }
}
