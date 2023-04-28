package Array_examples;

import java.util.Arrays;

public class Q7_Rotate_Array_GFG 
{
    public static void main(String[] args) 
    {
        int n = 5, d = 2;
        int a[] = {1,2,3,4,5};
        
        rotateArr(a, d, n);
        
        System.out.println(Arrays.toString(a));
    }
    
    static void rotateArr(int a[], int d, int n)
    {
        int b[] = new int[d];
        
        for(int i=0; i<=d-1; i++)
        {
            b[i] = a[i];
        }
        
        for(int i=0; i<=d; i++)
        {
            a[i] = a[i+d];
        }
        
        for(int i=0; i<=d-1; i++)
        {
            a[i+d+1] = b[i];
        }
    }
}