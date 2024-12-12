package org.pixlaunch.module_03.day_15.assignment.ques_01;

public class Solution {

    public String solve(String A) {

        char[] aChar = A.toCharArray();
        for(int i=0; i<aChar.length; i++) {
            if(Character.isUpperCase(aChar[i])) {
                aChar[i] = Character.toLowerCase(aChar[i]);
            } else {
                aChar[i] = Character.toUpperCase(aChar[i]);
            }

        }

        return new String(aChar);
    }

}
