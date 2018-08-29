package CTCI_CH1;

import java.util.HashMap;

public class CheckPermutation {

    //**This Exercise is from Cracking the coding Interview - Chapter 1**

    //Given two strings, write a method to decide if one is a permutation of the other.

    /**
     * This method will implement this algorith based on the number of repetitions each letter has
     * since in a palindrome each letter must be present the same amount of times. The first thing
     * that comes to mind while doing this exercise is to create a hash map and assign values depending
     * on the number of characters of the same key repeated, then compare the other string while lowering
     * down the values of the frequencies of the characters in the map and if they hit below zero that means
     * the character is repeated more than the other string.
     *
     *
     * The time complexity of this algorithm is O(n), where n is the number of characters on one of the strings.
     */

    public static boolean checkPermutation(String s1, String s2){

        if(s1.length() != s2.length())
            return false; //permutations must be of the same length

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s1.toCharArray()) {

            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c, 1);
        }

        for (char c : s2.toCharArray()) {

            if(!map.containsKey(c))
                return false;
            else{
                map.replace(c, map.get(c)-1);
                if(map.get(c) < 0)
                    return false;
            }

        }
        return true;
    }


    //test
    public static void main(String[] args) {
        System.out.println(checkPermutation("holaaa", "analoh")); //returns false
    }

}
