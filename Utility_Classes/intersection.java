package Utility_Classes;

import java.util.*;

public class intersection
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
        
//        al1.retainAll(al2);
//        System.out.println(al1);

//Method 2
        for(int i=0; i<al1.size(); i++)
        {
            for(int j=0; j<al2.size(); j++)
            {
                if(al1.get(i) == al2.get(j))
                {
                    System.out.println(al1.get(i));
                }
            }
        }
    }
}