package CTCI_CH1;

public class URLify {

    /**Write a method to replace all spaces in a string with"%20" . You may assume
     * that the string has sufficient space at the end to hold the additional characters,
     * and that you are given the "true" length of the string. (perform this operation in place)
     */

    /**\
     * First thing that comes to mind for this problem is to swap to the right
     * all characters twice after finding a white space, since we expect our input
     * string to have 2 extra whitespaces at the end for each whitespace in the
     * string, we can just move all characters to the right after finding a whitespace
     * and replacing the index where we found the whitespace and the next two spaces
     * with "%20" as specified in the problem. The time complexity of this algorithm
     * is O(n^2) n being the number of characters in the string including the whitespace.
     *
     * @param str - input string
     *
     * @return - URLified string
     */

    public static String urlify(String str, int trueLenght){

        char[] charArr = str.toCharArray();
        for(int i = 0 ; i < trueLenght; i++){
            if(charArr[i] == ' '){
                swapRight(charArr, i);
                charArr[i] = '%';
                charArr[i+1] = '0';
                charArr[i+2] = '2';
            }
        }
        return String.valueOf(charArr);
    }

    /**
     * Helper method that helps us swap all the characters next to the index
     * to the right twice.
     *
     * @param charArr - input string as a character array
     * @param index - index where a whitespace lies
     */

    public static void swapRight(char[] charArr, int index){
        for(int j = 0; j < 2; j++) {
            for (int i = charArr.length - 1; i > index; i--) {
                char holder = charArr[i - 1];
                charArr[i] = holder;
            }
            index++;
        }
    }

    /**
     * Another and more efficient way of making this algorithm is to count the number of whitespaces
     * and once you know how many there are within the true length of the string you can denote how many
     * extra spaces we have thus keeping track of how many extras. This way, when you swap the last letter
     * you know where to place it (at the end of the string, where the last whitespace was being used).
     * The time complexity of this algorithm is O(n), where n is the number of characters in the string.
     *
     * @param s - input string as a character array
     * @param trueLength - index where a whitespace lies
     **/

    public static String urlify2(String s, int trueLength){
        int counter = 0;                                        //number of whitespaces
        char[] charArr = s.toCharArray();
        for(int i = 0; i < trueLength; i++){
            if(charArr[i] == ' '){
                counter++;
            }
        }

        int lastIndex = counter * 2 + trueLength;

        for(int i = trueLength -1; i > 0; i--){
            if(charArr[i] == ' '){
                charArr[lastIndex-1] = '0';
                charArr[lastIndex-2] = '2';
                charArr[lastIndex-3] = '%';
                lastIndex -= 3;
            }

            else{
                charArr[lastIndex-1] = charArr[i];
                lastIndex--;
            }
        }
        return String.valueOf(charArr);
    }

    //test
    public static void main(String args[]){
        System.out.print(urlify("Mr John Smith    ", 13)); //should return a filled string with no whitespace, in this case "Mr%20John%20Smith".
    }

}
