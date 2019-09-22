// Find the minimum length word from a given dictionary words, which has all the letters from 
// the string licensePlate. Such a word is said to complete the given string licensePlate.

//Here, for letters we ignore case. For example, "P" on the licensePlate still matches "p" on the word.

// It is guaranteed an answer exists. If there are multiple answers, return the one that occurs first in the array.

// The license plate might have the same letter occurring multiple times. For example, given a licensePlate of "PP", 
// the word "pair" does not complete the licensePlate, but the word "supper" does.

// https://leetcode.com/problems/shortest-completing-word/

class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        String result = "";
        
        for(char c : licensePlate.toCharArray())
            if(Character.isLetter(c))
                map.put(Character.toLowerCase(c), map.getOrDefault(Character.toLowerCase(c), 0)+1);
        System.out.println(map.size()); 
        
        for(String s: words){
            HashMap<Character, Integer> copy = new HashMap<>(map);
            for(int i = 0; i < s.length(); i++){
                char c = Character.toLowerCase(s.charAt(i)); 
                if(copy.containsKey(c)){
                    copy.replace(c, copy.get(c)-1);
                    
                    if(copy.get(c) == 0)
                        copy.remove(c);
                }
                if(copy.size() == 0){
                    if(result.length() > s.length() || result.equals(""))
                        result = s;
                }
            }
        }
        return result; 
    }
}

//Very inefficient, will work on improving solution.
