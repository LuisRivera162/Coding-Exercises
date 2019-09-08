// Given a non-empty array of integers, return the third maximum number in this array. 
// If it does not exist, return the maximum number. The time complexity must be in O(n).

class Solution {
    public int thirdMax(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums)
            set.add(i);
        
        if(set.size() < 3)
            return findMax(set);
        
        Comparator<Integer> comparator = new Comparator<Integer>(){
            public int compare(Integer n1, Integer n2){
                if(n2 == n1) return 0; 
                if(n2 > n1) return 1; 
                else return -1;
            }
        };
        
        PriorityQueue<Integer> q = new PriorityQueue<>(comparator); 
        for(int i : set)
            q.add(Integer.valueOf(i));
        
        for(int i = 0; i < 2; i++)
            q.poll(); 
        
        return q.poll();
    }
    
    public int findMax(HashSet<Integer> nums){
        int max = Integer.MIN_VALUE;
        for(int n : nums)
            if(n > max) max = n; 
        return max;
    }
    
}

// A bit brute force algorithm, will work on improving it... Originally I wanted to do it with 3 variables holding 
// each of the maximum values, however, that did not seem really realistic so I decided to add a priority queue, this way,
// it can be done to find the nth maximum number instead of just the 3rd maximum by just changing the number of values you 
// poll from the queue.  
