// Given a string S and a character C, return an array of integers representing 
// the shortest distance from the character C in the string.


class Solution {
    public int[] shortestToChar(String S, char C) {
        int result[] = new int[S.length()]; 
        int index = S.indexOf(C); 
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == C)
                index = i; 
            result[i] = Math.abs(index - i); 
        }
        for(int i = S.length()-1; i >= 0; i--){
            if(S.charAt(i) == C)
                index = i; 
            result[i] = Math.abs(Math.min(index - i, result[i])); 
        }
        return result; 
    }
}
