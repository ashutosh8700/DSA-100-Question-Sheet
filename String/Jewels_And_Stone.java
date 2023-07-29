package String;
public class Jewels_And_Stone {
    class Solution {
        public int numJewelsInStones(String jewels, String stones) {
            int count = 0;
            for(int i = 0;i<jewels.length();i++){
                char character = jewels.charAt(i);
                for(int j = 0; j<stones.length(); j++){
                    if(character == stones.charAt(j)){
                        count++;
                    }
                }
            }
            return count;
        }
    }
}
