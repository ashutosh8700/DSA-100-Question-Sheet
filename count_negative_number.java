public class count_negative_number {
    // brute force approach
    public int countNegatives(int[][] grid) {
        int m = grid.length; //rpw
        int n = grid[0].length; //coloumn
        int count = 0;
       for(int i = 0;i<m;i++){
         for(int j = 0;j<n;j++){
             if(grid[i][j] < 0){
                 count++;
             }
         }    
       }
       return count;
      
   }

   // OPTIMISED APPROACH
   class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int row  = m-1;
        int col = 0;

        int result = 0;

        while(row >= 0 && col < n){
            if(grid[row][col] >= 0){
                col++;
            }else{
                result += (n-col);
                row--;
            }
        }
       return result;
    }
}
}
