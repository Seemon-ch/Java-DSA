package arrayTwoD;

public class StaircaseSearch {
        public boolean searchMatrix(int[][] matrix, int target) {
            int row =0 ;
            int col = matrix[0].length-1;
            while(row <matrix.length && col >=0){
                if(target == matrix[row][col]){
                    return true;
                }
                else if (target > matrix[row][col]){
                    row++;
                }
                else{
                    col--;
                }
                
            }
            return false;
        }
        public static void main(String[] args) {
            int[][] martix ={
                    {1,4,7,11,15},
                    {2,5,8,12,19},
                    {3,6,9,16,22},
                    {10,13,14,17,24},
                    {18,21,23,26,30},
            };
            int target =5;
            StaircaseSearch obj = new StaircaseSearch();
            boolean result = obj.searchMatrix(martix, target);

            if(result){
                System.out.println("target found");
            }
            else{
                System.out.println("target not found");
            }

         }

}

