package String;

import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating {
    class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left  = 0; // left Pointer
        int right = 0; // Right Pointer
        // creating a set
        Set <Character> seen = new HashSet(); // using Set as it avoid duplicate values
        int max = 0;

        while(right < s.length()){
            char c = s.charAt(right);
            if(seen.add(c)){ 
                max = Math.max(max,right-left+1); // adding character
                right++;
            }else{ // find the duplicate so remove it 
                while(s.charAt(left)!=c){
                    seen.remove(s.charAt(left));
                    left++;
                }
                seen.remove(c); 
                left++;
            }
        }
        return max;
    }
}
}
