package org.pixlaunch.module_04.day_28.assignment.ques_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int A = 0;
        ArrayList<Integer> B = new ArrayList<>(List.of(
                35,16,70,33,32,89,59,79,84,64,59,30,98,25,23,58,57,83,3,4,80,38,87,63,44,70,93,65,72,34,69,96,96,48,5,70,73,58,82,62,49,97,91,40,28,56,61,93,47,14,93,75,90,91,3,48,99,41,49,32,26,34,50,25,2,58,50,84,14,76,77,28,46,52,33,71,74,40,55,41,32,4,66,35,9,71,45,95,55,78,85,1,43,57,16,68,15,1,0,51
        ));
        Solution solution = new Solution();
        System.out.println(solution.solve(A,B));

    }
}
