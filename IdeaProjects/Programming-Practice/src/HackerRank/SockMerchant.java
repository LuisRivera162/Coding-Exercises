package HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {

    /**
     *
     * John works at a clothing store. He has a large pile of socks that he must pair by color for sale.
     * Given an array of integers representing the color of each sock, determine how many pairs of socks
     * with matching colors there are.
     */

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        HashSet<Integer> set = new HashSet<>();
        int counter = 0;

        for(int e : ar){
            if(set.contains(e)){
                set.remove(e);
                counter++;
            }
            else
                set.add(e);
        }

        return counter;

    }
}
