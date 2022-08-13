package per.itachi.practice.leetcode.hard;

import per.itachi.practice.leetcode.hard.impl.OfficalSolution;

public class Entry000010 {

    public static void main(String[] args) {
        Solution solution = new OfficalSolution();
        String strSource = args[0];
        String strRegex = args[1];
        boolean matched = solution.isMatch(strSource, strRegex);
        System.out.printf("The source is %s, regex is %s , %s",
                strSource, strRegex, matched);
    }
}
