package Array_examples;

import java.util.*;

public class Q11_Union
{
    public static void main(String[] args)
    {
        int a[] = {1,2,3,4,5};
        int b[] = {3,4,5,6,7};
        
        int c[] = union(a, b);
        
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
    }
    
    static int[] union(int a[], int b[])
    {
        HashSet<Integer> hs = new HashSet<>();
        
        for(int p : a)
        {
            hs.add(p);
        }
        
        for(int p : b)
        {
            hs.add(p);
        }
        
        int c[] = new int[hs.size()];
        
        int i = 0;
        for(int p : hs)
        {
            c[i] = p;
            i++;
        }
        
        return c;
    }
}