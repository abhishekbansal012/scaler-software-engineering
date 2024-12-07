package org.pixlaunch.module_04.day_23.assignment.ques_05;

public class Solution {

    public void solve(int A) {
        callingPrint(A);
        System.out.println(" ");
    }

    private void callingPrint(int A) {
        if(A ==1) {
            System.out.print(A);
        }
        if(A>1) {
            System.out.print(A +" ");
            callingPrint(A-1);
        }
    }


}
