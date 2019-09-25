// Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.

// You can use each character in text at most once. Return the maximum number of instances that can be formed.

// https://leetcode.com/problems/maximum-number-of-balloons/


class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>(); 
        
        String balloon = "balon"; 
        
        for(char c: balloon.toCharArray())
            map.put(c, 0); 
        
        for(char c: text.toCharArray()){
            char ch = Character.toLowerCase(c);
            if(map.containsKey(ch))
                map.put(ch, map.get(ch)+1);
        }
        
        
        int min = Integer.MAX_VALUE;
        map.replace('l', map.get('l'), map.get('l')/2); 
        map.replace('o', map.get('o'), map.get('o')/2); 
        for(int v : map.values()){
            if(min > v)
                min = v; 
        }
            
        
        return min; 
    }
}
