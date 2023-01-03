package Collection_Classes;

import java.util.TreeMap;

public class TreeMap_demo 
{
    public static void main(String[] args) 
    {
        //Ascending order
        TreeMap<Integer, String> hm = new TreeMap<>();
        
        hm.put(10, "abc");
        hm.put(12, "xyz");
        hm.put(15, "pqr");
        hm.put(9, "mno");
        hm.put(12, "abc"); //duplicate
        
        System.out.println(hm);
    }
}