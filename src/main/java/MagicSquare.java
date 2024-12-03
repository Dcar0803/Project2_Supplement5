
public class MagicSquare {
	
	/**
	 * Checks whether a given 2D square matrix is a magic square.
	 *
	 * A magic square is defined as a matrix where:
	 * - All rows sum to the same value.
	 * - All columns sum to the same value.
	 * - Both main diagonals sum to the same value.
	 *
	 * @param matrix a 2D integer array representing the square matrix.
	 *               The matrix must be square (n x n) and non-null.
	 * @return true if the matrix is a magic square, else false.
	 *
	 * Edge Cases:
	 * - Returns false if the matrix is null, empty, or not square.
	 */
	
	
	public static boolean isMagicSquare(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix.length != matrix[0].length) {
            return false;
        }//end of if statement

        int n = matrix.length;
        int targetSum = 0;

        for (int i = 0; i < n; i++) {
            targetSum += matrix[0][i];
            
        }//end of for loop

        for (int i = 0; i < n; i++) {
        	
            int rowSum = 0, colSum = 0;
            
            for (int j = 0; j < n; j++) {
            	
            	
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
                
            }//end of for loop
            
            
            if (rowSum != targetSum || colSum != targetSum) {
                return false;
            }//end of if statement 
        }//end of outer for loop

        int diagSum1 = 0, diagSum2 = 0;
        
        for (int i = 0; i < n; i++) {
        	
        	
            diagSum1 += matrix[i][i];
            diagSum2 += matrix[i][n - i - 1];
        }//end of for loop

        return diagSum1 == targetSum && diagSum2 == targetSum;
    }//end of isMagicSquare
	

}//end of class 
