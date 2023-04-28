package Collection_Classes;

import java.util.*;

public class Simple_Queue 
{
    public static void main(String[] args) 
    {
        ArrayDeque<Integer> q = new ArrayDeque<>();
        
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        
        System.out.println(q);
        
        while(! q.isEmpty())
        {
            System.out.println(q.remove());
        }
    }
}