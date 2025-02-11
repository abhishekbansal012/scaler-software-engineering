package org.pixlaunch.module_05.day_37.assignment.ques_02;

public class Solution {

    public ListNode solve(ListNode head, int B, int C) {

        ListNode newNode = new ListNode(B);

        if (head == null) { // If list is empty, return the new node
            return newNode;
        }

        // Insert at start of LinkedList (0-based index)
        if (C == 0) {
            newNode.next = head;
            return newNode; // Update head
        }

        ListNode temp = head;
        int count = 0;

        // Traverse the list to find the (C-1)th node or the last node if C is too large
        while (temp.next != null && count < C - 1) {
            temp = temp.next;
            count++;
        }

        // Insert the new node at position C (or at the tail if C was too large)
        newNode.next = temp.next;
        temp.next = newNode;

        return head; // Head remains unchanged
    }

}
