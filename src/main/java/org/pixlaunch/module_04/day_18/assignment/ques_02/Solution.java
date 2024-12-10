package org.pixlaunch.module_04.day_18.assignment.ques_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {

        ArrayList<Integer> answer = new ArrayList<>();

        for(int i=0;i<A;i++) {
            answer.add(0);
        }

        for(int i=0;i<B.size();i++){
            ArrayList<Integer> insideArray = B.get(i);
            int x = insideArray.get(0);
            int y = insideArray.get(1);
            int z = insideArray.get(2);
            answer.set(x-1, answer.get(x-1)+z);
            if(y<answer.size()) {
                answer.set(y, answer.get(y)-z);
            }
        }

        return calculatePrefixSum(answer);
    }

    private ArrayList<Integer> calculatePrefixSum(ArrayList<Integer> A) {

        int sum = 0;
        for(int i=0; i<A.size(); i++ ){
            sum=sum+A.get(i);
            A.set(i, sum);
        }
        return A;
    }

}
