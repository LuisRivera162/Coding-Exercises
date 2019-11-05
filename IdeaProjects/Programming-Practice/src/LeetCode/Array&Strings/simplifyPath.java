
// https://leetcode.com/problems/simplify-path/submissions/

class Solution {
    public String simplifyPath(String path) {
        
        String arr[] = path.split("/");
        
        Stack<String> stack = new Stack<>(); 
        
        for(String p : arr){
            
            if(p.equals(".."))
                if(!stack.isEmpty())
                    stack.pop(); 
            
            if (!p.equals(".") && !p.equals("") && !p.equals(".."))
                    stack.push("/" + p);
            
        }
        
        StringBuilder result = new StringBuilder();
        
        while(!stack.isEmpty())
            result.insert(0, stack.pop());
        
        if(result.length() == 0)
            return "/";
        
        return result.toString(); 
    }
}
