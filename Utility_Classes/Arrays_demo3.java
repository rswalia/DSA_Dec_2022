package Utility_Classes;

import java.util.Arrays;

public class Arrays_demo3 
{
    public static void main(String[] args) 
    {
        int a[] = {10,20,30,40,50};
        
        //deep copy (copy actual array)
        int b[] = Arrays.copyOf(a, a.length);
        a[0] = 0;
        
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));  
    }
}