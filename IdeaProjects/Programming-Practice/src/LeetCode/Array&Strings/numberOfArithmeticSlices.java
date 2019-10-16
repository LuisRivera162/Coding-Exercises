// A sequence of number is called arithmetic if it consists of at least three elements 
// and if the difference between any two consecutive elements is the same.

// https://leetcode.com/problems/arithmetic-slices/

class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int result = 0; 
        for(int i = 1; i < A.length-1; i++){
            int temp = i;
            int diff = A[i-1] - A[i]; 
            while(temp < A.length-1){
                if(A[temp] - A[temp+1] == diff)
                    result = result+1;
                else
                    break; 
                
                temp++; 
            }
        }
        return result; 
    }
}

//Working on dp solution

// dp solution: 

class Solutiondp {
    public int numberOfArithmeticSlices(int[] A) {
        int result = 0; 
        int dp = 0;
        for(int i = 2; i < A.length; i++){
            if(A[i] - A[i-1] == A[i-1] - A[i-2]){
                dp++;
                result += dp;
            }
            else dp = 0;
        }
        return result; 
    }
}
