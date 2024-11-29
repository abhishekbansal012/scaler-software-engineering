package org.pixlaunch.module_03.day_11.ques_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {

    public int solve(ArrayList<Integer> A) {

        return findMinimumCost(A);

    }

    private int findMinimumCost(ArrayList<Integer> arr) {

       arr.sort(Comparator.reverseOrder());

       int sum = 0;


       for(int i=0;i<arr.size();i++) {
           sum+=(i+1) * arr.get(i);
       }
       return sum;
    }
}
