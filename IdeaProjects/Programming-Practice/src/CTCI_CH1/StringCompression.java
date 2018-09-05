package CTCI_CH1;

public class StringCompression {

    /**
     * String Compression:
     *
     * Implement a method to perform basic string compression using the counts
     * of repeated characters. For example, the string aabcccccaaa would become
     * a2b1c5a3. If the "compressed" string would not become smaller that the
     * original string, your method should return the original string. You can assume
     * the string only has upper and lower-case letters.
     */

    /**
     * The first thing that comes to mind is to keep track of the current character and
     * a counter denoting the number of frequency of that character, while iterating the string,
     * comparing the current character with the next one, if they're the same simply add 1 to the
     * counter, if they're not the same add the current character and frequency to a string builder
     * and change the current character to the different one and restart the frequency. The problem
     * with this is actually getting to the end, therefore, at the end of the loop, check the last index
     * and if the last index is equal to the length of the string minus one, it means there was a
     * character left behind which will be added to the string builder. Finally, return the String builder
     * object as a string.
     *
     * @param str - input string
     * @return Compressed string
     */
    public static String stringCompression(String str){
        int i, frequency = 1;
        char currCharacter = str.charAt(0);
        StringBuilder builder = new StringBuilder();

        for (i = 0; i < str.length()-1; i++){
            if(currCharacter == str.charAt(i+1)){
                frequency++;
            }
            else{
                builder.append(currCharacter);
                builder.append(frequency);
                currCharacter = str.charAt(i+1);
                frequency = 1;

                if(i == str.length()-2){
                    builder.append(currCharacter);
                    builder.append(frequency);
                }

            }
        }

        if(frequency > 1){
            builder.append(currCharacter);
            builder.append(frequency);
        }

        return builder.toString();
    }

    //test
    public static void main(String args[]){
        System.out.println("Test case 1:");
        System.out.println("input: aaabcccccaaas");
        System.out.println("expected output: a3b1c5a3s1");
        System.out.println("test output: " + stringCompression("aaabcccccaaas"));
        System.out.println();
    }
}
