package org.pixlaunch.module_06.day_50.assignment.ques_03;

import java.util.Objects;

public class Solution {

    public int lPalin(ListNode A) {
        if (A == null || A.next == null) return 1; // A single node is always a palindrome

        // Step 1: Find the middle of the linked list
        ListNode slow = A, fast = A;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the linked list
        ListNode secondHalf = reverseList(slow);
        ListNode firstHalf = A;
        ListNode temp = secondHalf; // Store head of reversed second half for restoration later

        // Step 3: Compare both halves
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                reverseList(temp); // Restore list before returning
                return 0;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        // Step 4: Restore the list and return result
        reverseList(temp);
        return 1;
    }

    // Utility function to reverse a linked list
    private ListNode reverseList(ListNode head) {
        ListNode prev = null, current = head;
        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

}
