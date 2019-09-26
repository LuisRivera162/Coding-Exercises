// https://leetcode.com/problems/minesweeper/

// Click link for info (too much text) 


class Solution {
    public char[][] updateBoard(char[][] board, int[] click) {
        if(board[click[0]][click[1]] == 'M'){
            board[click[0]][click[1]] = 'X'; 
            return board; 
        }
        
        updateBoard(board, click[0], click[1]);
        
        return board; 
    }
    
    public void updateBoard(char[][] board, int row, int column){
        if(row < 0 || row >= board.length)
            return;
        if(column < 0 || column >= board[0].length)
            return;
        
        if(board[row][column] == 'E'){
            int adjecentBombs = countMines(board, row, column); 
        
            if(adjecentBombs > 0){
                String adj = Integer.toString(adjecentBombs);
                char c = adj.charAt(0); 
                board[row][column] = c;
            }
                

            else{
                board[row][column] = 'B';
                updateBoard(board, row+1, column);
                updateBoard(board, row, column+1);
                updateBoard(board, row-1, column);
                updateBoard(board, row, column-1);
                updateBoard(board, row+1, column+1);
                updateBoard(board, row-1, column-1);
                updateBoard(board, row+1, column-1);
                updateBoard(board, row-1, column+1);
            }
        }
    }
    
    public int countMines(char[][] board, int row, int column){
        int counter = 0;
        if(row+1 < board.length && board[row+1][column] == 'M')
            counter++;
        if(row-1 >= 0 && board[row-1][column] == 'M')
            counter++;
        if(column+1 < board[0].length && board[row][column+1] == 'M')
            counter++;
        if(column-1 >= 0 && board[row][column-1] == 'M')
            counter++;
        if(row+1 < board.length && column-1 >= 0 && board[row+1][column-1] == 'M')
            counter++;
        if(row+1 < board.length && column+1 < board[0].length && board[row+1][column+1] == 'M')
            counter++;
        if(column+1 < board[0].length && row-1 >= 0 && board[row-1][column+1] == 'M')
            counter++;
        if(column-1 >= 0 && row-1 >= 0 && board[row-1][column-1] == 'M')
            counter++;
        return counter; 
    }
    
}
