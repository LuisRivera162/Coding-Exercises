//Given an array nums of n integers where n > 1,  return an array output such that output[i] 
//is equal to the product of all the elements of nums except nums[i].

// Note: Please solve it without division and in O(n).

// https://leetcode.com/problems/product-of-array-except-self/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length]; 
        
        int leftToRight[] = new int[nums.length];
        int rightToLeft[] = new int[nums.length];
        
        leftToRight[0] = 1; 
        rightToLeft[nums.length-1] = 1; 
        
        for(int i = 1; i < nums.length; i++)
            leftToRight[i] = leftToRight[i-1] * nums[i-1];
        
        for(int i = nums.length-2; i >= 0; i--)
            rightToLeft[i] = rightToLeft[i+1] * nums[i+1];
        
        for(int i = 0; i < nums.length; i++)
            result[i] = leftToRight[i] * rightToLeft[i];
        
        return result; 
    }
}

// need to come up with a constant space complexity solution (not including returning list). 
