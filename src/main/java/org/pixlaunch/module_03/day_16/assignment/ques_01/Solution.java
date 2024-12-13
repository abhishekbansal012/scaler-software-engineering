package org.pixlaunch.module_03.day_16.assignment.ques_01;

public class Solution {

    public int solve(String A) {
        int totalOnes = 0;
        //counting total ones
        for(int i=0;i<A.length();i++) {
            if(A.charAt(i)=='1') {
                totalOnes++;
            }
        }

        if(totalOnes == A.length()) {
            return A.length();
        }

        int ans = 0;
        for(int i=0;i<A.length();i++) {

            if(A.charAt(i)=='0') {

                int numOfOnesOnLeft = 0;
                int j=i-1;
                while(j>=0 && A.charAt(j) == '1') {
                    numOfOnesOnLeft++;
                    j--;
                }

                int numOfOnesOnRight = 0; int k=i+1;
                while(k<A.length() && A.charAt(k) == '1') {
                    numOfOnesOnRight++;
                    k++;
                }

                int count=0;
                if(numOfOnesOnLeft+numOfOnesOnRight < totalOnes) {
                    count = numOfOnesOnLeft+numOfOnesOnRight+1;
                }
                else {
                    count = numOfOnesOnLeft+numOfOnesOnRight;
                }

                ans = Math.max(ans, count);
            }
        }
        return ans;
    }

}
