package org.pixlaunch.module_05.day_37.assignment.ques_02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int B = 81;
        int C = 471;
        Solution solution = new Solution();
        printList(solution.solve(createList(),B,C));

    }

    public static ListNode createList() {
        int[] values = {88,17,36,79,60,11,69,49,93,63,86,59,15,92,66,9,70,72,92,83,45,5,21,66,66,68,9,74,16,89,30,54,68,49,57,99,68,39,67,69,31,88,46,64,100,27,81,44,70,45,59,19,45,18,57,37,32,94,35,47,29,9,91,17,24,39,46,42,36,45,69,99,93,83,42,60,56,84,76,66,82,29,22,48,38,9,41,59,42,30,73,10,58,51,29,22,68,48,16,98,49,70,84,60,35,8,22,6,85,59,92,95,27,82,70,60,71,99,54,51,24,100,48,87,67,75,78,37,93,3,85,85,78,61,62,63,89,20,59,95,10,28,99,89,15,11,18,94,32,63,66,89,55,65,83,94,28,62,12,99,82,8,67,98,15,70,93,61,56,49,84,81,11,40,79,62,4,61,54,54,41,45,83,78,94,88,2,52,93,58,42,27,66,4,89,57,37,53,60,96,31,33,9,14,53,86,40,25,65,66,6,32,35,5,53,64,41,13,21,72,27,13,96,85,92,34,44,3,87,98,76,98,15,40,22,93,75,90,40,79,26,60,18,37,73,60,14,37,44,13,1,38,33,31,79,66,81,90,54,58,53,2,71,2,10,52,76,47,97,100,49,46,16,54,23,12,55};

        if (values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }


    // Helper function to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
