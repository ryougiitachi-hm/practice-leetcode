package per.itachi.practice.leetcode.medium.impl;

import per.itachi.practice.leetcode.medium.Solution;

public class GeneralSolution implements Solution {

    @Override
    public String convert(String s, int numRows) {
        if (numRows <= 1) {
            return s;
        }

        char[][] zigzag = new char[numRows][s.length()];
        char[] prototype = s.toCharArray();
        int loop = 2 * numRows - 2;
        for (int i = 0, length = s.length(); i < length; ++i) {

        }

        return null;
    }
}
