package org.pixlaunch.module_05.day_34.assignments.ques_02;

import java.util.List;

public class Solution {
    public int search(final List<Integer> A, int B) {
        return searchRotatedSortedArray(A,B);
    }

    private int searchRotatedSortedArray(List<Integer> A, int K) {
        int n = A.size();
        int start =0, end=n-1;

        while (start<=end) {
            int mid = (start+end)/2;

            if(A.get(mid)==K) {
                return mid;
            }

            if (K >= A.get(0)) {//K lies in Part A
                if (A.get(mid) >= A.get(0)) {
                    if (A.get(mid) < K) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }else {
                    end = mid-1;
                }
            } else {//K lies in Part K
                if (A.get(mid) < A.get(0)) {
                    if (A.get(mid) < K) {
                        start=mid+1;
                    }else {
                        end= mid-1;
                    }
                }else {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
