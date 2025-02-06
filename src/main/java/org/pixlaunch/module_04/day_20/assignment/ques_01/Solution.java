package org.pixlaunch.module_04.day_20.assignment.ques_01;

import java.util.ArrayList;

public class Solution {
    public int firstMissingPositive(ArrayList<Integer> A) {
        int i=0;
        int n = A.size();

        while(i<A.size()) {
            if(A.get(i) > 0 && A.get(i) <= n
                    && !A.get(A.get(i) - 1).equals(A.get(i))) {
                swap(A, i, A.get(i) - 1);
            }else {
                i++;
            }
        }
        for(int k=0;k<A.size();k++) {
            if(A.get(k) != k+1) {
                return k+1;
            }
        }
        return A.size()+1;
    }

    private void swap(ArrayList<Integer> A, int i, int j) {
        int temp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, temp);
    }
}
