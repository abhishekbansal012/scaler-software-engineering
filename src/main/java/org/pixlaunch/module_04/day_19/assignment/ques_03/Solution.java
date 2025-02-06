package org.pixlaunch.module_04.day_19.assignment.ques_03;

import java.util.ArrayList;

public class Solution {

    public int solve(ArrayList<ArrayList<Integer>> A) {

        int ans=0;
        for(int i=0;i<A.size();i++) {
            for(int j=0;j<A.get(0).size();j++) {
                int topLeft = (i+1)*(j+1);
                int bottomRight = (A.size()-i)*(A.get(0).size()-j);
                int contribution = A.get(i).get(j)*topLeft*bottomRight;
                ans+=contribution;
            }
        }
        return ans;
    }
}
