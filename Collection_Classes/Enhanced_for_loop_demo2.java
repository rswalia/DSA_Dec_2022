package Collection_Classes;

import java.util.*;

public class Enhanced_for_loop_demo2 
{
    public static void main(String[] args) 
    {
        List<Integer> al = new ArrayList<>(); //Polymorphism
        
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        
        for(int p : al)
        {
            System.out.println(p);
        }
    }
}