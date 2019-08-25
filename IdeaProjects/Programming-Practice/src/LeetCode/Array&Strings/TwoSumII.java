  //Question:
	//Given an array of integers, find two numbers such that they add up to a specific target
	//number.
	//The function twoSum should return indices of the two numbers such that they add up to
	//the target, where index1 must be less than index2. Please note that your returned answers
	//(both index1 and index2) are not zero-based.
	//You may assume that each input would have exactly one solution.
	//However, this time the array is sorted.

	public static int[] twoSumII(int[] nums, int target) {
		
		int end = nums.length-1; 
		int start = 0; 
		
		while (start < end) {
			int sum = nums[start] + nums[end];
			if(sum > target)
				end--; 
			if(sum < target)
				start++; 
			if(sum == target)
				return new int[] {start, end};
		}
		
		throw new IllegalArgumentException("No two sum solution");
	}
