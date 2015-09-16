/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jch09;

/**
 *
 * @author johnr
 */
public class NDim {
    public static void TwoDimInit(){
        System.out.println("TwoDimInit");
        double[][] stockPrices;
        
        // [row][column]
        stockPrices = new double[100][200];
        
        // what is the length?
        System.out.println("stockPrices.length: " + stockPrices.length);
        System.out.println("stockPrices[0].length: " + stockPrices[0].length);
    }
    
    public static void TwoDimRagged(){
        System.out.println("TwoDimRagged");
        double[][] stockPrices;
        
        // [row][column]
        // why is this legal?
        stockPrices = new double[50][];
        
        // can i do this?
        // what kind of exception gets thrown here
        // System.out.println("stockPrices[0][0]: " + stockPrices[0][0]);
        
        // what happens when i do this?
        for(int index = 0; index < stockPrices.length; index++){
            stockPrices[index] = new double[(int)(Math.random()*100 + 1)];
        }
        
        // why might a Ragged array be useful??
        System.out.println("stockPrices[0].length: " + stockPrices[0].length);
        System.out.println("stockPrices[1].length: " + stockPrices[1].length);
        System.out.println("stockPrices[2].length: " + stockPrices[2].length);        
    }
}
