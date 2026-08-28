package arrayTwoD;

public class DiagonalSum{
    //Brute force approach
    public int diagonalSum(int matrix[][]){
        int sum=0;
        int n=matrix.length;
        for(int i =0 ;i<n ;i++){
            for(int j=0 ;j<n ;j++){
                if(i==j){
                    sum+=matrix[i][j];

                }
                else if(i+j== n-1){
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }

    //optimimze approach 
    public int diagonalSumOptimized(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length ;i++){
            sum+=matrix[i][i];
            if(i !=matrix.length-1-i){
                sum +=matrix[i][matrix.length-1-i];
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        int matrix[][] = {
                    {1,4,7,11,15},
                    {2,5,8,12,19},
                    {3,6,9,16,22},
                    {10,13,14,17,24},
                    {18,21,23,26,30},
            };
        DiagonalSum obj = new DiagonalSum();
        // int res =obj.diagonalSum(matrix);
        int result2 =obj.diagonalSumOptimized(matrix);
        System.out.println(result2);
    }
}