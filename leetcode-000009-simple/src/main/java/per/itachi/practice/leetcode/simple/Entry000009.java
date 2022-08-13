package per.itachi.practice.leetcode.simple;

import per.itachi.practice.leetcode.simple.impl.GeneralSolution;

import java.util.concurrent.ThreadLocalRandom;

public class Entry000009 {

    public static void main(String[] args) {
        Solution solution = new GeneralSolution();
        for (int i = 0; i < 100; ++i) {
            int input = 12121; // ThreadLocalRandom.current().nextInt();
            boolean output = solution.isPalindrome(input);
            System.out.printf("The result of %d is %s. %n", input, output);
        }
    }
}
