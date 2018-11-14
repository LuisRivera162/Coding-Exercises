package HackerRank;

public class RepeatedString {

    /**
     * Lilah has a string, s, of lowercase English letters that she repeated infinitely many times.
     *
     * Given an integer, n, find and print the number of letter a's in the first n letters of Lilah's infinite string.
     */

    static long repeatedString(String s, long n) {

        long remainder = (n % s.length());
        long result = 0;
        char[] charArr = s.toCharArray();

        for(char c : charArr)
            if(c == 'a')
                result++;

        result *= n/s.length();

        for(int i = 0; i < remainder; i++)
            if(charArr[i] == 'a')
                result++;

        return result;

    }
}
