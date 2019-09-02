// Given two arrays, write a function to compute their intersection.

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>(); 
        for(int n : nums1)
            set.add(n);
        ArrayList<Integer> list = new ArrayList<>();
        for(int n : nums2)
            if(set.contains(n)){
                list.add(n);
                set.remove(n);
            }
                
        int[] result = new int[list.size()];
        int counter = 0;
        
        for(int n: list)
            result[counter++] = n;     
        return result;
    }
}
