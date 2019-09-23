// Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

// Find all the elements of [1, n] inclusive that do not appear in this array.

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>(); 
        HashSet<Integer> set = new HashSet<>(); 
        
        for(int n : nums)
            set.add(n); 
        
        for(int i = 0; i < nums.length; i++)
            if(!set.contains(i+1))
                list.add(i+1); 
        
        return list; 
        
    }
}

// First Attempt, Need to provide a solution without needing extra space. 
// At the moment pretty brute force, again, will work on improving this solution.
