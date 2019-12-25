
// https://leetcode.com/problems/decode-string/

class Solution {
    
    public String decodeString(String s) {
        Stack<Integer> intStack = new Stack<>(); 
        Stack<StringBuilder> stringStack = new Stack<>(); 
        stringStack.push(new StringBuilder()); 
        String iter = "";
        
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i)))
                iter += s.charAt(i);
            
            else if(Character.isLetter(s.charAt(i)))
                stringStack.peek().append(s.charAt(i));
            
            else if(s.charAt(i) == '['){
                intStack.push(Integer.parseInt(iter));
                stringStack.push(new StringBuilder()); 
                iter = "";
            }
            
            else if(s.charAt(i) == ']'){
                int iterations = intStack.pop(); 
                String temp = stringStack.pop().toString(); 
                
                for(int j = 0; j < iterations; j++)
                    stringStack.peek().append(temp); 
            }
            
        }
        
        return stringStack.pop().toString();
    }
    
}

//idea inspired by https://leetcode.com/problems/decode-string/discuss/460150/Java-solution-beats-67-in-performance-100-in-memory
