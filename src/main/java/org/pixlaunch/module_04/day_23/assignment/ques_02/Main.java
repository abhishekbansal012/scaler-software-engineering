package org.pixlaunch.module_04.day_23.assignment.ques_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //Read values from user
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter value of A: ");
        int valueOfA = myObj.nextInt();  // Read user input


        Solution solution = new Solution();
        System.out.println(solution.solve(valueOfA));

    }
}
