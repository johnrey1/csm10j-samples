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
public class ArraySearch {
    public static int search(int[] list, int value) {
        // are there more efficient ways to search a list
        // what would one be?
        // what would you have to modify to search an array of strings?
        for (int i = 0; i < list.length; i++) {
            if (list[i] == value)
                return i;
        }
        
        return -1;
    }
    
    public static void SearchFound(){
        System.out.println("SearchFound");
        int[] primes = {2,3,19,5,7,17,23,11,13};
        
        // what is the result
        int result = search(primes, 7);
        
        System.out.println("Search result: " + result);
    }
    
    public static void SearchNotFound(){
        System.out.println("SearchNotFound");
        int[] primes = {2,3,19,5,7,17,23,11,13};
        
        // what is the result
        int result = search(primes, 20);
        
        System.out.println("Search result: " + result);
    }
}
