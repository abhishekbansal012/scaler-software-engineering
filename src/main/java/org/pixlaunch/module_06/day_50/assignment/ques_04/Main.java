package org.pixlaunch.module_06.day_50.assignment.ques_04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ListNode A = new ListNode(1);
        A.next = new ListNode(2);
        A.next.next = new ListNode(3);
        A.next.next.next = new ListNode(4);
        A.next.next.next.next = new ListNode(5);
        Solution solution = new Solution();
        System.out.println(solution.solve(A));

    }
}
