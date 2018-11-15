package HackerRank;

public class Hourglass2DArray {

    /**
     * https://gyazo.com/f4f926f613a367d26291cee00488c002
     */

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 1; i < arr.length-1; i++){
            for(int j = 1; j < arr.length-1; j++){
                int sum = sumHourGlass(arr, i, j);
                if(max < sum)
                    max = sum;
            }
        }
        return max;
    }

    static int sumHourGlass(int[][] arr, int  i, int j){
        return arr[i][j] + arr[i+1][j] + arr[i+1][j-1] + arr[i+1][j+1] +
                arr[i-1][j] + arr[i-1][j-1] + arr[i-1][j+1];
    }
}
