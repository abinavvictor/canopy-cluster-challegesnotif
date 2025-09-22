package Strings;

public class IsPalindrome {
    public boolean checkifPalindorme(String str){
        int length = str.length();
        for(int i=0; i< length/2 ; i++){ //markram  length =7, length/2

            if(str.charAt(i) != str.charAt(length-i-1));{
                return false;

            }

        }
        return true;
    }
}
