package org.pixlaunch.module_03.day_11.ques_02;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public int solve(ArrayList<Integer> A) {

        Collections.sort(A);
        int size = A.size();
        for(int i = 0; i < size; i++){
            while(i+1<size && A.get(i) == A.get(i+1))
                i++;
            if(A.get(i) == size-1-i)
                return 1;
        }
        return -1;
    }
}
