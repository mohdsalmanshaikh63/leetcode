package com.mohammed.leetcode.strings;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        // there are many possible edge cases but let's tackle them later
        // first let's implement what is clear
        // loop all the strings
        // start with the first word
        // compare first letter of first word to first letter of second word
        // then compare first letter of first word to first letter of second word
        // then continue till we have compared all words
        // reset
        // repeat above steps for the next letter
        // now we need some stopping condition to break out with the longest prefix
        // if we have reached end of first string or second string, we need to break
        // with whatever the current prefix is present
        // if the character matches, then append that character to the prefix
        var prefix = new StringBuilder("");
        var first = strs[0];
        for (int i = 0; i < first.length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                // check letter by letter first and second string character
                // immediately return prefix if there is a mismatch
                var second = strs[j];
                // if second string has no characters left to compare then also return the current prefix
                if(i >= second.length()) return prefix.toString();
                if(first.charAt(i) != second.charAt(i)) return prefix.toString();
            }
            prefix.append(first.charAt(i));
        }

        return prefix.toString();
    }

    public static void main(String[] args) {
    LongestCommonPrefix solution = new LongestCommonPrefix();

    test(solution, new String[]{"flower", "flow", "flight"}, "fl");
    test(solution, new String[]{"dog", "racecar", "car"}, "");
    test(solution, new String[]{"interspecies", "interstellar", "interstate"}, "inters");
    test(solution, new String[]{"throne", "throne"}, "throne");
    test(solution, new String[]{"", "b"}, "");
    test(solution, new String[]{"a"}, "a");
    test(solution, new String[]{"ab", "a"}, "a");
    test(solution, new String[]{"prefix", "prefixes", "prefixation"}, "prefix");
    test(solution, new String[]{"same", "same", "same"}, "same");
}

private static void test(LongestCommonPrefix solution, String[] input, String expected) {
    String actual = solution.longestCommonPrefix(input);

    System.out.printf(
            "Input: %-45s Expected: %-10s Actual: %-10s %s%n",
            java.util.Arrays.toString(input),
            "\"" + expected + "\"",
            "\"" + actual + "\"",
            expected.equals(actual) ? "PASS ✅" : "FAIL ❌");
}
}
