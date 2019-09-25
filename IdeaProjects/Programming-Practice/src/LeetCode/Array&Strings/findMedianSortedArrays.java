// There are two sorted arrays nums1 and nums2 of size m and n respectively.

// Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

// You may assume nums1 and nums2 cannot be both empty.


// https://leetcode.com/problems/median-of-two-sorted-arrays/

class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        double sortedArr[] = fillArr(a, b);

        if(sortedArr.length % 2 == 1)
            return sortedArr[sortedArr.length/2];
        else {
            double sum = sortedArr[sortedArr.length/2]+sortedArr[(sortedArr.length-1)/2];
            System.out.println(sum);
            return sum/2; 
        }
    }
    
    
    public double[] fillArr(int[] a, int[] b){

        int indexA = 0, indexB = 0; 
        double result[] = new double[a.length + b.length]; 
        int counter = 0;

        while(indexA < a.length && indexB < b.length){
            if(a[indexA] < b[indexB])
                result[counter++] = a[indexA++]; 
            else
                result[counter++] = b[indexB++];
        }

        while(indexA < a.length)
            result[counter++] = a[indexA++];
        while(indexB < b.length)
            result[counter++] = b[indexB++];

        return result; 

    }
}

// Appears my solution is not very efficient, looking to improve the answer!
