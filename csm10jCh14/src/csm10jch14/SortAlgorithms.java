package csm10jch14;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author johnr
 */
public class SortAlgorithms {

    public static void bubbleSort(int[] list, int listLength, boolean debug) {
        if (debug) {
            System.out.println("Beginning bubble sort");
            printList(list);
            System.out.println();
        }

        int temp, counter, index;

        for (counter = 0; counter < listLength - 1; counter++) {
            for (index = 0; index < listLength - 1 - counter; index++) {
                if (list[index] > list[index + 1]) {
                    // do a swap
                    temp = list[index];
                    list[index] = list[index + 1];
                    list[index + 1] = temp;
                }
            }
            if (debug) {
                printList(list);
            }
        }
    }

    public static void selectionSort(int[] list, int listLength, boolean debug) {
        int index;
        int smallestIndex;
        int minIndex;
        int temp;

        if (debug) {
            System.out.println("Beginning Selection Sort");
            printList(list);
            System.out.println();
        }

        for (index = 0; index < listLength - 1; index++) {
            smallestIndex = index;
            for (minIndex = index + 1;
                    minIndex < listLength; minIndex++) {
                if (list[minIndex] < list[smallestIndex]) {
                    smallestIndex = minIndex;
                }
            }

            temp = list[smallestIndex];
            list[smallestIndex] = list[index];
            list[index] = temp;

            if (debug) {
                printList(list);
            }
        }
    }

    public static void insertionSort(int[] list, int listLength, boolean debug) {
        int firstOutOfOrder, location;
        int temp;

        if (debug) {
            System.out.println("Beginning insertion sort");
            printList(list);
            System.out.println();            
        }

        for (firstOutOfOrder = 1; firstOutOfOrder < listLength; firstOutOfOrder++) {
            if (list[firstOutOfOrder] < list[firstOutOfOrder - 1]) {
                temp = list[firstOutOfOrder];
                location = firstOutOfOrder;
                do {
                    list[location] = list[location - 1];
                    location--;
                } while (location > 0 && list[location - 1] > temp);
                list[location] = temp;

                if (debug) {
                    printList(list);
                }
            }
        }

    }

    public static void printList(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
