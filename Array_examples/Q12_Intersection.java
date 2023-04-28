package Array_examples;

import java.util.*;

public class Q12_Intersection 
{
    public static void main(String[] args) 
    {
        int a[] = {1,2,3,4,5};
        int b[] = {3,4,5,6,7};
        
        int c[] = intersection(a, b);
        
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
    }
    
    static int[] intersection(int a[], int b[])
    {
        ArrayList<Integer> al1 = new ArrayList<>();
        for(int p : a)
        {
            al1.add(p);
        }
        
        ArrayList<Integer> al2 = new ArrayList<>();
        for(int p : b)
        {
            al2.add(p);
        }
        
        al1.retainAll(al2);
        
        int c[] = new int[al1.size()];
        
        int i = 0;
        for(int p : al1)
        {
            c[i] = p;
            i++;
        }
        
        return c;
    }
}