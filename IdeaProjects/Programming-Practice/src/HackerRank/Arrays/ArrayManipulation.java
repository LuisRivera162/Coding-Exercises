package HackerRank.Arrays;

public class ArrayManipulation {

    /**
     *  https://gyazo.com/19656e774a78cd5cc4bfda82435d9c95 <- for problem info
     */

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        long result = 0, sum = 0;
        long[] arr = new long[n];
        for(int i = 0; i < queries.length; i++){
            int firstIndex = queries[i][0] - 1;
            int lastIndex = queries[i][1] - 1;
            long numberToAdd = queries[i][2];
            arr[firstIndex] += numberToAdd;
            if (lastIndex+1 < n)
                arr[lastIndex+1] -= numberToAdd;
        }

        for(long l : arr){
            sum += l;
            if(sum > result)
                result = sum;
        }

        return result;
    }


}
