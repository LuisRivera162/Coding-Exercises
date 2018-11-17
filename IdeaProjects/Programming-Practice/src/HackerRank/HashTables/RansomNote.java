package HackerRank.HashTables;

import java.util.*;

public class RansomNote {

    /**
     * https://gyazo.com/7973539407709594185527595497e8c5 <- for problem info
     */

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        HashMap<String, Integer> set = new HashMap<>();

        for(String s : magazine){
            if(set.containsKey(s))
                set.put(s, set.get(s)+1);
            else
                set.put(s, 1);
        }

        for(String s : note){
            if(!set.containsKey(s)){
                System.out.println("No");
                return;
            }

            else{
                int frequency = set.get(s)-1;
                if(frequency == 0)
                    set.remove(s);
                else
                    set.replace(s, frequency);
            }
        }
        System.out.println("Yes");
    }

}
