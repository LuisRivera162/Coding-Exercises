// Evaluate the value of an arithmetic expression in Reverse Polish Notation.

// Valid operators are +, -, *, /. Each operand may be an integer or another expression.

// https://leetcode.com/problems/evaluate-reverse-polish-notation/

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>(); 
        for(String n : tokens)
            stack.push(n);
        
        return helper(stack); 
        
    }
    
    public int helper(Stack<String> stack){
        if(stack.isEmpty())
            return 0;
        
        String s = stack.pop(); 
        
        if(Character.isDigit(s.charAt(0)) || s.length() > 1)
            return Integer.valueOf(s);
        
        else{
            switch(s.charAt(0)){
                    
                case '*':  
                    return helper(stack) * helper(stack); 
                    
                case '+':
                    return helper(stack) + helper(stack); 
                    
                case '-':
                    int a = helper(stack);
                    int b = helper(stack);
                    return b - a; 
                    
                case '/':
                    a = helper(stack);
                    b = helper(stack);
                    return b / a; 
            }
        }
        
        return 0;
        
    }
    
}
