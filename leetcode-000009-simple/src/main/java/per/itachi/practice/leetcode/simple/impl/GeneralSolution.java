package per.itachi.practice.leetcode.simple.impl;

import per.itachi.practice.leetcode.simple.Solution;

/**
 * 91.13% users, 24.27% memory
 * */
public class GeneralSolution implements Solution {

    @Override
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        // shirk
        String strX = String.valueOf(x);
        for (int i = 0, length = strX.length(); i < (length >> 1); ++i) {
            if (strX.charAt(i) != strX.charAt( length - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
