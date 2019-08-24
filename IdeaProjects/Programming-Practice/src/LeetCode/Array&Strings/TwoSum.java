
//Question:
//Given an array of integers, find two numbers such that they add up to a specific target
//number.
//The function twoSum should return indices of the two numbers such that they add up to
//the target, where index1 must be less than index2. Please note that your returned answers
//(both index1 and index2) are not zero-based.
//You may assume that each input would have exactly one solution.
  
public static int[] twosum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>(); 
		for(int i =0; i < nums.length; i++) {
			map.put(nums[i], i); 
		}
		
		for(int i = 0; i < nums.length; i++) {
			if(map.containsKey(target-nums[i]))
				return new int[] {i, map.get(target-nums[i])};
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	
	//This solution has a time complexity of O(n), where n 
	//is the number of elements in the array nums.
