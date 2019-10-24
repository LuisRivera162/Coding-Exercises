
// https://leetcode.com/problems/custom-sort-string/

class Solution {
    public String customSortString(String S, String T) {
        
        StringBuilder builder = new StringBuilder(); 
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>(); 
        
        for(char c : S.toCharArray())
            map.put(c, 0);
        
        for(char c : T.toCharArray()){
            if(map.containsKey(c))
                map.put(c, map.get(c)+1); 
            
            else
                builder.append(c);
        }
        
        StringBuilder result = new StringBuilder(); 
        
        for(char c : map.keySet())
            for(int i = 0; i < map.get(c); i++)
                result.append(c);
        
        result.append(builder);
        
        return result.toString(); 
    }
}

//Still need to work on a more efficient solution 
