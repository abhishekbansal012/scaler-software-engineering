package org.pixlaunch.module_05.day_37.assignment.ques_01;

public class Solution {

    public ListNode reverseList(ListNode A) {
        ListNode prev = null;
        ListNode current = A;
        ListNode next = null;

        while (current != null) {
            next = current.next; // Store next node
            current.next = prev; // Reverse the link
            prev = current; // Move prev to current node
            current = next; // Move current to next node
        }

        return prev; // New head of the reversed list

    }

}
