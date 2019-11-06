
// https://leetcode.com/problems/gas-station/submissions/

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int length = gas.length; 
        
        for(int i = 0; i < length; i++){
            boolean passed = false;
            int currentGas = gas[i]; 
            for(int j = i; j < length+i; j++){
                
                if(currentGas < cost[j % length])
                    break; 
                
                currentGas += gas[(j+1) % length] - cost[j % length]; 
                
                if(j+1 == length + i && currentGas >= 0)
                    passed = true;
                    
            }
            if(passed)
                return i; 
        }
        return -1;
    }
}
