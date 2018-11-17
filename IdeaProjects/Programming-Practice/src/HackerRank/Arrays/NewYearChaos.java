package HackerRank;

public class NewYearChaos {

    /**
     * https://gyazo.com/c6bf274873cf0762b747bd56192bb368 <- for problem info
     */

    static void minimumBribes(int[] q) {
        int counter = 0;

        for(int i = q.length-1; i >= 0; i--){
            if((q[i]-1)-i > 2){
                System.out.println("Too chaotic");
                return;
            }
            else
                for(int j = Math.max(0 , q[i] - 2); j < i; j++)
                    if(q[i] < q[j])
                        counter++;
        }
        System.out.println(counter);
    }

}
