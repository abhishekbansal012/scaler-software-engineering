package org.pixlaunch.module_03.day_12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter value of A: ");
        String valueOfA = myObj.next();

        System.out.println("Enter value of B: ");
        String valueOfB = myObj.next();

        Solution solution = new Solution();
        System.out.println(solution.addBinary(valueOfA, valueOfB));

    }
}
