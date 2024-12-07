package org.pixlaunch.module_04.day_23.assignment.ques_03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Read values from user
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter value of A: ");
        int valueOfA = myObj.nextInt();  // Read user input


        Solution solution = new Solution();
        System.out.println(solution.findAthFibonacci(valueOfA));

    }
}
