package org.pixlaunch.module_06.day_51.assignment.ques_03;


import java.util.HashSet;

public class Solution {

    public ListNode solve(ListNode A) {

        if (A == null) {
            return null;
        }

        ListNode current = A;
        HashSet<ListNode> visited = new HashSet<>();

        while (current != null) {
            if(current.next!=null) {
                // If we detect a cycle, break and indicate it
                if (visited.contains(current.next)) {
                    current.next = null;
                    break;
                }
            }
            visited.add(current);
            current = current.next;
        }
        return A;
    }
}
