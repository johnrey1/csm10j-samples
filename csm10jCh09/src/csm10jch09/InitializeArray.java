/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jch09;

import java.util.Scanner;

/**
 *
 * @author johnr
 */
public class InitializeArray {
 
    public static void OneDimDeclared(){
        System.out.println("OneDimDeclared");
        // declared array of doubles
        double[] stockPrices;
        
        // creating an array of 100 stock prices
        stockPrices = new double[100];
        
        // what is the default value?
        System.out.println("Initializing using new double[100]");
        
        // indexing starts at 0
        System.out.println(stockPrices[0]);
        System.out.println(stockPrices[1]);
        System.out.println(stockPrices[2]);
    }
    
    public static void OneDimBraces(){
        System.out.println("OneDimBraces");
        // alternate way to intialize array
        System.out.println("Initializing using new double[]{ 1.414, 3.141, 42.0 }");
        double[] stockPrices = new double[]{ 1.414, 3.141, 42.0 };
        System.out.println(stockPrices[0]);
        System.out.println(stockPrices[1]);
        System.out.println(stockPrices[2]);        
    }
    
    public static void OneDimExpression(){
        System.out.println("OneDimExpression");
        
        // create an array between 1 and 100, randomly
        // why do add plus 1?
        // why does the expression need to be integer?
        double[] randomArraySize = new double[(int)(Math.random() * 100 + 1)];
        
        // note the length property
        System.out.println("Random array size: " + randomArraySize.length);
    }
    
    public static void OneDimUserInput(){
        System.out.println("OneDimUserInput");
        
        // create an array between 1 and 100, randomly
        // why do add plus 1?
        // why does the expression need to be integer?
        double[] userSizedArray;
        
        System.out.print("Enter an array size: ");
        
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        
        userSizedArray = new double[size];
        
        // note the length property
        System.out.println("User sized array: " + userSizedArray.length);
    }
    
    public static void OneDimRefType(){
        System.out.println("OneDimRefType");
        String[] myArr = { "John", "Jane", "Sam", "Sue", "Joe"};
        
        System.out.println("myArr[1]: " + myArr[1]);    
    }
    
    
    
}
