package org.pixlaunch.day_06.additional_problems.ques_1;

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
