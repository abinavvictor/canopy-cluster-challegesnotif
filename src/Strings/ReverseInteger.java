package Strings;

public class ReverseInteger {

    public int reverse(int x){
        int finalNum =0;

        while (x != 0) {

         int   lastDigit =  x %10;
         finalNum += lastDigit;
         finalNum = finalNum * 10;
         x=x/10;

        }

        finalNum = finalNum/10;


        if(finalNum > Integer.MAX_VALUE || finalNum < Integer.MIN_VALUE){

            return 0;

        }

        if (x < 0) {

            return (int)(-1 * finalNum);
        }

        return finalNum;
    }
}
