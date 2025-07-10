package Arrays;

class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length ==0 || strs[0].length()==0 )
            return "";

        String base = strs[0];
        int min = base.length();
        for( String str : strs)
        {
            if(str.length() < min)
            {
                base = str;
                min = base.length();
            }
        }

        int i =0;
        while( i < min)
        {
            for(String str : strs){

                if(str.charAt(i) != base.charAt(i))
                    return base.substring(0,i);
            }
            i++;
        }
        return base;
    }
}