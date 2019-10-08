// Given a sorted array nums, remove the duplicates in-place such that duplicates appeared at most twice and return the new length.

// Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0; 
        int index = 1, counter = 1, prev = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            if(prev == nums[i]){
                if(counter < 2){
                    counter++;
                    nums[index++] = nums[i]; 
                }
            }
            
            else{
                counter = 1; 
                nums[index++] = nums[i]; 
                prev = nums[i]; 
            }
        }
        
        return index; 
    }
}
