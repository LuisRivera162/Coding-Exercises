// You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water.

// Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water,
// and there is exactly one island (i.e., one or more connected land cells).

// The island doesn't have "lakes" (water inside that isn't connected to the water around the island). 
// One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. 
// Determine the perimeter of the island.

// https://leetcode.com/problems/island-perimeter/

class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    if(i == 0)
                        perimeter++;
                    if(j == 0)
                        perimeter++; 
                    if(i == grid.length-1)
                        perimeter++;
                    if(j == grid[0].length-1)
                        perimeter++;
                    
                    if(i+1 < grid.length && grid[i+1][j] == 0)
                        perimeter++;
                    if(i-1 >= 0 && grid[i-1][j] == 0)
                        perimeter++;
                    if(j+1 < grid[0].length && grid[i][j+1] == 0)
                        perimeter++;
                    if(j-1 >= 0 && grid[i][j-1] == 0)
                        perimeter++;
                   
                }
            }
        }
        return perimeter; 
    }
}

// After looking at some solutions I came to realize it's not very clean, there are too many if statements, will work on
// trying to make my code more cleaner. 
