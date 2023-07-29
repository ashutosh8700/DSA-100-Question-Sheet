package String;
public class First_Unique_Character {
    class Solution {
        public int firstUniqChar(String s) {
    
            int index = -1;
            int len = s.length();
            int i = 0;
    
            while(i < len){
                char c = s.charAt(i);
                int firstIndex = s.indexOf(c);
                int lastIndex = s.lastIndexOf(c);
                if(firstIndex == lastIndex){
                    index = i;
                    break;
    
                }
                i++;
            }
            return index;
            
        }
    }

    // 2nd Approach
//     class Solution {
//         public int firstUniqChar(String s) {
//            // Stores lowest index / first index
//            int ans = Integer.MAX_VALUE;
//            // Iterate from a to z which is 26 which makes it constant
//            for(char c='a'; c<='z';c++){
//                // indexOf will return first index of alphabet and lastIndexOf will return last index
//                // if both are equal then it has occured only once.
//                // through this we will get all index's which are occured once
//                // but our answer is lowest index
//                int index = s.indexOf(c);
//                if(index!=-1&&index==s.lastIndexOf(c)){
//                    ans = Math.min(ans,index);
//                }
//            }
   
//            // If ans remain's Integer.MAX_VALUE then their is no unique character
//            return ans==Integer.MAX_VALUE?-1:ans;
//        }   
//    }
}
