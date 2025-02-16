package org.pixlaunch.module_06.day_50.assignment.ques_02;

import java.util.Objects;

public class Solution {

    public ListNode mergeTwoLists(ListNode A, ListNode B) {

        if(Objects.isNull(A)) {
            return B;
        }

        if(Objects.isNull(B)) {
            return A;
        }
        ListNode dummy = new ListNode(-1); // (Corrected variable name
        ListNode tail = dummy;  // New variable to track merged list

        while (Objects.nonNull(A) && Objects.nonNull(B)) {
            if(A.val < B.val) {
                tail.next = A;
                A = A.next;
            } else {
                tail.next = B;
                B = B.next;
            }
            tail = tail.next; // Moving the tail forward
        }

        if(A==null) {
            tail.next=B;
        }else {
            tail.next=A;
        }

        return dummy.next;
    }

}
