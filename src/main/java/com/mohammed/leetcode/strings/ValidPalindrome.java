package com.mohammed.leetcode.strings;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        // use two pointers - one starts from the begining of the string and one from
        // the end
        // create a util method which will return if the current character is non
        // alphanumeric
        // at any point if the character is non matching stop the comparision and
        // immediately return false
        // the traversing should stop once they have reached mid point or they have
        // crossed each other
        // return true at the end
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }

            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));
            if (leftChar != rightChar) {
                return false;
            }
            left++;
            right--;

        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome solution = new ValidPalindrome();

        test(solution, "A man, a plan, a canal: Panama", true);
        test(solution, "race a car", false);
        test(solution, " ", true);
        test(solution, "", true);
        test(solution, ".,", true);
        test(solution, "0P", false);
        test(solution, "Madam", true);
        test(solution, "No 'x' in Nixon", true);
    }

    private static void test(ValidPalindrome solution, String input, boolean expected) {
        boolean actual = solution.isPalindrome(input);

        System.out.printf(
                "Input: %-30s Expected: %-5s Actual: %-5s %s%n",
                "\"" + input + "\"",
                expected,
                actual,
                expected == actual ? "PASS ✅" : "FAIL ❌");
    }

}
