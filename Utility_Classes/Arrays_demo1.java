package Utility_Classes;

import java.util.*;

public class Arrays_demo1 
{
    public static void main(String[] args) 
    {
        int a[] = {10,20,50,40,30};
        int b[] = {10,20,50,40,30};
        
        System.out.println(Arrays.equals(a, b));
        
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}