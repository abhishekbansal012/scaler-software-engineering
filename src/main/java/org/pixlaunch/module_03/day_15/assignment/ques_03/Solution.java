package org.pixlaunch.module_03.day_15.assignment.ques_03;

public class Solution {

    public String solve(String A) {
        String modifiedString = A.concat(A);
        modifiedString = removeUpperCaseAlphabets(modifiedString);
        modifiedString = convertVowelsWithSymbol(modifiedString);
        return modifiedString;
    }

    private String convertVowelsWithSymbol(String input) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        StringBuilder modifiedString = new StringBuilder(input);

        for (int i = 0; i < modifiedString.length(); i++) {
            char currentChar = modifiedString.charAt(i);
            for (char vowel : vowels) {
                if (currentChar == vowel) {
                    modifiedString.setCharAt(i, '#');
                    break;
                }
            }
        }
        return modifiedString.toString();
    }

    private static String removeUpperCaseAlphabets(String A) {
        StringBuilder modifiedString = new StringBuilder();
        for(int i = 0; i< A.length(); i++) {
            if(!Character.isUpperCase(A.charAt(i))) {
                modifiedString.append(A.charAt(i));
            }
        }
        return modifiedString.toString();
    }
}
