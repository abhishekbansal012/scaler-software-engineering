package org.pixlaunch.module_07.day_57.assignment.ques_02;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] A = {5, 13, -2, 11, 27, 31, 0, 19};

        Solution solution = new Solution();
        A = solution.buildHeap(A);

        // Print the min heap
        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}
