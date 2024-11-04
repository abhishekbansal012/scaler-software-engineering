package org.pixlaunch.module_02.day_06.extraQuestions.ques_01;

import java.util.ArrayList;
import java.util.List;

public class SolutionBruteforce {

    public List<Integer> solve(ArrayList<Integer> A, int B) {

        int length = A.size();
        int temp;

        for(int i=0;i<B;i++) {

            temp = A.get(0);

            for(int j=0;j<=length-2;j++) {
                A.set(j, A.get(j+1));
            }

            A.set(length-1,temp);
        }
    return A;
    }
}
