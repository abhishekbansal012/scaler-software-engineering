package org.pixlaunch.module_04.day_30.assignment.ques_03;

public class Solution {

    public int[] solve(int[] A) {
        quickSort(A, 0,A.length-1);
        return A;
    }

    // Quick Sort function
    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(array, low, high);

            // Recursively sort elements before and after partition
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    // Partition function
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Pivot element
        int i = low - 1; // Index of the smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than the pivot
            if (array[j] < pivot) {
                i++;
                // Swap array[i] and array[j]
                swap(array, i, j);
            }
        }

        // Swap array[i + 1] and the pivot (array[high])
        swap(array, i + 1, high);

        return i + 1;
    }

    // Swap function
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
