package HackerRank;

public class JumpingOnTheClouds {

    /**
     * Emma is playing a new mobile game that starts with consecutively numbered clouds. Some of the clouds are
     * thunderheads and others are cumulus. She can jump on any cumulus cloud having a number that is equal to
     * the number of the current cloud plus 1 or 2. She must avoid the thunderheads. Determine the minimum number
     * of jumps it will take Emma to jump from her starting postion to the last cloud. It is always possible to
     * win the game.
     */

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int counter = 0;

        for(int i = 0; i < c.length-1;){

            if(((i+2) < c.length) && (c[i+1] == 0 && c[i+2] == 0) || c[i+1] == 1)
                i += 2;

            else
            if (c[i+1] == 0)
                i++;

            counter++;
        }
        return counter;
    }
}
