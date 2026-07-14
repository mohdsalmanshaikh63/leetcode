package com.mohammed.leetcode.arrays;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
     // first create a hash set
     // loop the array
     // check if the hash set already contains the current element
     // if yes immediately return false inside the loop
     // else at the end return false
     if(nums.length == 0) return false;
     HashSet<Integer> set = new HashSet<>();
     for(int i = 0; i < nums.length; i++) {
        if(set.contains(nums[i])) return true;
        else set.add(nums[i]);
     }
     return false;
    }

    public static void main(String args[]) {
        ContainsDuplicate solution = new ContainsDuplicate();

        System.out.println(solution.containsDuplicate(new int[]{1,2,3,1}));
        System.out.println(solution.containsDuplicate(new int[]{1,2,3,4}));
        System.out.println(solution.containsDuplicate(new int[]{1,1}));
        System.out.println(solution.containsDuplicate(new int[]{}));
    }
}
