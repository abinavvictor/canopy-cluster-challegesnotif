package StacksANDQueues;

import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElements {

    public static Queue<Integer>  reverseFirstK(Queue<Integer> myqueue, int k){

        if(myqueue.isEmpty() || k > myqueue.size() || k < 0) return myqueue;

        Stack<Integer> mystack = new Stack<Integer>();

        for(int i =0; i < k ; i ++){

            mystack.push(myqueue.poll());
        }

        while (!mystack.isEmpty()){
            myqueue.offer(mystack.pop());

        }

        for(int i= 0; i < myqueue.size()- k ; ++i){
            myqueue.offer(myqueue.poll());
        }

        return myqueue;
    }
}
