package org.pixlaunch.module_05.day_33.assignment.ques_02;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int searchInsert(ArrayList<Integer> A, int B) {

        if(A.get(0) >B) {
            return 0;
        }

        return findOccurrenceBinarySearch(A,B);
    }

    private Integer findOccurrenceBinarySearch(List<Integer> arrayA, int b) {
        int start =0;
        int end = arrayA.size()-1;
        int ans = -1;
        int closetNumber = -1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(arrayA.get(mid) == b) {
                ans = mid;
                end = mid-1;
            } else if (arrayA.get(mid) < b) {
                start = mid+1;
                closetNumber = mid+1;
            }else {
                end = mid-1;
            }
        }


        if(ans == -1) {
            if(closetNumber == -1) {
                return arrayA.size();
            }
            return closetNumber;
        }
        return ans;
    }

}
