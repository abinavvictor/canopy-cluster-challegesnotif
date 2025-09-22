package Strings;

import java.util.HashMap;
import java.util.Map;

public class WithoutRepeating {

    public int longestString(String s){

        int start=0;
        int maxLen =0;

        Map<Character,Integer> hm = new HashMap<>();
        for(int i=0; i< s.length() ; i++){
            if(hm.containsKey(s.charAt(i))){
                start = Math.max(start, hm.get(s.charAt(i)));
            }
            hm.put(s.charAt(i), i);
            maxLen= Math.max(maxLen, i-start+1);
        }

        return maxLen;
    }
}
