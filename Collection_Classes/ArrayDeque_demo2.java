package Collection_Classes;

import java.util.*;

public class ArrayDeque_demo2 {
    public static void main(String[] args) 
    {
        //Double Ended Queue behave as Stack if it is block from FRONT end
        ArrayDeque<Integer> q = new ArrayDeque<>();
        
        q.addLast(10);
        q.addLast(20);
        q.addLast(30);
        
        System.out.println(q);
        
//        remove from last
        while(! q.isEmpty())
        {
            System.out.println(q.removeLast());
        }
        
    }
}