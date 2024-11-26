package org.pixlaunch.module_03.day_12;

public class Solution {

    public String addBinary(String A, String B) {

        StringBuilder result = new StringBuilder();

        int i = A.length() - 1, j = B.length() - 1, carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) sum += A.charAt(i--) - '0';
            if (j >= 0) sum += B.charAt(j--) - '0';

            result.append(sum % 2);
            carry = sum / 2;
        }

        return result.reverse().toString();
    }

}
