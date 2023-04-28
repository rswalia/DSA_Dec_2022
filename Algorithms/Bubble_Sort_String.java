package Algorithms;

import java.util.Arrays;

public class Bubble_Sort_String
{
    public static void main(String[] args) 
    {
        String a[] = { "rohit", "pratham", "ritish", "amrinder", "lovish" };
        
        System.out.println("-- ORIGINAL --");
        System.out.println(Arrays.toString(a));
        
        String b[] = bubbleSort(a);
        
        System.out.println("-- AFTER SORT --");
        System.out.println(Arrays.toString(b));
    }
    
    static String[] bubbleSort(String a[])
    {
        int n = a.length;
        int i, j;
        String t;
        
        for(i=0; i<=n-2; i++)   // Passes
        {
            for(j=0; j<=n-2-i; j++)     // Compare and Swap
            {
                if(a[j].compareTo(a[j+1]) > 0)       // > ASC , < DESC
                {
                    t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
        
        return a;
    }
}