package Array_examples;

import java.util.Arrays;

public class Q10_Running_Sum_Leetcode_1480 
{
    public static void main(String[] args) 
    {
        int a[] = {1,2,3,4,5};
        
        int b[] = runningSum(a);
        
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
    
    static int[] runningSum(int[] a) 
    {
        int l = a.length;
        int b[] = new int[l];
        int sum = 0;
        
        for(int i=0; i<l; i++)
        {
            sum = sum + a[i];
            b[i] = sum;
        }
        
        return b;
    }
}