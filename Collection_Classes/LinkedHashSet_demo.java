package Collection_Classes;

import java.util.LinkedHashSet;

public class LinkedHashSet_demo 
{
    public static void main(String[] args) 
    {
        //maintain insertion order
        LinkedHashSet<Integer> ts = new LinkedHashSet<>();
        
        ts.add(20);
        ts.add(50);
        ts.add(30);
        ts.add(10);
        ts.add(40);
        
        System.out.println(ts);
    }
}