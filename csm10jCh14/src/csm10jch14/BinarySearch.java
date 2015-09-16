/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jch14;

/**
 *
 * @author johnr
 */
public class BinarySearch {
    // return the index of the element if found
    // return -1 otherwise
    public  static int binarySearch(int[] arr, int target, int start, int end){
        if(end >= arr.length)
            end = arr.length - 1;       
        
        int splitIndex = (start + end) / 2;
//        System.out.println("Splitindex: " + splitIndex);
        
        if(arr[splitIndex] == target){
            return splitIndex;
        }       
        
        System.out.println("Start " + start + " end " + end);
        if(end <= start)
            return -1;
        
        // why wouldnt we create subarrays instead of changing indices?
        if(target > arr[splitIndex]){
            return binarySearch(arr, target, splitIndex + 1, end);
        }
        else
        {
            return binarySearch(arr, target, start, splitIndex - 1);        
        }
    }
}
