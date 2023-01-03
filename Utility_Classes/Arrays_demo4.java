package Utility_Classes;

import java.util.Arrays;

public class Arrays_demo4 
{
    public static void main(String[] args) 
    {
        int a[] = {10,20,30,40,50};
        
        //copy of range (>=0 & <2)
        int b[] = Arrays.copyOfRange(a, 0, 2);
        
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));  
    }
}