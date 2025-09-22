package StacksANDQueues;

import java.util.Stack;

public class ValidParenthesis {

    public boolean isBalanced( String exp){

        Stack<Character> mystack = new Stack<Character>();

        for( int i =0;  i < exp.length(); i++){

            char c = exp.charAt(i);

            if (c == '}'  || c == ']' || c ==')') {

                if(mystack.isEmpty()) return false;

             char topChar =   mystack.peek();

             if( (c == ']' && topChar == '[') || ( c== '}'  && topChar == '{')  || (c == ')' && topChar == '(') ){
                    return false;

                }
                else {
                    mystack.push(c);

                }
        }
    }

        return mystack.isEmpty();
}
}
