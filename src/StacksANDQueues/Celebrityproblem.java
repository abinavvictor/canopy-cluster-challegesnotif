package StacksANDQueues;
import java.util.Stack;
public class Celebrityproblem {

    public static boolean knows( int [][] matrix, int x, int y){

        return matrix[x][y]== 1;

    }

    public static int celebrity(int[][] matrix, int n ){

        Stack<Integer> mystack = new Stack<> ();
        int celebrity = -1;

        for(int i =0; i < n ; i++){

            mystack.push(i);
        }

        while (!mystack.isEmpty()){

            int x = mystack.pop();

            if(mystack.isEmpty())
            {
                celebrity = x;

            }

            int y= mystack.pop();

            if (knows(matrix,x,y)){
                mystack.push(y);
            }
            else {

                mystack.push(x);
            }


        }

        for( int j =0; j < n; j++){

            if(celebrity != j || knows(matrix, celebrity,j) ||  knows(matrix, j, celebrity)){
                return -1;
            }

        }

        return celebrity;
    }
}
