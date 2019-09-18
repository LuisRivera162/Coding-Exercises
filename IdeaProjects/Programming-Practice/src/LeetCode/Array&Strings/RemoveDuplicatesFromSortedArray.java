// Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.


class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 1)
            return nums.length; 
        
        int prev = nums[0]; 
        int index = 0; 
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != prev){
                nums[++index] = nums[i]; 
                prev = nums[i]; 
            }
        }
        return index+1; 
    }
}
