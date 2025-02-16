package org.pixlaunch.module_06.day_50.assignment.ques_01;

import java.util.Objects;

public class Solution {

    public ListNode sortList(ListNode A) {

        if (A == null || A.next == null) {
            return A;
        }

        // Step 1: Split list into two halves
        ListNode mid = getMiddle(A);
        ListNode rightHalf = mid.next;
        mid.next = null;

        // Step 2: Recursively sort both halves
        ListNode leftSorted = sortList(A);
        ListNode rightSorted = sortList(rightHalf);

        // Step 3: Merge sorted halves
        return merge(leftSorted, rightSorted);

    }

    // Function to find the middle of the linked list
    private ListNode getMiddle(ListNode head) {
        ListNode slow = head, fast = head.next; // fast starts one step ahead
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Function to merge two sorted linked lists
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // Append remaining nodes
        if (l1 != null) current.next = l1;
        if (l2 != null) current.next = l2;

        return dummy.next;
    }

}
