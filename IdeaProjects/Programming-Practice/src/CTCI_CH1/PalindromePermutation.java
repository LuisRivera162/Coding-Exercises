package CTCI_CH1;

import java.util.HashSet;
import java.util.Hashtable;

public class PalindromePermutation {

    /*
    Palindrome Permutation:

    Given a String, write a function to check if it is a permutation of a palindrome.
    A palindrome is a word or phrase that is the same forwards and backwards. A permutation
    is a rearrangement of letters. The palindrome does not need to be limited to just dictionary
    words.
    */

    /**
     * Assuming whitespace will not be accounted for, the property of a palindrome permutation is that
     * each character must be repeated at least once assuming there's an even number of letters
     * in the given string, otherwise we could accept only one character that is not repeated in
     * which case it would be the middle character. I order to do this algorithm the first thing that
     * comes to mind is that we need to keep track of the frequencies of characters within the string,
     * so, in order to keep this algorithm as efficient as I possibly can think of, I'm going to add
     * all characters to a hash set, and when a character in the string is not in the hash table it
     * will be added, otherwise it will be deleted from the hash set. This way at the end the characters
     * that are in the hash set denote the uneven number of characters that were in the string. Finally
     * if the string has an even number of characters the hash set should be empty at the end otherwise
     * the size of it should be 1.
     *
     * @param s - input string
     * @return true if it's a palindrome permutation, false otherwise.
     */

    public static boolean palindromePermutation(String s){

        HashSet<Character> set = new HashSet<>();
        s = s.replaceAll("\\s","").toLowerCase(); //remove whitespace and set all characters
                                                                    //to lowercase since we assume the problem
                                                                    //is not caps sensitive

        for(char c : s.toCharArray()){
            if(set.contains(c))
                set.remove(c);
            else
                set.add(c);
        }

        if(s.length() % 2 == 0 && set.size() == 0)
            return true;

        if(s.length() % 2 == 1 && set.size() == 1)
            return true;

        return false;
    }

    public static void main(String args[]){
        System.out.print(palindromePermutation("tactc oa"));
    }
}
