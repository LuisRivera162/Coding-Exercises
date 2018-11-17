package HackerRank;

public class LeftRotation {

    /**
     * https://gyazo.com/b830bf892d2bddef480b1e172feb4ee9
     */

// Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int counter = 0;
        int[] arr = new int[a.length];

        for(int i = d; i < a.length; i++)
            arr[counter++] = a[i];

        for(int i = 0; i < d; i++)
            arr[counter++] = a[i];

        return arr;
    }
}
