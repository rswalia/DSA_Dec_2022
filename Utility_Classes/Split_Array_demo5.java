package Utility_Classes;

import java.util.Arrays;

public class Split_Array_demo5 
{
    public static void main(String[] args) 
    {
        int a[] = {10,20,30,40,50,60,70,80,90,100};
        int n = a.length;
        
        //copy 1st half
        int b[] = Arrays.copyOfRange(a, 0, n/2);
        
        //copy 2nd half
        int c[] = Arrays.copyOfRange(a, n/2, n);  
        
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c)); 
    }
}