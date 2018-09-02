package CTCI_CH1;

import java.util.HashSet;

public class OneAway {

    /* One Away:

       There are three types of edits that can be performed on strings:
       Insert a character, remove a character or replace a character.
       Given two strings, write a function to check if they are one edit
       (or zero edits) away.
     */


    /**
     * First thing that comes to mind are the properties of the strings in case they were
     * potentially one away from being the same, for example, if the string length of one is
     * 2 more than the other it can't be one away, they must be 1 character off or have the
     * same length. In which case, I would add all the characters of the smallest string to a
     * Hash Set and once that's done I would iterate through the biggest string checking if
     * each character is contained in the Hash Set, if it is, remove it, if it's not
     * increment a counter denoting the number of characters that are different in each
     * string, if the counter surpasses 1, it means the string is not one away from being
     * the same. The time complexity of this algorithm is O(n), n being the number of
     * characters in one of the strings.
     *
     * @param s1 - Input String
     * @param s2 - Input String
     * @return true if the string is one character away from being the same of the other, false otherwise.
     */
    public static boolean oneAway(String s1, String s2){

        HashSet<Character> set = new HashSet<>();
        String smallestString, biggestString;
        int diffCharacters = 0;

        //if one string is bigger than the other by more than one, there are 2 different characters.
        if(Math.abs(s1.length()- s2.length()) > 1)
            return false;

        //find biggest and smallest string
        if (s1.length() > s2.length()){
            smallestString = s2;
            biggestString = s1;
        }

        else {
            smallestString = s1;
            biggestString = s2;
        }

        //add characters from smallest to the hash set
        for(char c : smallestString.toCharArray())
            set.add(c);


        //compare the smallest with the biggest one
        for(char c : biggestString.toCharArray()){
            if(set.contains(c))
                set.remove(c);

            else
                diffCharacters++;
        }

        //If the difference is more than one then it can't be one away
        if(diffCharacters > 1)
            return false;

        return true;
    }


    //testing
    public static void main(String args[]){
        System.out.println("Test case 1:");
        System.out.println("input: pale, ple");
        System.out.println("expected output: true");
        System.out.println("test output: " + oneAway("pale", "ple"));
        System.out.println();

        System.out.println("Test case 2:");
        System.out.println("input: pales, pale");
        System.out.println("expected output: true");
        System.out.println("test output: " + oneAway("pales", "pale"));
        System.out.println();


        System.out.println("Test case 3:");
        System.out.println("input: pale, bale");
        System.out.println("expected output: true");
        System.out.println("test output: " + oneAway("pale", "bale"));
        System.out.println();


        System.out.println("Test case 4:");
        System.out.println("input: pale, bake");
        System.out.println("expected output: false");
        System.out.println("test output: " + oneAway("pale", "bake"));
        System.out.println();
    }

}
