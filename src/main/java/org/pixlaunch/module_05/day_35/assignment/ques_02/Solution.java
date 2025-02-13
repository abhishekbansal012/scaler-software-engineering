package org.pixlaunch.module_05.day_35.assignment.ques_02;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        long s=0;
        long e = A.get(A.size()-1) - A.get(0);
        long ans=0;
        while(s<=e) {
            long mid = (s+e)/2;
            if(isPossible(A,mid,B)) {
                ans=mid;
                s = mid+1;
            }else {
                e=mid-1;
            }
        }
        return (int) ans;
    }

    private boolean isPossible(ArrayList<Integer> a, long mid, int b) {

        int cow=1, positionOfLastCow=a.get(0);

        for(int i=1;i<a.size();i++) {
            if(a.get(i)-positionOfLastCow>= mid) {
                cow++;
                positionOfLastCow = a.get(i);
                if(cow==b) {
                    return true;
                }
            }
        }
        return false;
    }
}
