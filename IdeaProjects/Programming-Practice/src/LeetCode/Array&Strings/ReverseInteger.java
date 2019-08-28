class Solution {
    public int reverse(int x) {
        String str = Integer.toString(x);
        StringBuilder builder = new StringBuilder(); 
        for(int i = str.length()-1; i >= 0; i--){
            char c = str.charAt(i); 
            if(!(builder.length() == 0 && c == '0'))
                if (c != '-')
                    builder.append(c);
        }
        
        int result = 0;
        if(builder.length() != 0){
            try{
                result = Math.toIntExact(Long.parseLong(builder.toString()));
            }catch(Exception numberFormatExcetion){
                return 0;
            }
            
        }
            
        if(str.charAt(0) == '-')
            result *= -1; 
        return result; 
    }
}

//O(n) time complexity and O(n) space complexity
