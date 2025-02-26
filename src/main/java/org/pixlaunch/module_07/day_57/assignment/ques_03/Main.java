package org.pixlaunch.module_07.day_57.assignment.ques_03;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> queries = new ArrayList<>();

        queries.add(new ArrayList<Integer>(Arrays.asList(2, 3)));
        queries.add(new ArrayList<Integer>(Arrays.asList(2, 2)));
        queries.add(new ArrayList<Integer>(Arrays.asList(1, -1)));
        queries.add(new ArrayList<Integer>(Arrays.asList(2, 4)));
        queries.add(new ArrayList<Integer>(Arrays.asList(1, -1)));
        queries.add(new ArrayList<Integer>(Arrays.asList(1, -1)));
        queries.add(new ArrayList<Integer>(Arrays.asList(1, -1)));

        Solution solution = new Solution();
        ArrayList<Integer> results = solution.solve(queries);
        System.out.println(results);  // Expected output: [2, 3, 4, -1]
    }
}
