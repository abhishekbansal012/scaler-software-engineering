package org.pixlaunch.module_04.day_18.assignment.ques_01;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayOfA = new ArrayList<>(List.of(1,2,3,4,-10));
        Solution_Unoptimized_one solutionUnoptimizedone = new Solution_Unoptimized_one();
        solutionUnoptimizedone.maxSubArray(arrayOfA);

    }
}
