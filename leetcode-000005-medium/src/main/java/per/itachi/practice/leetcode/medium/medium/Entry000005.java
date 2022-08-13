package per.itachi.practice.leetcode.medium.medium;

import per.itachi.practice.leetcode.medium.medium.impl.CentralExtensionSolution;

public class Entry000005 {

    public static void main(String[] args) {
        String s = args[0];
        Solution solution = new CentralExtensionSolution();
        String palindrome = solution.longestPalindrome(s);
        System.out.printf("The longest palindrome of %s is %s. %n", s, palindrome);
    }
}