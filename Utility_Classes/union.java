package Utility_Classes;

import java.util.*;

public class union 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);
        
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(30);
        al2.add(40);
        al2.add(50);
        
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        
        lhs.addAll(al1);
        lhs.addAll(al2);
        
        System.out.println(lhs);
        
//        -----------------------------------------------
        
        //copy all elements from al1 to set
//        for(int i=0; i<al1.size(); i++)
//        {
//            lhs.add(al1.get(i));
//        }
        
        //copy all elements from al2 to set
//        for(int i=0; i<al2.size(); i++)
//        {
//            lhs.add(al2.get(i));
//        }
        
        //copy elements from set to list
//        ArrayList<Integer> al3 = new ArrayList<>();
//        
//        al3.addAll(lhs);
//        System.out.println(al3);

//        al1.clear();
//        al1.addAll(lhs);
        
//        System.out.println("al1 = "+ al1);
//        System.out.println("al2 = "+ al2);
//        System.out.println("Union = "+ al3);
    }
}