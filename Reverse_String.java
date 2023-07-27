public class Reverse_String {
    class Solution {
        public void reverseString(char[] s) {
           int left = 0;
           int right = s.length-1;
    
           while(left < right){
            //    swap(s[left],s[right]);
             char temp = s[left];
             s[left] = s[right];
             s[right] = temp;
               left++;
               right--;
           } 
    
           
        }
    }
}
