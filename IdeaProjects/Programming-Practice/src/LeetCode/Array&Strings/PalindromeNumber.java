// Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

class Solution {
    public boolean isPalindrome(int x) {
        return isPalindrome(Integer.toString(x)); 
    }
    
    public boolean isPalindrome(String str){
        int start = 0; int end = str.length()-1; 
        while(start < end){
            if(str.charAt(start) != str.charAt(end))
                return false; 
            start++; end--;
        }
        return true; 
    }
}

//Time complexity is O(n) where n is the number of digits in the integer (+1 if negative) 
//Space complexity is O(n) because I decided to store it in a String. 

//Will study to implement this in the O(log(n)) time / O(1) space solution
