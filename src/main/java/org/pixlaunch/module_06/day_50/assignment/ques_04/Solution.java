package org.pixlaunch.module_06.day_50.assignment.ques_04;

public class Solution {

    public int solve(ListNode A) {
        ListNode slow = A, fast = A;
        // Move fast two steps and slow one step at a time
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }


        return slow.val;
    }

}
