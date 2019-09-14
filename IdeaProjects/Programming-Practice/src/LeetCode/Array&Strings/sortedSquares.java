// Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, 
// also in sorted non-decreasing order.

class Solution {
    public int[] sortedSquares(int[] A) {
        for(int i = 0; i < A.length; i++)
            A[i] = (int) Math.pow(A[i], 2); 
        Arrays.sort(A);
        return A;   
    }
}

// this was my frist approach, a simple sorting after calculating the squares of each of the elemnts in the array, 
// however, I looked at other solutions and realized this is not the most efficient way of implementing and I'm
// currently working on improving this solution based on what I'm reading.
