// Given a List of words, return the words that can be typed using letters of alphabet on only 
// one row's of American keyboard like the image below.

// https://leetcode.com/problems/keyboard-row/

class Solution {
    public String[] findWords(String[] words) {
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        HashSet<Character> set[] = new HashSet[3];
        ArrayList<String> list = new ArrayList<>(); 
        
        //add all rows to their respective hash sets
        for(int i = 0; i < rows.length; i++){
            set[i] = new HashSet<Character>(); 
            for(int j = 0; j < rows[i].length(); j++)
                set[i].add(rows[i].charAt(j)); 
        }
        
        //iterate through words
        for(int i = 0; i < words.length; i++){
            int rowNumber = identifyRow(words[i], rows);
            boolean flag = true;
            for(int j = 0; j < words[i].length(); j++)
                if(!set[rowNumber].contains(Character.toLowerCase(words[i].charAt(j)))){
                    flag = false;
                    break;
                }
            
            if(flag)
                list.add(words[i]);   
            
        }
        
        //pass to result array (since I need to return an array not a list)
        String result[] = new String[list.size()];
        int counter = 0;
        for(String s : list)
            result[counter++] = s;
        
        return result;
        
    }
    
    public int identifyRow(String s, String[] rows){
        char c = Character.toLowerCase(s.charAt(0));
        for(int i = 0; i < 3; i++)
            if(rows[i].indexOf(c) != -1)
                return i;
        return -1; 
    }
    
}
