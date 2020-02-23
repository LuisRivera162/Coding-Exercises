// https://leetcode.com/problems/maximum-product-subarray/

class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 0)
            return 0;
        
        int maxProduct = nums[0];
        int currProduct = 1;
        
        for(int i = 0; i < nums.length; i++){
            currProduct = currProduct * nums[i];
            maxProduct = Math.max(maxProduct, Math.max(currProduct, nums[i]));
            if(currProduct == 0)
                currProduct = 1;
        }
        
        currProduct = 1;
        for(int i = nums.length-1; i >= 0; i--){
            currProduct = currProduct * nums[i];
            maxProduct = Math.max(maxProduct, Math.max(currProduct, nums[i]));
            if(currProduct == 0)
                currProduct = 1;
        }
        
        
        return maxProduct;
    }
}
