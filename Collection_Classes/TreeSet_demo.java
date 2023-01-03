package Collection_Classes;

import java.util.TreeSet;

public class TreeSet_demo 
{
    public static void main(String[] args) 
    {
        //Ascending order
        TreeSet<Integer> ts = new TreeSet<>();
        
        ts.add(20);
        ts.add(50);
        ts.add(30);
        ts.add(10);
        ts.add(40);
        
        System.out.println(ts);
    }
}