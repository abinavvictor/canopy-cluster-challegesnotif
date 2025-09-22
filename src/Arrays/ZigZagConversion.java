package Arrays;

public class ZigZagConversion {

         public String zigzagConvert(String s, int numRows){

             if(numRows ==1) return s;

             StringBuilder [] rows = new StringBuilder[numRows];

             for(int k =0; k < rows.length; k++){

                 rows[k]= new StringBuilder("");
             }

             int rowIndex=1;
             boolean down =  false;

             for(int i=0; i < s.length(); i++){

                 if(i % (numRows-1) == 0 ){
                     down = !down;
                 }

                 rows[rowIndex] = rows[rowIndex].append(s.charAt(i));
                 rowIndex = down ? rowIndex+1 : rowIndex-1;

             }

             StringBuilder result = new StringBuilder();

             for(int f=0; f <= numRows; f++ ){

                 result.append(rows[f]);
             }
             return result.toString();
         }
}
