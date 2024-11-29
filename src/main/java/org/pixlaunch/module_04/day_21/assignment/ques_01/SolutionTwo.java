package org.pixlaunch.module_04.day_21.assignment.ques_01;

public class SolutionTwo {

    public int numSetBits(int A) {
        int count = 0;
        // Loop through all bits of the integer
        while (A != 0) {
            A = A&(A-1);
            count++;
        }

        return count;
    }

}
