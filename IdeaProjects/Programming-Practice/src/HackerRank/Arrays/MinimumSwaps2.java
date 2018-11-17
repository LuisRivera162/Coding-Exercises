package HackerRank;

public class MinimumSwaps2 {

    /**
     * https://gyazo.com/63452ba19e52ae8486a49acf2754c2ef <- for problem info
     */

    static int minimumSwaps(int[] arr) {
        int counter = 0;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] != i+1)
                for(int j = i+1; j < arr.length; j++){
                    if(arr[j] == i+1){
                        counter++;
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        break;
                    }
                }
        }
        return counter;
    }

}
