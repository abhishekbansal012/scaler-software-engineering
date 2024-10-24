package org.pixlaunch.module_02.day_08.assignment.ques_05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {

        return  printAllSubArrays(A);
    }

    private ArrayList<ArrayList<Integer>> printAllSubArrays(ArrayList<Integer> A) {

        ArrayList<ArrayList<Integer>> returnArray = new ArrayList<>();

        for(int i=0;i<A.size();i++) {
            for(int j=i;j<A.size(); j++) {
                ArrayList<Integer> innerReturnArray = new ArrayList<>();
                for(int k=i; k<=j;k++) {
                    innerReturnArray.add(A.get(k));
                }
                returnArray.add(innerReturnArray);
            }
        }
        return returnArray;
    }


}
