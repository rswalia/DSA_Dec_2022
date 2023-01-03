package Utility_Classes;

import java.util.*;

public class merge_2_arraylist 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);
        
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(80);
        al2.add(60);
        al2.add(70);
        
//        al1.addAll(al2);
        al2.addAll(al1);
        
//        System.out.println(al1);
        System.out.println(al2);
    }
}