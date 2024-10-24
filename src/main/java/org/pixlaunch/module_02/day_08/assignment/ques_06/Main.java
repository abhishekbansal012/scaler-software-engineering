package org.pixlaunch.module_02.day_08.assignment.ques_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //Read values from user
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter value of Array A comma separated: ");
        String valueOfA = myObj.next();  // Read user input

        Solution solution = new Solution();
        System.out.println(solution.solve(valueOfA));

    }
}
