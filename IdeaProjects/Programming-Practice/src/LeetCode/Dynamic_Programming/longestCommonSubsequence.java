// https://leetcode.com/problems/longest-common-subsequence/submissions/

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length(), m = text2.length(); 
        //HashMap<String, Integer> map = new HashMap<>(); 
        //return Integer.valueOf(helper(text1, text2, n, m, map)); 
        return bottom_up(text1, text2, n, m); 
        
    }
    
    public Integer helper(String text1, String text2, int n, int m, HashMap<String, Integer> map){
        if(n == 0 || m == 0)
            return 0; 
        
        String key = n + "|" + m; 
        
        if(map.containsKey(key))
            return map.get(key); 
        
        else if(text1.charAt(n-1) == text2.charAt(m-1))
            map.put(key, helper(text1, text2, n-1, m-1, map) + 1);
            
             
        
        else
            map.put(key, Math.max(helper(text1, text2, n, m-1, map), 
                           helper(text1, text2, n-1, m, map)));
            
        return map.get(key);
        
    }
    
    public int bottom_up(String s1, String s2, int n, int m){
        int[][] arr = new int[n+1][m+1]; 
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1))
                    arr[i][j] = arr[i-1][j-1] + 1;
                else
                    arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]); 
            }
        }
        
        return arr[n][m]; 
    }
    
}


// In this problem I learned how to approach this kind of problem in the sense that common substrings can be made into sub problems by 
// not considering its last character and returning what the result from the smaller strings plus one because of the matching strings in
// this case, do note, this is the case if both characters at the end match, otherwise, we would return the max result from the 
// recursive call onto,either string1 length -1 and keep string2 the same... or string2-1 in length with s1 keeping the same length. 

// I also got to learned that instead of a proper entry we could have a string representing multiple values by being concatenated, maybe
// not the most optimal but could prove to be handy at times, found that implementation really interesting and curious. 

// Also learned more about bottom up approach to similar problems, hopefully get to implement similar bottom up approaches in the 
// future. 
