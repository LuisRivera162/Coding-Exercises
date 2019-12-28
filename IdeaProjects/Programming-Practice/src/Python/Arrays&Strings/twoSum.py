// https://leetcode.com/problems/two-sum/

class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        map = {}
        for index in range(len(nums)):
            if (target - nums[index]) in map:
                return [map[target-nums[index]], index]
            map[nums[index]] = index
            
    
    
