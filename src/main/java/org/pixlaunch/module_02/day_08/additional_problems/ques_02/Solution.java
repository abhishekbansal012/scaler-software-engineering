package org.pixlaunch.module_02.day_08.additional_problems.ques_02;

import java.util.ArrayList;

public class Solution {

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        //Sample input 16,17,4,3,5,2

        return findLeaderArrayBruteForceApproach(A);

    }

    private ArrayList<Integer> findLeaderArrayBruteForceApproach(ArrayList<Integer> arr) {

        ArrayList<Integer> leaderArray = new ArrayList<>();


        for(int i=0;i<arr.size(); i++) {
            int max = arr.get(i);
            for(int j=i+1; j<arr.size(); j++) {
                if(arr.get(j)>max) {
                    max = arr.get(j);
                }
            }
            if(max == arr.get(i)) {
                leaderArray.add(arr.get(i));
            }
        }
        return leaderArray;
    }


}
