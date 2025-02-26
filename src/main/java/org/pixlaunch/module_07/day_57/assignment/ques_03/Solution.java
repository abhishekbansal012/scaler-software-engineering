package org.pixlaunch.module_07.day_57.assignment.ques_03;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Solution {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        // Using PriorityQueue as the min heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // List to store results of extract min operations
        ArrayList<Integer> result = new ArrayList<>();

        for (ArrayList<Integer> query : A) {
            int op = query.get(0);
            int value = query.get(1);

            if (op == 1) { // extract minimum operation
                if (minHeap.isEmpty()) {
                    result.add(-1);
                } else {
                    result.add(minHeap.poll());
                }
            } else if (op == 2) { // insertion operation
                minHeap.add(value);
            }
        }
        return result;
    }
}
