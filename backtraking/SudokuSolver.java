public class SudokuSolver{
        public static boolean isSafe(char[][] board ,int row ,int  col , int digit){
        //row check
        char ch = (char)(digit + '0');
            for(int i=0 ; i<=8 ; i++){
                if(board[row][i]==ch ){
                    return false;
                }
            }
        //col check 
            for(int j=0 ; j<=8 ; j++){
                if(board[j][col]==ch ){
                    return false;
                }
            }
        //grid check
        int rowstart = (row/3)*3;
        int colstart = (col/3)*3;
        for(int i =rowstart ; i<rowstart+3 ;i++){
            for(int j=colstart ;j<colstart+3 ;j++){
                if(board[i][j]==ch){
                    return false;
                }
            }
        }


    return true;
    }
    public static boolean solveSudokuHelper(char[][] board ,int row , int col) {
        //base case
        if(row == board.length){
           return true;
        }
        
        int nextrow= row , nextcol=col+1;

        if(col==8){
            nextrow = row + 1;
            nextcol = 0;
        }
        
        if(board[row][col] != '.'){
            return solveSudokuHelper(board, nextrow , nextcol);
        }
        for(int digit=1 ; digit<=9;digit++){
            if(isSafe(board, row ,col ,digit)){
                board[row][col]=(char)(digit + '0');
                if(solveSudokuHelper(board , nextrow , nextcol)){
                    return true;
                }
            board[row][col]='.'; //backtrack
            }
        }
        return false;
    }
    public static void solveSudoku(char[][] board) {
    solveSudokuHelper(board, 0, 0);
    }
    public static void main(String args[]){
        char board[][] = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        solveSudoku(board);
        
    }
}
