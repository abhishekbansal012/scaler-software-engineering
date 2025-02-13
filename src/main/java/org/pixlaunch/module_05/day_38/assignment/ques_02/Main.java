package org.pixlaunch.module_05.day_38.assignment.ques_02;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>(List.of(4, 5, 2, 10, 8));
        Solution solution = new Solution();
        System.out.println(solution.prevSmaller(A));

    }
}
