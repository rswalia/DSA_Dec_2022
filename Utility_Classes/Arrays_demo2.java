package Utility_Classes;

import java.util.Arrays;

public class Arrays_demo2 
{
    public static void main(String[] args) 
    {
        int a[] = {10,20,30,40,50};
        
        //shallow copy (copy array reference)
        int b[] = a;
        a[1] = 0;
        
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));  
    }
}