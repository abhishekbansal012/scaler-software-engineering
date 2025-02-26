package org.pixlaunch.module_07.day_57.assignment.ques_01;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Solution {
    public int solve(ArrayList<Integer> A) {
        if (A == null || A.size() == 0) return 0;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(A);
        int totalCost = 0;

        while (minHeap.size() > 1) {
            int first = minHeap.poll();
            int second = minHeap.poll();
            int cost = first + second;
            totalCost += cost;
            minHeap.offer(cost);
        }

        return totalCost;
    }
}
