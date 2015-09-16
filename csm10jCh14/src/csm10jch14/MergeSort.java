/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jch14;

import static csm10jch14.SortAlgorithms.printList;

/**
 *
 * @author johnr
 */
public class MergeSort {

    public boolean debug = false;

    private int[] subArray(int[] list, int start, int end) {
        int[] temp = new int[end - start + 1];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = list[i + start];
        }

        return temp;
    }

    private void merge(int[] left, int[] right, int[] target) {
        // shouldnt get here with empty lists
        int leftIndex = 0, rightIndex = 0;

        for (int i = 0; i < target.length; i++) {
            if (leftIndex < left.length && rightIndex < right.length) {
                if (left[leftIndex] < right[rightIndex]) {
                    target[leftIndex + rightIndex] = left[leftIndex];
                    leftIndex++;
                } else {
                    target[leftIndex + rightIndex] = right[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < left.length) {
                target[i] = left[leftIndex];
                leftIndex++;
            } else if (rightIndex < right.length) {
                target[i] = right[rightIndex];
                rightIndex++;
            }
        }
    }

    public void mergeSort(int[] list) {
        if (list.length <= 1) {
            return;
        }

        int splitIndex = (list.length - 1) / 2;
        int[] left = subArray(list, 0, splitIndex);
        if (debug) {
            System.out.println("Mergesort left, 0 to " + splitIndex);
        }
        mergeSort(left);

        int[] right = subArray(list, splitIndex + 1, list.length - 1);
        if (debug) {
            System.out.println("Mergesort right, " + splitIndex + " to " + (list.length - 1));
        }
        mergeSort(right);

        if (debug) {
            System.out.println("Merging");
        }
        merge(left, right, list);
        if (debug) {
            printList(list);
        }
    }

}
