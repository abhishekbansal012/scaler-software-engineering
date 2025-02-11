package org.pixlaunch.module_05.day_36.assignments.ques_05;

public class Solution {
    public void solve(ListNode A) {
        ListNode current = A;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();

    }
}
