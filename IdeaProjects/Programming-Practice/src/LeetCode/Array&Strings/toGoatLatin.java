
// https://leetcode.com/problems/goat-latin/

class Solution {
    public String toGoatLatin(String S) {
        StringBuilder lastWord = new StringBuilder("a");
        StringBuilder result = new StringBuilder(); 
        String consonants = "aeiou"; 
        String[] words = S.split(" "); 
        int count = 0;
        
        for(String word : words){
            if(consonants.indexOf(Character.toLowerCase(word.charAt(0))) != -1)
                result.append(word);
                
            else{
                for(int i = 1; i < word.length(); i++)
                    result.append(word.charAt(i));
                result.append(word.charAt(0));
            }
            
            result.append("ma");
            result.append(lastWord);
            lastWord.append("a"); 
            
            if(count != words.length-1)
                result.append(" ");
            
            count++;
        }
        
        return result.toString();
    }
}
