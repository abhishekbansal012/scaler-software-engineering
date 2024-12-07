package org.pixlaunch.module_04.day_22.assignment.ques_02;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public ArrayList<Integer> solve(ArrayList<Integer> A) {

        int xorOfAllElement =0;

        for(int i=0;i<A.size(); i++) {
            xorOfAllElement = xorOfAllElement ^ A.get(i);
        }

        // Step 2: Find the rightmost set bit (we use `xorResult & -xorResult` to isolate the lowest set bit)
        int setBit = xorOfAllElement & (-xorOfAllElement);

        // Step 3: Divide the elements into two groups and XOR separately
        int num1 = 0, num2 = 0;
        for (int num : A) {
            if ((num & setBit) != 0) {
                // If the bit is set, put the number in the first group
                num1 ^= num;
            } else {
                // Otherwise, put it in the second group
                num2 ^= num;
            }
        }

        // Step 4: Create an ArrayList to store the result and return it in ascending order
        ArrayList<Integer> result = new ArrayList<>();
        result.add(Math.min(num1, num2));
        result.add(Math.max(num1, num2));

        return result;

    }


}
