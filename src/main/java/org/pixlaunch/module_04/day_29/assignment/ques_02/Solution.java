package org.pixlaunch.module_04.day_29.assignment.ques_02;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        return mergeSort(A, 0, A.size() - 1);
    }

    // Method to sort a list using merge sort
    public static ArrayList<Integer> mergeSort(ArrayList<Integer> list, int left, int right) {
        if (left < right) {
            // Find the middle point
            int middle = left + (right - left) / 2;

            // Recursively sort the first and second halves
            mergeSort(list, left, middle);
            mergeSort(list, middle + 1, right);

            // Merge the sorted halves
            merge(list, left, middle, right);
        }
        return list;
    }

    // Method to merge two sorted sublists
    private static void merge(ArrayList<Integer> list, int left, int middle, int right) {
        // Sizes of the two sublists
        int size1 = middle - left + 1;
        int size2 = right - middle;

        // Temporary lists to hold the sublists
        ArrayList<Integer> leftList = new ArrayList<>(size1);
        ArrayList<Integer> rightList = new ArrayList<>(size2);

        // Copy data to temporary lists
        for (int i = 0; i < size1; i++) {
            leftList.add(list.get(left + i));
        }
        for (int j = 0; j < size2; j++) {
            rightList.add(list.get(middle + 1 + j));
        }

        // Merge the temporary lists back into the original list
        int i = 0, j = 0;
        int k = left;

        while (i < size1 && j < size2) {
            if (leftList.get(i) <= rightList.get(j)) {
                list.set(k, leftList.get(i));
                i++;
            } else {
                list.set(k, rightList.get(j));
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftList if any
        while (i < size1) {
            list.set(k, leftList.get(i));
            i++;
            k++;
        }

        // Copy remaining elements of rightList if any
        while (j < size2) {
            list.set(k, rightList.get(j));
            j++;
            k++;
        }
    }

}
