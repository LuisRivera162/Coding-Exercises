// Given a string S of '(' and ')' parentheses, we add the minimum number of parentheses
// ( '(' or ')', and in any positions ) so that the resulting parentheses string is valid.

class Solution {
    public int minAddToMakeValid(String S) {
        
        Stack<Character> stack = new Stack<>(); 
        for(char c : S.toCharArray()){
            if(stack.isEmpty())
                stack.push(c);
            else{
                if(stack.peek() == '(' && c == ')')
                    stack.pop();
                else
                    stack.push(c); 
            }
        }
        
        return stack.size();
    }
}
