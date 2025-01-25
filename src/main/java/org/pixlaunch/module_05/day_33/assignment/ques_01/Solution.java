package org.pixlaunch.module_05.day_33.assignment.ques_01;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public ArrayList<Integer> searchRange(final List<Integer> A, int B) {
        ArrayList<Integer> returnArray = new ArrayList<>();
        returnArray.add(findFirstOccurrence(A,B));
        returnArray.add(findLastOccurrence(A,B));

        return returnArray;
    }



    private Integer findFirstOccurrence(List<Integer> arrayA, int b) {
        int start =0;
        int end = arrayA.size()-1;
        int ans = -1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(arrayA.get(mid) == b) {
                ans = mid;
                end = mid-1;
            } else if (arrayA.get(mid) < b) {
                start = mid+1;

            }else {
                end = mid-1;
            }
        }
        return ans;
    }

    private Integer findLastOccurrence(List<Integer> arrayA, int b) {
        int start =0;
        int end = arrayA.size()-1;
        int ans = -1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(arrayA.get(mid) == b) {
                ans = mid;
                start = mid+1;
            } else if (arrayA.get(mid) < b) {
                start = mid+1;

            }else {
                end = mid-1;
            }
        }
        return ans;
    }

}
