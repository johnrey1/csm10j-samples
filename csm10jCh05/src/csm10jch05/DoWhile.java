/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csm10jch05;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author johnr
 */
public class DoWhile {
    
    static Scanner console = new Scanner(System.in);
    
    public static void DoWhile(){
        System.out.println("DoWhile");
        
        Boolean stop = false;
        do{
            System.out.print("> ");
            int number = console.nextInt();
            
            if(number > 100)
                stop = true;
        }while(!stop);
        System.out.println("Found Number bigger than 100");
    }
    
    public static void NumberGuess(){
        // What is the most number of guesses you should ever need to guess
        // the answer?
        // should your first guess always be the same?
        System.out.println("Number guess");
        int number = new Random().nextInt(100) + 1;
        
        int guess = 0;
        System.out.println("I'm thinking of a number  1 and 100");
        
        do
        {           
            System.out.print("Guess: ");
            guess = console.nextInt();
            if(guess < number)
                System.out.println("too low");
            if(guess > number)
                System.out.println("too high");
        }while(guess != number);
        System.out.println(guess + " is correct!");
    }
}
