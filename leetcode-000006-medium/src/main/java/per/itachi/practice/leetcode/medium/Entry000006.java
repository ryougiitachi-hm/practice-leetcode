package per.itachi.practice.leetcode.medium;

import per.itachi.practice.leetcode.medium.impl.GeneralSolution;

public class Entry000006 {

    public static void main(String[] args) {
        String strInput = args[0];
        Solution solution = new GeneralSolution();
        int lines = 5;
        String strOutput = solution.convert(args[0], lines);
        System.out.printf("The zigzag of %s in lines %d is %s %n ",
                strInput, lines, strOutput);
    }
}
