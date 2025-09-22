package StacksANDQueues;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.*;

public class BinaryNumbersfrom1ton {

    public static String []  findBin(int n){

        String [] result = new String[n];

        Queue<String> queue = new ArrayDeque<>();

        queue.offer("1");

        for(int i =0; i < n ; i++){

            result[i]= queue.poll();

            String s1 = result[i] + "0";

            String s2 = result[i] + "1";

            queue.offer(s1);
            queue.offer(s2);


        }

        return result;

    }
}
