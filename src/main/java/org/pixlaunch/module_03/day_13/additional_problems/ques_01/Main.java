package org.pixlaunch.module_03.day_13.additional_problems.ques_01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter value of N: ");
        int valueOfN = myObj.nextInt();  // Read user input
        Solution solution = new Solution();
        System.out.println(solution.solve(valueOfN));

    }
}
