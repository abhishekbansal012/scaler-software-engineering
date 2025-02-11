package org.pixlaunch.module_05.day_34.assignments.ques_01;

public class Solution {
    public int sqrt(int A) {
        int ans=0, start =0, end = A;
        while (start<=end) {
            int mid = (start+end)/2;
            long square = (long) mid * mid; // Use long to prevent overflow
            if(square>A) {
                end = mid-1;
            }else {
                ans = mid;
                start=mid+1;
            }

        }
    return ans;
    }
}
