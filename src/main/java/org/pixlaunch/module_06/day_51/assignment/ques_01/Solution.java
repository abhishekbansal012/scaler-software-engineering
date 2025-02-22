package org.pixlaunch.module_06.day_51.assignment.ques_01;

public class Solution {
    public ListNode getIntersectionNode(ListNode A, ListNode B) {
        if (A == null || B == null) return null;

        ListNode pA = A, pB = B;

        // Traverse both lists, switching to the other list when reaching the end
        while (pA != pB) {
            pA = (pA == null) ? B : pA.next;
            pB = (pB == null) ? A : pB.next;
        }

        return pA; // Either intersection node or null
    }
}
