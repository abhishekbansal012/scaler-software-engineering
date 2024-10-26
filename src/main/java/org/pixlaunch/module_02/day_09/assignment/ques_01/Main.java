package org.pixlaunch.module_02.day_09.assignment.ques_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //Read values from user
        Scanner myObj = new Scanner(System.in);


        System.out.println("Enter size of Array: ");
        int valueOfB = myObj.nextInt();

        System.out.println("Enter max value of Sum: ");
        int valueOfC = myObj.nextInt();

        System.out.println("Enter value of Array comma separated: ");
        String valueOfArr = myObj.next();  // Read user input

        //Convert user String input to Array
        ArrayList<Integer> arrayA = Arrays.stream(valueOfArr.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));


        Solution solution = new Solution();
        System.out.println(solution.maxSubarray(valueOfB, valueOfC, arrayA));

    }
}
