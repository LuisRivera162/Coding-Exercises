package HackerRank.HashTables;

import java.util.*;

public class TwoStrings {

    /**
     * https://gyazo.com/183748d2ce1458bce500f015c25f3019 <- for problem info
     */

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        HashSet<Character> set = new HashSet<>();

        for(char c : s1.toCharArray())
            set.add(c);

        for(char c : s2.toCharArray())
            if(set.contains(c))
                return "YES";

        return "NO";
    }
}
