package org.pixlaunch.module_02.day_06.assignment.ques_3;

import java.util.ArrayList;
import java.util.List;

public class SolutionBruteforce {

    public List<Integer> solve(ArrayList<Integer> A, int B) {

        int length = A.size();
        int temp;

        for(int i=0;i<B;i++) {

            temp = A.get(length-1);

            for(int j=length-2;j>=0;j--) {
                A.set(j+1, A.get(j));
            }

            A.set(0,temp);
        }
    return A;
    }
}
