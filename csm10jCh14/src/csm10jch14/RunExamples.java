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
public class RunExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        
//        int[] arr = {12, 23, 54, 68, 70, 71, 72, 73, 75, 88, 102, 105, 106};
//
//        System.out.println("Searching for 7: " + BinarySearch.binarySearch(arr, 7, 0, arr.length - 1));
//        System.out.println("Searching for 12: " + BinarySearch.binarySearch(arr, 12, 0, arr.length - 1));
//        System.out.println("Searching for 75: " + BinarySearch.binarySearch(arr, 75, 0, arr.length - 1));
//        System.out.println("Searching for 106: " + BinarySearch.binarySearch(arr, 106, 0, arr.length - 1));
//        System.out.println("Searching for 112: " + BinarySearch.binarySearch(arr, 112, 0, arr.length - 1));
        
//        int[] bubbleSortArr = {10,7,19, 5,16};
//        SortAlgorithms.bubbleSort(bubbleSortArr, bubbleSortArr.length, true);
        
//        int[] unsortedArr = {108, 23, 88, 54, 73, 105, 68, 71, 72, 12, 75, 102, 106, 70};
//        int[] exampleInsertionArr = {10,18,25,30,23,17,45,35};
            
        
        
//        SortAlgorithms.selectionSort(unsortedArr, unsortedArr.length, true);
        
        
//        SortAlgorithms.insertionSort(unsortedArr, unsortedArr.length, true);
//        SortAlgorithms.selectionSort(exampleInsertionArr, exampleInsertionArr.length, true);
//        SortAlgorithms.insertionSort(exampleInsertionArr, exampleInsertionArr.length, true);
        
//        int[] quickSortArr = {32,55,87,13,78,96,52,48,22,11,58,66,88,45};
//        QuickSort sorter = new QuickSort();
//        sorter.debug = true;
//        sorter.sort(quickSortArr);
        
        int[] mergeSortArr = {38,27,43,3,9,82,10};
        MergeSort ms = new MergeSort();
        ms.debug = true;
        ms.mergeSort(mergeSortArr);
                
    }

}
