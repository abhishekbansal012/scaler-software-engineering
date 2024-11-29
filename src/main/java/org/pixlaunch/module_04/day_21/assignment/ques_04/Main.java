package org.pixlaunch.module_04.day_21.assignment.ques_04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter value of A: ");
        int valueOfA = myObj.nextInt();  // Read user input

        System.out.println("Enter value of B: ");
        int valueOfB = myObj.nextInt();




        Solution solution = new Solution();
        System.out.println(solution.solve(valueOfA, valueOfB));

    }
}
