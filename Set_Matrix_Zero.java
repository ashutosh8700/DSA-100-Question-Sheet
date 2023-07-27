import java.util.HashSet;
import java.util.Set;

public class Set_Matrix_Zero {
    // First Approach
    class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length; // row
        int n = matrix[0].length; // coloumn

        Set<Integer> row = new HashSet(); // created row as a set
        Set<Integer> col = new HashSet(); // created col as a set

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(matrix[i][j] == 0){
                    row.add(i); // add row into set row where zero is found
                    col.add(j); // add coloumn into set col where zero is found
                }
            }
        }
        
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(row.contains(i) || col.contains(j)){ // checking row and coloumn 
                    matrix[i][j] = 0; // making it zero
                }
            }
        }

    }

    
}







}
