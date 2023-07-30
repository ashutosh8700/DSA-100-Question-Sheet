package String;

public class Valid_Anagram {
    class Solution {
        public boolean isAnagram(String a, String b) {
            boolean ans = true; // boolean ans
            // created two array
            // one for String one. 
            int al[] = new int[256]; 
            // one for string two
            // by default int value zero
    
            int bl[] = new int[256];
          
          // iterate over string a converted into character array
            for(char c:a.toCharArray()){ // for each loop toCharArray convert string into character  array 
            int index = (int) c; // converting c into ascii value 
            al[index]++; // increase index of alphabet from zero to one
            }
            // iterate over string a converted into character array
            // similar to the b string
            for(char c:b.toCharArray()){
                int index = (int) c;
                bl[index]++;
            }
            // comparing both the array
            for(int i = 0; i<256; i++){
                if(al[i] != bl[i]){
                    // if count of index of a and b are not equal store ans to false
                    ans = false;
                    break;
                }
            }
            return ans;
        }
    }
}
