package Collection_Classes;

import java.util.*;

public class Priority_Queue 
{
    public static void main(String[] args) 
    {
        //uses min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        pq.add(40);
        pq.add(20);
        pq.add(10);
        pq.add(30);
        pq.add(50);
        
        System.out.println(pq);
        
        while(! pq.isEmpty())
        {
            System.out.println(pq.remove());
        }
    }
}