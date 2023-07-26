public class Richest_Customer_Wealth {
    public int maximumWealth(int[][] accounts) {
        int maxi = Integer.MIN_VALUE; // assume maxi to be the minimum value
        for(int  i = 0;i<accounts.length;i++){
            int sum = 0;
            for(int j = 0;j<accounts[i].length;j++){
                sum += accounts[i][j];
            }
            maxi = Math.max(maxi,sum);
        }
        return maxi;
    }
    
    
    
    
    
    
    
    
    
    
    // class Solution {
    //     public int maximumWealth(int[][] accounts) {
    //         int row = accounts.length;
    //         int col = accounts[0].length;
    //         int sum = 0;
    //         // int max = 0;
    //         int ans = 0;
    //         for(int i = 0;i<row;i++){
                
    //             for(int j = 0;j<col;j++){
    //             sum = sum + accounts[i][j];
    //             row--;
    //             }
    //         }
    //         ans = Math.max(sum,ans);
    
    //         return ans;
    //     }
    // }
}
