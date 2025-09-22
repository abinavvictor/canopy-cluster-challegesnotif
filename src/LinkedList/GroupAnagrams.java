package LinkedList;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class GroupAnagrams {

    public List<List<String>> groupAnagram(String [] strs){

        List<List<String >> result = new LinkedList<>();

        if(strs.length < 1 || strs== null )
            return result;

        Map<String , List<String>> map = new HashMap<>();
        for(String n : strs){

            char[] tr = n.toCharArray();
            Arrays.sort(tr);

            String blr = new String(tr);

            List<String> newList = map.get(blr);

            if(newList == null)
                newList = new LinkedList<>();

            newList.add(n);
            map.put(blr, newList);


            for(Map.Entry<String, List<String>> e: map.entrySet()){

                result.add(e.getValue());
            }


        }

        return result;


    }
}
