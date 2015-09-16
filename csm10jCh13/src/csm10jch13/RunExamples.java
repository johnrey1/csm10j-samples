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
public class RunExamples {

    private static void findmax(){
        int arr[] = { 12, 536, 90, -12, 234, 85418, 23, 3, 5, 0};
        
        int maxRecursive = LargestElement.LargestElementRecursion(arr, 0, arr.length-1);
        int maxIterative = LargestElement.LargestElementIterative(arr);
        
        System.out.println("Found largest item with recursion: " + maxRecursive);
        System.out.println("Found largest item with iteration: " + maxIterative);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Factorial
//        try {
//            int n = 3;
//            int n = 6;
//            int n = 50;
//            System.out.println(n + "! = " + Factorial.Factorial(n));
//        } catch (Exception ex) {
//            System.out.println(ex);
//        }
        
//        findmax();
        
        
//        // convert 42 to binary
//        DecToBin.PrintDecToBin(42, 2);
//        System.out.println();
//        
//        // Convert 65 to hex
//        DecToBin.PrintDecToBin(65, 16);
//        System.out.println();
//        
//        // Convert to  octal
//        DecToBin.PrintDecToBin(511, 8);
//        System.out.println();
        
//        Fibonacci.PrintFibonacci(2,3,5);
//        
//        System.out.println("5th fibonacci in 2,3: " + Fibonacci.GetNthFibonacci(2, 3, 5));
        
        TowerHanoi.moveDisks(4, 1, 3, 2);
        
//        ExP13_01.PrintStars(4);
//        ExP13_02.PrintDiamond(5);
//        ExP13_02.PrintDiamond(10);
        
//        Sierpinski sierpinski = new Sierpinski();
        
//        ExP13_16 snowflake = new ExP13_16();
        
    }

}
