package Collection_Classes;

import java.util.LinkedHashMap;

public class LinkedHashMap_demo 
{
    public static void main(String[] args) 
    {
        //maintain insertion order
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
        
        hm.put(10, "abc");
        hm.put(12, "xyz");
        hm.put(15, "pqr");
        hm.put(9, "mno");
        hm.put(12, "abc"); //duplicate
        
        System.out.println(hm);
    }
}