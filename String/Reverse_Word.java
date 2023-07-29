package String;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse_Word {
    // Approach 1

    class Solution {
    public String reverseWords(String s) {
       //remove the extra space in the given string
       s = s.trim();
       //creating list which  contains only words using the split function
        // //s+ to split a string by spaces also include the multiple spaces
       List<String> stringList = Arrays.asList(s.split("\\s+"));
        // reverse a word in a list
        Collections.reverse(stringList);
        // return the result in a form of String
        return String.join(" ",stringList);
    }
}
// 2nd Approach

class Solution {
    public String reverseWords(String s) {
        int i=0,j=i;
        String ans="";
        while(i<s.length())
        {
            while(i<s.length()&&s.charAt(i)==' ')
              i++;  
            if(i>=s.length()) break;
            j=i+1;
             while(j<s.length()&&s.charAt(j)!=' ')
                  j++;
            String temp=s.substring(i,j);
            if(ans.length()==0)
                ans=temp;
            else
                ans=temp+" "+ans;
            i=j+1;
        }     
        return ans;
    }
}

}
