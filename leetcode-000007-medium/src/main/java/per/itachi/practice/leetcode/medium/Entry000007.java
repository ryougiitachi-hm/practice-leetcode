package per.itachi.practice.leetcode.medium;

import per.itachi.practice.leetcode.medium.impl.GeneralSolution;

import java.util.concurrent.ThreadLocalRandom;

public class Entry000007 {

    public static void main(String[] args) {
        Solution solution = new GeneralSolution();
        int iInput;
        int iOutput;
        for (int i = 0; i < 100; ++i) {
            iInput = ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE);
            iOutput = solution.reverse(iInput);
            System.out.printf("The reversed %d is %d. %n", iInput, iOutput);
        }
    }
}
