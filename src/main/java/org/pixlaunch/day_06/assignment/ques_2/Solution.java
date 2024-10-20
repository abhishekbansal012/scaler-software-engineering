package org.pixlaunch.day_06.assignment.ques_2;

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public List<Integer> solve(ArrayList<Integer> A, int B, int C) {
        int temp;
        int startIndex = B;
        int endIndex = C;
        while(endIndex>startIndex) {
                temp = A.get(startIndex);
                A.set(startIndex, A.get(endIndex));
                A.set(endIndex, temp);
                startIndex++;
                endIndex--;
        }
        return  A;
    }
}
