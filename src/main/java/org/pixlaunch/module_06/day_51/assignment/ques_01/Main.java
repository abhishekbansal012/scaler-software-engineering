package org.pixlaunch.module_06.day_51.assignment.ques_01;

public class Main {

    public static void main(String[] args) {

        // Creating two linked lists with intersection
        ListNode common = createLinkedList(new int[]{8, 4, 5});
        ListNode A = createLinkedList(new int[]{4, 1});
        ListNode B = createLinkedList(new int[]{5, 6, 1});

        // Connecting the intersection
        ListNode tempA = A;
        while (tempA.next != null) tempA = tempA.next;
        tempA.next = common;

        ListNode tempB = B;
        while (tempB.next != null) tempB = tempB.next;
        tempB.next = common;

        // Finding intersection
        Solution solution = new Solution();
        ListNode intersection = solution.getIntersectionNode(A, B);
        System.out.println("Intersection at node: " + (intersection != null ? intersection.val : "null"));


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
}
