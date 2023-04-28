package Array_examples;

import java.util.*;

public class Demo 
{
    public static void main(String[] args) 
    {
        int a[] = {3,3,3};
        int b[] = {3,3,3};
        int c[] = {3,3,3};
        
        ArrayList<Integer> al = new ArrayList<>();
        al = commonElements(a, b, c, a.length, b.length, c.length);
        
        System.out.println(al);
    }
    
    static ArrayList<Integer> commonElements(int a[], int b[], int c[], int n1, int n2, int n3) 
    {
        ArrayList<Integer> al1 = new ArrayList<>();
        for(int p : a)
            al1.add(p);
        
        ArrayList<Integer> al2 = new ArrayList<>();
        for(int p : b)
            al2.add(p);
        
        ArrayList<Integer> al3 = new ArrayList<>();
        for(int p : c)
            al3.add(p);
        
        al1.retainAll(al2);
        al1.retainAll(al3);
        
//        System.out.println(al1);
        
        TreeSet<Integer> ts = new TreeSet<>();
        
        for(int p : al1)
            ts.add(p);
        
        ArrayList<Integer> al4 = new ArrayList<>();
        
        for(int p : ts)
            al4.add(p);
        
        return al4;
    }
}