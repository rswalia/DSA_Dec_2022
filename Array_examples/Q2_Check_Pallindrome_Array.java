package Array_examples;

import java.util.Arrays;

public class Q2_Check_Pallindrome_Array 
{
    public static void main(String[] args) 
    {
        int a[] = { 10, 30, 30, 10 };
        
        System.out.println(isPallindrome(a));
    }
    
    static boolean isPallindrome(int a[])
    {
        int orig[] = Arrays.copyOf(a, a.length);
        
        reverse(a);
        
        return Arrays.equals(orig, a);
    }
    
    static void reverse(int a[])
    {
        int t, l = a.length;
        
        for(int i=0; i<l/2; i++)
        {
            t = a[i];
            a[i] = a[l-1-i];
            a[l-1-i] = t;
        }
    }
}