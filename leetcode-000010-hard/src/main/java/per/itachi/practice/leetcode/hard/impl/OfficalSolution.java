package per.itachi.practice.leetcode.hard.impl;

import per.itachi.practice.leetcode.hard.Solution;

/**
 * 83.92% users, 91.68% memory.
 * */
public class OfficalSolution implements Solution {

    @Override
    public boolean isMatch(String s, String p) {
        // verify regular expression
        if (p.length() > 0) {
            if (p.charAt(0) == '*') {
                return false;
            }
        }

        int sLen = s.length();
        int pLen = p.length();
        boolean[][] matrix = new boolean[sLen + 1][pLen + 1];
        // matrix stores the matching relationship between s and p.
        matrix[0][0] = true; // prerequisite, not understand.
        for (int i = 0; i <= sLen; ++i) {
            for (int j = 1; j <= pLen; ++j) {
                if (p.charAt(j - 1) == '*') {
                    matrix[i][j] = matrix[i][j - 2];
                    if (matches(s, p, i, j - 1)){
                        matrix[i][j] = matrix[i][j] || matrix[i - 1][j];
                    }
                }
                else {
                    if (matches(s, p, i, j)) {
                        matrix[i][j] = matrix[i - 1][j - 1];
                    }
                }
            }
        }
        return matrix[sLen][pLen];
    }

    private boolean matches(String s, String p, int i, int j) {
        if (i == 0) {
            return false;
        }
        if (p.charAt(j - 1) == '.') {
            return true;
        }
        return s.charAt(i - 1) == p.charAt(j - 1);
    }
}
