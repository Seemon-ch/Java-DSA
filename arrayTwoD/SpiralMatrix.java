package arrayTwoD;

public class SpiralMatrix {
    public static void spiralOrder(int[][] matrix) {

        int startrow = 0;
        int endrow = matrix.length - 1;
        int startcol = 0;
        int endcol = matrix[0].length - 1;

        while (startrow <= endrow && startcol <= endcol) {

            // Top row
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(matrix[startrow][j] + " ");
            }
            startrow++;

            // Right column
            for (int i = startrow; i <= endrow; i++) {
                System.out.print(matrix[i][endcol] + " ");
            }
            endcol--;

            // Bottom row
            if (startrow <= endrow) {
                for (int j = endcol; j >= startcol; j--) {
                    System.out.print(matrix[endrow][j] + " ");
                }
                endrow--;
            }

            // Left column
            if (startcol <= endcol) {
                for (int i = endrow; i >= startrow; i--) {
                    System.out.print(matrix[i][startcol] + " ");
                }
                startcol++;
            }
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
                    {1,4,7,11,15},
                    {2,5,8,12,19},
                    {3,6,9,16,22},
                    {10,13,14,17,24},
                    {18,21,23,26,30},
            };
        spiralOrder(matrix);
        
    }
}

