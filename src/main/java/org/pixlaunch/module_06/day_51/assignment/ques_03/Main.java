package org.pixlaunch.module_06.day_51.assignment.ques_03;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        // Creating two linked lists with intersection
        ListNode common = createLinkedList(new int[]{4, 5, 6});
        ListNode A = createLinkedList(new int[]{3, 2});
        makeCircularAfterA(A, common);
        Solution solution = new Solution();
        printList(solution.solve(A));

    }

    // Helper function to create a linked list from an array
    public static ListNode createLinkedList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    public static void makeCircularAfterA(ListNode A, ListNode common) {
        if (A == null || common == null) {
            return;
        }

        // Find the last node of A
        ListNode currentA = A;
        while (currentA.next != null) {
            currentA = currentA.next;
        }

        // Connect A's last node to common's head
        currentA.next = common;

        // Find the last node of common
        ListNode currentCommon = common;
        while (currentCommon.next != null) {
            currentCommon = currentCommon.next;
        }

        // Make common circular by pointing its last node to its head
        currentCommon.next = common;
    }

    public static void printList(ListNode A) {
        if (A == null) {
            System.out.println("List is empty.");
            return;
        }

        ListNode current = A;
        HashSet<ListNode> visited = new HashSet<>();

        while (current != null) {
            System.out.print(current.val + " -> ");

            // If we detect a cycle, break and indicate it
            if (visited.contains(current)) {
                System.out.println("(cycle detected at " + current.val + ")");
                return;
            }
            visited.add(current);
            current = current.next;
        }

        System.out.println("null"); // End of non-circular list
    }
}
