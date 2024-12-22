package org.pixlaunch.module_04.day_30.assignment.ques_04;

import java.util.Arrays;

public class Solution {

    public int partition(int[] arr) {
        int p1 = 0,p2=0;
        int pivotElement = arr[arr.length-1];
        while(p2 < arr.length) {
            if(arr[p2] <pivotElement) {
                swapElements(arr, p1,p2);
                p1++;
            }
            p2++;
        }
        swapElements(arr, p1,p2-1);
        return p1;
    }

    private void swapElements(int[] arr, int p1, int p2) {
        if (arr == null || p1 < 0 || p2 < 0 || p1 >= arr.length || p2 >= arr.length) {
            throw new IllegalArgumentException("Invalid indices or array is null");
        }

        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }

}
