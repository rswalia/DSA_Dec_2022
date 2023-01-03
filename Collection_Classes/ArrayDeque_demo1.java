package Collection_Classes;

import java.util.*;

public class ArrayDeque_demo1 {
    public static void main(String[] args) 
    {
        //FIFO
        ArrayDeque<Integer> q = new ArrayDeque<>();
        
        q.addLast(10);
        q.addLast(20);
        q.addLast(30);
        
        q.addFirst(40);
        q.addFirst(50);
        
        System.out.println(q);
        
        //remove from last
//        System.out.println("Remove from last");
//        while(! q.isEmpty())
//        {
//            System.out.println(q.removeLast());
//        }
        
        //remove from first
        System.out.println("Remove from first");
        while(! q.isEmpty())
        {
            System.out.println(q.removeFirst());
        }
        
    }
}