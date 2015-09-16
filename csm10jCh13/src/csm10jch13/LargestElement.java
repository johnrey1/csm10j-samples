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
public class LargestElement {

    public static int LargestElementRecursion(int[] arr, int start, int end) {
        // if arr == null || arr.length == 0 throw exception
        if (arr.length == 1) {
            return arr[0];
        }
        if (start == end) {
            return arr[start];
        }

        int max = LargestElementRecursion(arr, start + 1, end);

        if (max >= arr[start]) {
            return max;
        }

        return arr[start];
    }

    public static int LargestElementIterative(int[] arr) {
        int max = arr[0];
        
        for (int item : arr) {
            if (item > max) {
                max = item;
            }
        }
        
        return max;
    }
}
