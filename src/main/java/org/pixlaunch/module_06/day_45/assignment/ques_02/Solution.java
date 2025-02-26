package org.pixlaunch.module_06.day_45.assignment.ques_02;

import java.util.ArrayList;

public class Solution {

    public ArrayList<Integer> solve(int A) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i=1;i<=A;i++) {
            if(checkPrime(i)) {
                result.add(i);
            }
        }
        return result;
    }

    boolean checkPrime(int N) {
        int count =0;
        for(int i=1;i*i<=N;i++) {
            if(N%i == 0 ) {
                if(i==N/i) {
                    count++;
                }else {
                    count+=2;
                }
            }
        }
        return count == 2;
    }
}
