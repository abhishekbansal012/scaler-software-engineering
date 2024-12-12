package org.pixlaunch.module_03.day_15.assignment.ques_02;

public class Solution_UnOptimised_01 {

    //Time complexity of is O(N^3)
    public String longestPalindrome(String A) {
        int ans = Integer.MIN_VALUE;
        String ansPalindrome = "";
        for(int i=0;i<A.length(); i++) {
            for(int j=i; j<A.length(); j++) {
                if(checkSubstringPalindrome(A, i, j)){

                    if(ans<j-i+1) {
                        ans = Math.max(ans, j-i+1);
                        ansPalindrome = A.substring(i,j);
                    }
                }
            }
        }

        return ansPalindrome;
    }

    boolean checkSubstringPalindrome(String subStr, int start, int end){
        while(start < end) {
            if(subStr.charAt(start)!= subStr.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
