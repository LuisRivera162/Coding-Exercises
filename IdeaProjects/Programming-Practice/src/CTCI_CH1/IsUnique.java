package CTCI_CH1;

import java.util.Arrays;
import java.util.HashSet;

public class IsUnique {

    //**This exercise is from cracking the code interview - Chapter 1**

    //Implement an algorithm to determine if a string has all unique characters.

    /**
     *
     * This algorithm is based on the fact that you can used additional data structures.
     * In this case I decided to use the hash set data structure in order to store characters that are
     * unique in the set and since data structures that use hashing can access it's element in O(1) time
     * the complexity of this algorithm is O(n) where n is the number of characters in the string.
     *
     * @param str input string
     * @return true if it's a unique string, false otherwise.
     */

    public static boolean isUnique(String str) {

        HashSet<Character> set = new HashSet<>();

        for(char c : str.toCharArray()) {
            if(!set.contains(c))
                set.add(c);
            else
                return false;
        }
        return true;
    }

    //What if you cannot use additional data structures?
    //First thing that comes to mind when I can't use data structures is to sort the characters in the string
    //that way if the next letter is the same that means the string is not unique. And the time complexity is
    //O(nlog(n)n) n being the number of characters in the string.

    public static boolean isUnique2(String str) {
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);

        for(int i = 0; i < charArr.length-1; i++){
            if(charArr[i] == charArr[i+1])
                return false;
        }

        return true;
    }

    //Brute Force:
    //Check every character in the string with each other character from the string.

    public static boolean isUnique3(String str){
        for(int i = 0; i < str.toCharArray().length-1; i++){
            for(int j = i; j < str.toCharArray().length-1; j++){
                if(str.toCharArray()[i] == str.toCharArray()[j+1])
                    return false;
            }
        }
        return true;
    }

    //Test
    public static void main(String[] args) {
        System.out.println(isUnique3("h000ola")); //returns false
    }

}

