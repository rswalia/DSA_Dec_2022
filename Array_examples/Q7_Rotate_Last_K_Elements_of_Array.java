package Array_examples;

import java.util.Arrays;

public class Q7_Rotate_Last_K_Elements_of_Array 
{
    public static void main(String[] args) 
    {
//        int a[] = {10,20,30,40,50,60,70,80,90,100};
        int a[] = {-1};
        
        rotate(a, 3);
        
        System.out.println(Arrays.toString(a));
    }
    
    static void rotate(int a[], int k)
    {
        int l = a.length;
        int b[] = new int[k];
        
        // copy last k elements from a[] to b[]
        for(int i=0; i<=k-1; i++)
        {
            b[i] = a[i+l-k];
        }
        
        // shift elements by k position
        for(int i=l-k-1; i>=0; i--)
        {
            a[i+k] = a[i];
        }
        
        // copy back from b[] to a[]
        for(int i=0; i<=k-1; i++)
        {
            a[i] = b[i];
        }
    }
}