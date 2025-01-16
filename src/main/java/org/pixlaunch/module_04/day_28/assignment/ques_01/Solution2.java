package org.pixlaunch.module_04.day_28.assignment.ques_01;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution2 {


    public int solve(int A, ArrayList<Integer> B) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int isExist =0;

        for (Integer integer : B) {
            if (hmap.containsKey(A-integer)) {
                isExist = 1;
                break;
            }
            hmap.put(integer, A-integer);
        }

        return isExist;

    }
}
