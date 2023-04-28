package Array_examples;

import java.util.*;

public class Q3_Merging_Of_Two_Arrays 
{
    public static void main(String[] args) 
    {
        int a[] = { 1,3,4,5 };
        int b[] = { 2,4,6 };
        
        int c[] = merge(a, b);
        
        System.out.println(Arrays.toString(c));
    }
    
    static int[] merge(int a[], int b[])
    {
        int m = a.length;
        int n = b.length;
        
        int c[] = new int[m+n];
        
        // copy elements from a[] to c[]
        for(int i=0; i<m; i++)
        {
            c[i] = a[i];
        }
        
        // copy elements from b[] to c[]
        for(int i=0; i<n; i++)
        {
            c[i+m] = b[i];
        }
        
        return c;
    }
}