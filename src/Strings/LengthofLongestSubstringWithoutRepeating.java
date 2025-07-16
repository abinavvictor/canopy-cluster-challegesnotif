package Strings;

import java.util.HashMap;

public class LengthofLongestSubstringWithoutRepeating {

    public int longestSubStringWithoutRepeating(String s){

        int maxLen =0;
        int start =0;

        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0; i < s.length(); i++){

            if(hm.containsKey(s.charAt(i))){
                start = Math.max(start, hm.get(s.charAt(i))+1);

            }
            hm.put(s.charAt(i), i);

            maxLen = Math.max(maxLen , i-start+1);
        }
        return maxLen;
    }
}
