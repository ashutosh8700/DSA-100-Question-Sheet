public class Transpose_matrix {
    class Solution {
        public int[][] transpose(int[][] matrix) {
            int m = matrix.length; //row
            int n = matrix[0].length; //coloumn
            // transpose matrix n*m
            int[][] ans = new int[n][m];
    
            for(int i = 0;i<n;i++){
                for(int j = 0;j<m;j++){
                    ans[i][j] = matrix[j][i];
                }
            }
            return ans;
    
        }
        // Same Way
        
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = i; j < matrix[0].length; j++) {
        //         int temp = 0;
        //         temp = matrix[i][j];
        //         matrix[i][j] = matrix[j][i];
        //         matrix[j][i] = temp;
        //     }
        // }
    }
}
