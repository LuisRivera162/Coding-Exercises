package CTCI_CH1;

public class RortateMatrix {

    public static void rotateMatrix(int[][] arr){
        int nextX = 0, nextY = 0;
        int temp = arr[nextY][Math.abs(nextX - (arr.length - 1))];
        int curr = arr[nextX][nextY];
        int start = 0, end = arr.length;

        for (int z = 0; z < arr.length/2; z++){
            for(int i = start; i < end-1; i++){
                for(int j = 0; j < 4; j++) {
                    arr[nextY][Math.abs(nextX - (arr.length - 1))] = curr;
                    curr = temp;
                    int temporarySwitch = nextX;
                    nextX = nextY;
                    nextY = Math.abs(temporarySwitch - (arr.length - 1));
                    temp = arr[nextY][Math.abs(nextX - (arr.length - 1))];
                }

                nextY++;
                if (i != end-1){
                    curr = arr[nextX][nextY];
                    temp = arr[nextY][Math.abs(nextX - (arr.length-1))];
                }
            }

            start++;
            end--;
            nextX = z+1;
            nextY = z+1;
            curr = arr[nextX][nextY];
            temp = arr[nextY][Math.abs(nextX - (arr.length-1))];
        }

    }

    public static void main(String args[]){

        int arr[][] = {
                {1, 2, 3, 4, 5, 6, 7 ,8},
                {1, 2, 3, 4, 5, 6, 7 ,8},
                {1, 2, 3, 4, 5, 6, 7 ,8},
                {1, 2, 3, 4, 5, 6, 7 ,8},
                {1, 2, 3, 4, 5, 6, 7 ,8},
                {1, 2, 3, 4, 5, 6, 7 ,8},
                {1, 2, 3, 4, 5, 6, 7 ,8},
                {1, 2, 3, 4, 5, 6, 7 ,8}
        };

        rotateMatrix(arr);

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                System.out.print(" " + arr[i][j] );
            }
            System.out.println();
        }
    }


}
