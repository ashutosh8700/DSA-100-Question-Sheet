public class Length_of_lastword {
    // First Approach
    class Solution {
        public int lengthOfLastWord(String s) {
            String[] words = s.split(" "); // splitting words on the basis of space into array
            return words[words.length - 1].length(); // in word array word.length - 1 last index and .length return length
        }
    }

    // Second Approach
    // from last index move backword and count the first space
    class Solution {
        public int lengthOfLastWord(String s) {
            boolean vis=false;
            int ans=0;
            for(int i=s.length()-1; i>=0; i--){
                if(s.charAt(i)==' '){
                    if(vis){
                        break;
                    }
                }
                else{
                    vis=true;
                    ans++;
                }
            }
            return ans;
        }
    }

}
