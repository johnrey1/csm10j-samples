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
public class BreakContinueWhile {

    static Scanner console = new Scanner(System.in);

    public static void BreakWhile() {

        // compare to DoWhile.DoWhile
        System.out.println("Break while");
        while (true) {
            System.out.println("Enter a number: ");
            if (console.nextInt() > 100) {
                break;
            }
        }
        System.out.println("Found number bigger than 100");
    }
    
    public static void ContinueWhile(){
        System.out.println("ContinueWhile");
        
        Boolean stop = false;
        do{
            System.out.print("> ");
            int number = console.nextInt();
            
            if(number <= 100)
                continue;
            
            System.out.println("Found Number bigger than 100");
            stop = true;
        }while(!stop);   
    }
    
    public static void BreakContinueWhile(){
        System.out.println("BreakContinueWhile");
        
        while(true){
            System.out.print("> ");
            int number = console.nextInt();
            if(number <= 100)
                continue;
            
            System.out.println("Found Number bigger than 100");
            break;
        }        
    }
}
