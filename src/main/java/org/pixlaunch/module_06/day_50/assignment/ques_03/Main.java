package org.pixlaunch.module_06.day_50.assignment.ques_03;

public class Main {

    public static void main(String[] args) {
        ListNode A = null;
        ListNode B = null;

        // Inserting values into Linked List A
        A = insert(A, 1);
        A = insert(A, 2);
        A = insert(A, 2);
        A = insert(A, 1);

        Solution solution = new Solution();
        System.out.println(solution.lPalin(A));

    }

    public static ListNode insert(ListNode head, int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            return newNode;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }


}
