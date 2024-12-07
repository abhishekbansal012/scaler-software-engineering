package org.pixlaunch.module_04.day_23.assignment.ques_04;

public class Solution {

    public void solve(int A) {
        callingPrint(1, A);
        System.out.println(" ");
    }

    private void callingPrint(int n, int A) {
        if(n ==A) {
            System.out.print(n);
        }
        if(n<A) {
            System.out.print(n +" ");
            callingPrint(n+1, A);
        }
    }


}
