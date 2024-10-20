package org.pixlaunch.module_02.day_04.additional_problems.ques_01;

public class Solution {

    public int solve(int A) {
        return findPerfectNumber(A);
    }

    private int findPerfectNumber(int n) {
        if (n <= 1) {
            return 0;
        }

        int sum =0;
        //Perfect number is a positive integer which is equal to the sum of its proper positive divisors.

        sum = findSumOfDivisors(n);

        if(sum==n) {
            return 1;
        }
        return 0;
    }

    private int findSumOfDivisors(int n) {
        int sum = 1;
        for(int i = 2; i<=Math.sqrt(n); i++) {
           if(n % i ==0) { //remainder zero
               //We found a pair of divisors
               sum+=i;
               if(i != n/i) {
                   sum+= n/i;
               }
           }
        }
        return sum;
    }

}
