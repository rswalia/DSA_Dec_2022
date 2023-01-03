package Collection_Classes;

import java.util.HashMap;
import java.util.*;

public class HashMap_demo 
{
    public static void main(String[] args) 
    {
        HashMap<Integer, String> hm = new HashMap<>();
        
        hm.put(10, "abc");
        hm.put(12, "xyz");
        hm.put(15, "pqr");
        hm.put(9, "mno");
        hm.put(12, "abc"); //keys are always unique
        
        System.out.println(hm);
        System.out.println(hm.get(10));
        
        //get all keys
        Set<Integer> keys = hm.keySet();    
        System.out.println(keys);
        
//        for(int p : keys)
//        {
//            System.out.println(p);
//        }
        
        //get all values
        Collection<String> values = hm.values();
        System.out.println(values);
    }
}