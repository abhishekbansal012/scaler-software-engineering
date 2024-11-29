package org.pixlaunch.module_04.day_21.assignment.ques_01;

public class Solution {

    public int numSetBits(int A) {
        int count = 0;
        // Loop through all bits of the integer
        while (A != 0) {
            // Increment count if the last bit is 1
            count += (A & 1);
            // Right shift the number by 1 to check the next bit
            A >>= 1;
        }

        return count;
    }

}
