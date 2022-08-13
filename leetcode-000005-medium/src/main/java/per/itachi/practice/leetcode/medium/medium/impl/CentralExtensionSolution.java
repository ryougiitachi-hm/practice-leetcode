package per.itachi.practice.leetcode.medium.medium.impl;

import per.itachi.practice.leetcode.medium.medium.Solution;

/**
 * This method don't need to think about odd and even.
 * The operation traverses the whole array.
 *
 * */
public class CentralExtensionSolution implements Solution {

    @Override
    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 0) {
            return s;
        }

        // store the position range of substring.
        // start position is range[0](included)
        // end position is range[1](included)
        int[] range = new int[] {0, 0};
        for (int i = 0, length = s.length(); i < length; ++i) {
            i = generatePalindrome(i, range, s);
        }
        return s.substring(range[0], range[1] + 1);
    }

    /**
     * @param offset
     * @param range
     *      records the start and end position of palindrome substring,
     *      overwritten when the length of computed is greater than that of current.
     * @param s the main string.
     * @return
     *      the index of right element of central part.
     * */
    private int generatePalindrome(int offset, int[] range, String s) {
        // not good variable name
        int centralLeft = offset;
        int centralRight = centralLeft;
        // initialize the longest central part.
        for (int length = s.length();
             centralRight < length - 1 && s.charAt(centralLeft) == s.charAt(centralRight + 1);
             ++ centralRight);

        int idxCentralRight = centralRight;

        // extension
        while (centralLeft > 0 && centralRight < s.length() - 1
                && s.charAt(centralLeft - 1) == s.charAt(centralRight + 1)) {
            // both decrement and increment must be placed in while block,
            // because comparison may be not equal.
            --centralLeft;
            ++centralRight;
        }

        // records the position.
        if (centralRight - centralLeft > range[1] - range[0]) {
            range[1] = centralRight;
            range[0] = centralLeft;
        }

        return idxCentralRight;
    }

}
