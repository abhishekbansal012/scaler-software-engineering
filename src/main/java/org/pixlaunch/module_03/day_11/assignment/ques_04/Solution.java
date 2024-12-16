package org.pixlaunch.module_03.day_11.assignment.ques_04;

import java.util.ArrayList;
import java.util.Comparator;

public class Solution {

    public int solve(ArrayList<Integer> A, int B) {

        A.sort(Comparator.naturalOrder());

        return  A.get(B-1);

    }


}
