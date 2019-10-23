// https://leetcode.com/problems/unique-paths-ii/

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] myGrid = new int[obstacleGrid.length][obstacleGrid[0].length]; 
        // helper(obstacleGrid, myGrid, 0, 0);
        // return obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1]/2;
        for(int i = 0; i < myGrid.length; i++){
            if(!(obstacleGrid[i][0] == 1))
                myGrid[i][0] = 1;
            else 
                break;
        }
        
        for(int j = 0; j < myGrid[0].length; j++){
            if(!(obstacleGrid[0][j] == 1))
                myGrid[0][j] = 1;
            else 
                break;
        }
            
        
        for(int i = 1; i < myGrid.length; i++)
            for(int j = 1; j < myGrid[0].length; j++){
                if(!(obstacleGrid[i][j] == 1))
                    myGrid[i][j] = myGrid[i-1][j] + myGrid[i][j-1];
            }
        
        return myGrid[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
    
    public void helper(int[][] obstacleGrid, int x, int y){
        if(x >= obstacleGrid.length || y >= obstacleGrid[0].length || obstacleGrid[x][y] == 1)
            return;
        
        if(x == obstacleGrid.length-1 && y == obstacleGrid[0].length-1){
            obstacleGrid[x][y] += 2; 
            return;
        }
        
        if(x >= obstacleGrid.length || y >= obstacleGrid[0].length || obstacleGrid[x][y] == 1)
            return;
        
        helper(obstacleGrid, x+1, y);
        helper(obstacleGrid, x, y+1);
    }
    
    
}
