package Array_examples;

import java.util.Arrays;

public class Q1_Reverse_Array 
{
    public static void main(String[] args) 
    {
        int a[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        
        reverse(a);
        
        System.out.println(Arrays.toString(a));
    }
    
    // without extra array (SWAP)
    static void reverse(int a[])
    {
        int temp, l = a.length;
        
        for(int i=0; i<l/2; i++)
        {
            temp = a[i];
            a[i] = a[l-1-i];
            a[l-1-i] = temp;
        }
    }
    
    // using extra array
    static void reverse2(int a[])
    {
        int l = a.length;
        int b[] = new int[l];
        
        for(int i=0; i<l; i++)
        {
            b[i] = a[l-1-i];
        }
    }
}