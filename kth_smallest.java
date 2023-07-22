import java.util.Arrays;

public class kth_smallest {
    static class Solution{
    public static int k_smallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        Arrays.sort(arr);
        // int n = arr.length;
        int result =  arr[k-1];
        
        return result;
    } 
}

}
