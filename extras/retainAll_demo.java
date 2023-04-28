package extras;

import java.util.ArrayList;

public class retainAll_demo 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(10);
        al.add(10);
        al.add(10);
        al.add(10);
        
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(10);
        al2.add(10);
        al2.add(10);
        al2.add(10);
        al2.add(10);
        
        al.retainAll(al2);      // al INTERSECTION al2
        
        System.out.println(al);
        System.out.println(al2);
    }  
}