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
public class IndexingArray {

    public static void OutOfBoundsInt() {
        System.out.println("OutOfBoundsInt");
        int[] primes = {2, 3, 5, 7, 11};
        // the size of the array is 5, so why does primes[5] throw an exception
        System.out.println(primes[5]);
    }

    public static void OutOfBoundsLength() {
        System.out.println("OutOfBoundsLength");
        int[] primes = {2, 3, 5, 7, 11};

        // why does this not work
        System.out.println(primes[primes.length]);
    }

    public static void OutOfBoundsNegative() {
        System.out.println("OutOfBoundsNegative");
        int[] primes = {2, 3, 5, 7, 11};
        
        // does this make sense? Some languages actually let you do this
        System.out.println(primes[-1]);
    }
}
