package org.pixlaunch.module_06.day_45.assignment.ques_01;

public class Solution {
    // Function to compute x^y % mod using fast exponentiation
    private long powerMod(long x, long y, int mod) {
        long result = 1;
        x = x % mod;
        while (y > 0) {
            if ((y & 1) == 1) { // If y is odd, multiply x with result
                result = (result * x) % mod;
            }
            y = y >> 1; // Divide y by 2
            x = (x * x) % mod; // Square x
        }
        return result;
    }

    // Function to compute modular inverse using Fermat's Theorem
    private long modInverse(long x, int mod) {
        return powerMod(x, mod - 2, mod); // Works if mod is prime
    }

    // Function to compute nCr % mod iteratively
    public int solve(int A, int B, int C) {
        if (B > A) return 0; // If B > A, nCr is 0
        if (B == 0 || A == B) return 1; // Base cases: nC0 = nCn = 1

        long numerator = 1, denominator = 1;

        for (int i = 0; i < B; i++) {
            numerator = (numerator * (A - i)) % C; // Multiply decreasing numbers
            denominator = (denominator * (i + 1)) % C; // Multiply increasing numbers
        }

        long inverseDenominator = modInverse(denominator, C); // Compute (denominator)^-1 % C
        long result = (numerator * inverseDenominator) % C; // Apply modular division

        return (int) result;
    }
}

