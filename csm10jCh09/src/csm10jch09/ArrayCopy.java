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
public class ArrayCopy {

    public static void ShallowCopy() {
        System.out.println("ShallowCopy");
        int[] primes = {2, 3, 5, 7, 11};
        int[] primesCopy = new int[5];
        primesCopy[0] = 1;
        
        primesCopy = primes;
        System.out.println("primesCopy[0] " + primesCopy[0]);
        
        // what happens here?
        primesCopy[0] = 13;
        // what is the value of primes[0]
        System.out.println("primes[0] " + primes[0]);       
    }

    public static void DeepCopy() {        
        System.out.println("DeepCopy");
        int[] primes = {2, 3, 5, 7, 11};
        int[] primesCopy = new int[5];
                
        // to do a deep copy, the programmer must manually
        // copy each element to the new array
        // fortunately the array lengths are the same in this case
        for(int index = 0; index < 5; index++){
            primesCopy[index] = primes[index];
        }
        
        // compare this result to the shallow copy result
        primesCopy[0] = 13;
        // what is the value of primes[0]
        System.out.println("primes[0] " + primes[0]);       
    }

    public static void CompareReferences() {
        
        System.out.println("CompareReferences");
        int[] primes = {2, 3, 5, 7, 11};
        int[] primesCopy = new int[5];
        primesCopy = primes;
        
        // what is the output of this
        System.out.println("primesCopy == primes: " + (primesCopy == primes));
    }

    public static void CompareValues() {
        System.out.println("CompareValues");
        int[] primes = {2, 3, 5, 7, 11};
        int[] primesCopy = {2, 3, 5, 7, 11};
        
        // what is the output of this
        System.out.println("primesCopy == primes: " + (primesCopy == primes));
        
        // what about this?
        boolean areEqual = true;
        for(int index = 0; index < 5; index++){
            if(primesCopy[index] != primes[index]){
                areEqual = false;
                break;
            }
        }
        
       System.out.println("primesCopy == primes? " + areEqual);
        
    }
    
    // why not use this to compare arrays
    public static boolean AreArraysEqual(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length)
            return false;
        
        for(int index = 0; index < arr1.length; index++){
            if(arr1[index] != arr2[index])
                return false;
        }
        
        return true;
    }
}
