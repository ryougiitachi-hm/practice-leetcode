package per.itachi.practice.leetcode.medium.impl;

import per.itachi.practice.leetcode.medium.Solution;

/**
 * The point is to handle overflow.
 * */
public class GeneralSolution implements Solution {

    @Override
    public int reverse(int x) {
        if (x == 0) {
            return 0;
        }

        // actually, no need
        boolean negative = false;
        if (x < 0) {
            negative = true;
            x = -x;
        }

        int reversed = 0;
        int digit;
        while(x > 0) {
            if (reversed > Integer.MAX_VALUE / 10) {// for overflow
                return 0;
            }
            digit = x % 10;
            x /= 10;
            reversed *= 10;
            reversed += digit;
        }

        // actually, no need
        if (negative) {
            reversed = -reversed;
        }
        return reversed;
    }
}
