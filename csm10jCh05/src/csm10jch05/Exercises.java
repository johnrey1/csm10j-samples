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
public class Exercises {
            
    static Scanner console = new Scanner(System.in);    
    
    public static void PE6(){
        
        int sumOdd = 0;
        int sumEven = 0;
        
        // only read one line
        Scanner s = new Scanner(console.nextLine());
        
        while(s.hasNextInt()){
            int number = s.nextInt();
                        
            if(number % 2 == 0)
                sumEven += number;
            else
                sumOdd += number;                           
        }
        
        System.out.println("Sum of odd numbers: " + sumOdd);
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println();
    }
    
    public static void PE27(){
        // PE 5.27
        // think about what you want to output at the end of the problem
        // what information you need
        // what values will tell you when you've achieved your result
        // there are numerous (and better) ways to write this
        
        int totalUnits = 50;
        int baseRent = 600;
        int marginalIncrease = 40;
        int maintenance = 27;
        
        int baseProfit = (totalUnits * baseRent) - (totalUnits * maintenance);
        int tempProfit = baseProfit;
        int priceIncreases = 0;
        System.out.println("base profit " + baseProfit);
        for(priceIncreases = 1;  priceIncreases < totalUnits; priceIncreases++)
        {
            int units = (totalUnits - priceIncreases);
            int rent = baseRent + (marginalIncrease * priceIncreases);
            int profit = (units * rent) - (units * maintenance);
            System.out.println("Profit with " + priceIncreases + " priceIncreases is " + profit);
            
            if(profit < tempProfit)
                break;
            tempProfit = profit;
        }
        
        System.out.println("You should rent " + (totalUnits - priceIncreases + 1) + " units");
    }
}
