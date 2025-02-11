package org.pixlaunch.module_05.day_37.assignment.ques_03;

public class Solution {

    public ListNode solve(ListNode A, int B) {

        if (A == null) {
            return null;
        }

        if(B ==0) {
            return A.next;
        }

        int  count=0;
        ListNode temp = A;
        // Traverse the list to find the (C-1)th node or the last node if C is too large
        while (temp.next != null && count < B-1) {
            temp = temp.next;
            count++;
        }

        // If temp is null or temp.next is null, B is out of bounds
        if (temp == null || temp.next == null) {
            return A; // Return the original list unchanged
        }
        temp.next=temp.next.next;

        return A;
    }

}
