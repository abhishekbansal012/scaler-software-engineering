package org.pixlaunch.module_04.day_21.assignment.ques_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter value of Array A comma separated: ");
        String valueOfA = myObj.next();  // Read user input

        //Convert user String input to Array
        ArrayList<Integer> arrayA = Arrays.stream(valueOfA.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Size of arrayA: "+ arrayA.size());


        Solution solution = new Solution();
        System.out.println(solution.singleNumber(arrayA));

    }
}
