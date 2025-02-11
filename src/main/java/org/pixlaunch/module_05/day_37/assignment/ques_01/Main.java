package org.pixlaunch.module_05.day_37.assignment.ques_01;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        printList(solution.reverseList(createList()));

    }

    public static ListNode createList() {
        int[] values = {1, 2, 3, 4, 5};

        if (values.length == 0) {
            return null;
        }

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
