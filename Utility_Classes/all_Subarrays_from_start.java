package Utility_Classes;

import java.util.Arrays;

public class all_Subarrays_from_start 
{
    public static void main(String[] args) 
    {
        int a[] = {10,20,30,40,50};
        int i, n = a.length;
        
        
        for(i=0; i<=n; i++)
        {
            int b[] = Arrays.copyOfRange(a, 0, i);
            System.out.println(Arrays.toString(b));
        } 
    }
}