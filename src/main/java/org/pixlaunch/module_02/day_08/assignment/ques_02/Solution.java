package org.pixlaunch.module_02.day_08.assignment.ques_02;

import java.util.ArrayList;
import java.util.Optional;

public class Solution {

    public int solve(ArrayList<Integer> A) {

        return lengthOfMinMaxArray(A);

    }

    private int lengthOfMinMaxArray(ArrayList<Integer> arr) {

        Optional<Integer> max = arr.stream().max(Integer::compareTo);
        Optional<Integer> min = arr.stream().min(Integer::compareTo);

        int last_min_index = -1;
        int last_max_index = -1;
        int ans=Integer.MAX_VALUE;
        int tempAns=Integer.MAX_VALUE;


        for(int i=0;i<arr.size();i++) {

            if(arr.get(i).equals(min.get())) {
                last_min_index = i;
            }

            if(arr.get(i).equals(max.get())) {
                last_max_index = i;
            }

            if(last_min_index!=-1 && last_max_index!=-1) {
                tempAns = Math.abs(last_max_index-last_min_index)+1;
            }

            if(Math.abs(tempAns)<ans) {
                ans = Math.abs(tempAns);
            }


        }
        return ans;
    }


}
