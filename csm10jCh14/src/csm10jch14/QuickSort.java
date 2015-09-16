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
public class QuickSort {

    public boolean debug = false;

    private void swap(int[] list, int first, int second) {
        int temp;
        temp = list[first];
        list[first] = list[second];
        list[second] = temp;
    }

    private int partition(int[] list, int first, int last) {
        int pivotValue, smallIndex;
        // choose the midpoint of the list as the pivot
        swap(list, first, (first + last) / 2);

        pivotValue = list[first];
        smallIndex = first;

        if (debug) {
            System.out.println("before first swap");
            SortAlgorithms.printList(list);
        }
        for (int index = first + 1; index <= last; index++) {
            // make sure everything to the left of the pivot is smaller
            if (list[index] < pivotValue) {

                smallIndex++;
                swap(list, smallIndex, index);
                if (debug) {
                    SortAlgorithms.printList(list);
                }
            }
        }

        swap(list, first, smallIndex);
        if (debug) {
            System.out.println("after last swap");
            SortAlgorithms.printList(list);
        }

        return smallIndex;
    }

    public void sort(int[] list) {
        if (debug) {
            System.out.println("Starting Quicksort");
            SortAlgorithms.printList(list);
        }
        recursiveQuickSort(list, 0, list.length - 1);
        if (debug) {
            SortAlgorithms.printList(list);
        }
    }

    private void recursiveQuickSort(int[] list, int first, int last) {
        if (first < last) {
            if (debug) {
                System.out.printf("Partitioning %d, %d%n", first, last);
            }
            int pivot = partition(list, first, last);
            if (debug) {
                System.out.printf("Pivot index %d, value %d%n", pivot, list[pivot]);
            }
            recursiveQuickSort(list, first, pivot - 1);
            recursiveQuickSort(list, pivot + 1, last);
        }
    }
}
