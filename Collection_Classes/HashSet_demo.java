package Collection_Classes;

import java.util.HashSet;

public class HashSet_demo 
{
    public static void main(String[] args) 
    {
        //HashCode - Fast Searching
        HashSet<Integer> hs = new HashSet<>();
        
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        
        System.out.println(hs);
    }
}