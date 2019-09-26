// Your friend is typing his name into a keyboard.  Sometimes, 
// when typing a character c, the key might get long pressed, 
// and the character will be typed 1 or more times.

// You examine the typed characters of the keyboard.  Return True if it is
// possible that it was your friends name, with some characters (possibly none) being long pressed.

// https://leetcode.com/problems/long-pressed-name/

class Solution {
    public boolean isLongPressedName(String name, String typed) {
        char prev = name.charAt(0);
        int nameIndex = 0; 
        for(int i = 0; i < typed.length(); i++){
            if(name.charAt(nameIndex) == typed.charAt(i)){
                prev = name.charAt(nameIndex); 
                if(nameIndex + 1 < name.length())
                    nameIndex++; 
            }
            
            else
                if(prev != typed.charAt(i))
                    return false;
        }
        return name.charAt(name.length()-1) == typed.charAt(typed.length()-1); 
    }
}
