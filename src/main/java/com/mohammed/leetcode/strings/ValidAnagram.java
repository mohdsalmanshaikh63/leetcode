package com.mohammed.leetcode.strings;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        // create a integer character array of size 26
        // loop first string and increment character frequency
        // then loop second string and decrement the respective character
        // after both strings have been traversed check if in the character array, any
        // character has nonzero frequency
        // if yes return false
        // else return true
        if(s.length() != t.length()) return false;
        int[] charCount = new int[26];
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();
        for (int i = 0; i < first.length; i++) {
            int charIndex = first[i] - 'a';
            charCount[charIndex]++;
        }
        for (int i = 0; i < second.length; i++) {
            int charIndex = second[i] - 'a';
            charCount[charIndex]--;
        }

        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String args[]) {
        ValidAnagram solution = new ValidAnagram();

        System.out.println(solution.isAnagram("anagram", "nagaram")); // true
        System.out.println(solution.isAnagram("rat", "car")); // false
        System.out.println(solution.isAnagram("", "")); // true
        System.out.println(solution.isAnagram("a", "a")); // true
        System.out.println(solution.isAnagram("ab", "ba")); // true
        System.out.println(solution.isAnagram("aab", "abb")); // false
        System.out.println(solution.isAnagram("abc", "ab")); // false

    }

}