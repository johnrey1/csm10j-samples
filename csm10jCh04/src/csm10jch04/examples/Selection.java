/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jch04.examples;

import java.util.Scanner;

/**
 *
 * @author johnr
 */
public class Selection {

    static Scanner console = new Scanner(System.in);

    public static void Ex4_12() {
        double wages, rate, hours;

        System.out.println("Line 2: Enter the working hours: ");

        hours = console.nextDouble();
        System.out.println();

        System.out.println("Line 5: Enter the pay rate:");
        rate = console.nextDouble();
        System.out.println();

        // how could you rewrite this without the else?
        // the if-else
        if (hours > 40.0) {
            wages = 40.0 * rate + 1.5 * rate * (hours - 40.0);
        } else {
            wages = hours * rate;
        }

        System.out.printf("Line 12: The wages are $%.2f %n", wages);

        System.out.println();
    }

    public static void Compound() {
        // see examples 4-14, and page 197

        // what do you expect the output to be
        int score = 75;

        if (score >= 60) {
            System.out.println("Passing");
        }
        System.out.println("Failing");

        System.out.println();

        if (score >= 60) {
            System.out.println("Passing");
        } else {
            System.out.println("Failing");
        }

        System.out.println();

        if (score >= 60) {
            System.out.println("Your score is " + score);
            System.out.println("Passing");
        } else {
            System.out.println("Your score is " + score);
            System.out.println("Failing");
        }
    }

    public static void Nested() {
        // Example 4-15

        System.out.println("Enter balance: ");
        double balance = console.nextDouble();
        double interestRate = 0;

        if (balance >= 50000.00)
            interestRate = .05;
        else
            if (balance >= 25000.)
                interestRate = .04;
            else 
                if (balance >= 1000)
                    interestRate = .03;
                else
                    interestRate = 0.00;

        System.out.printf("Your interest rate is %.2f%%%n", interestRate * 100);
    }

    public static void ElseIf() {
        // Example 4-15 rewritten

        System.out.println("Enter balance: ");
        double balance = console.nextDouble();
        double interestRate = 0;

        if (balance >= 50000.00) 
            interestRate = .05;
        else if (balance >= 25000.) 
            interestRate = .04;
        else if (balance >= 1000)
            interestRate = .03;
        else
            interestRate = 0.00;
        

        System.out.printf("Your interest rate is %.2f%%%n", interestRate * 100);
    }

    public static void Conditional() {
        // page 204

        System.out.println();
        System.out.println("Enter hours worked: ");
        double hours = console.nextDouble();

        double overtimeHours = (hours > 40) ? (hours - 40) : 0;
        // how else could this be written

        if(hours > 40)
            overtimeHours = hours - 40;
        else
            overtimeHours = 0;
        
        System.out.println("Overtime hours: " + overtimeHours);

    }

    public static void Switch() {
        System.out.println();
        System.out.println("Enter letter grade: ");
        char grade = console.next().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("You got an A");
                
            case 'B':
                System.out.println("You got a B");
                
            case 'C':
                System.out.println("You got a C");
                break;
            case 'D':
                System.out.println("You got a D");
                break;
            case 'F':
                System.out.println("You got an F");
                break;
            default:
                System.out.println("Dont know what you put");
                break;
        }
    }
    
    public static void SwitchGroup(){
        
        System.out.println();
        System.out.println("Enter letter grade: ");
        char grade = console.next().charAt(0);
        
        // pass or fail?
        switch (grade) {
            case 'A':
            case 'B':
            case 'C':
                System.out.printf("You passed with %c\n", grade);
                break;
            case 'D':
            case 'F':
                System.out.println("You didnt pass");
                break;
            default:
                System.out.println("Dont know what you put");
        }
        
    }
    
    public static void SwitchFallthrough() {
        // what happens if i forget my 'break'
        System.out.println();
        System.out.println("Enter letter grade: ");
        char grade = console.next().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("You got an A");
            case 'B':
                System.out.println("You got a B");
            case 'C':
                System.out.println("You got a C");
            case 'D':
                System.out.println("You got a D");
            case 'F':
                System.out.println("You got an F");
            default:
                System.out.println("Dont know what you put");
        }
    }

}
