package StacksANDQueues;

import java.util.Stack;

public class sortValuesInStack {

    public static void insert(Stack<Integer> mystack , int val){

        if(mystack.isEmpty() || val < mystack.peek())
            mystack.push(val);

        else {

            int temp = mystack.pop();
            insert(mystack, val);
            mystack.push(temp);

        }
    }

    public static Stack<Integer> sortStack(Stack <Integer> mystack){

        if(!mystack.empty()){

         int data =   mystack.pop();

         sortStack(mystack);

         insert(mystack, data);


        }
      return mystack;
    }
}
