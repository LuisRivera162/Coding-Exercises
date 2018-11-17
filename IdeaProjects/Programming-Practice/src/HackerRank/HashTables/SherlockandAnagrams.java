package HackerRank.HashTables;


import java.util.*;

public class SherlockandAnagrams {

    /**
     * https://gyazo.com/c6d2db952e3b393b0df55a06a81eea6b <- for problem info
     */

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        int counter = 0;
        ArrayList<String> list = new ArrayList<>();
        char[] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i++){
            StringBuilder builder = new StringBuilder();
            builder.append(arr[i]);
            String str = builder.toString();
            list.add(str);

            for(int  j = i+1; j < arr.length; j++){
                builder.append(arr[j]);
                String str1 = builder.toString();
                list.add(str1);
            }
        }

        String[] strList = list.toArray(new String[list.size()]);
        for(int i = 0; i < strList.length-1; i++){
            for(int j = i+1; j < strList.length; j++){
                if(checkAnagram(strList[i], strList[j]))
                    counter++;
            }
        }

        return counter;
    }

    static boolean checkAnagram(String s1, String s2){
        if(s1.length() != s2.length())
            return false;

        HashMap<Character, Integer> set = new HashMap<>();

        for(char c : s1.toCharArray()){
            if(set.containsKey(c))
                set.replace(c, set.get(c)+1);
            else
                set.put(c, 1);
        }

        for(char c : s2.toCharArray()){
            if(!set.containsKey(c))
                return false;
            else{
                int frequency = set.get(c) - 1;
                if(frequency == 0)
                    set.remove(c);
                else
                    set.replace(c, frequency);
            }
        }
        return true;
    }
}
