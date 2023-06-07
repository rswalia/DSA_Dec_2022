package Algorithms.Sorting;

//import java.util.Arrays;

public class Bubble_Sort
{
    public static void main(String[] args) 
    {
        int a[] = { 3,5,1,2,6,8,9,7,4 };
        
//        int arr[] = new int[10];
//        fillRandom(arr);
        
        System.out.println("-- ORIGINAL --");
        System.out.println(java.util.Arrays.toString(a));
        
        int b[] = bubbleSort(a);
        
        System.out.println("-- AFTER SORT --");
        System.out.println(java.util.Arrays.toString(b));
    }
    
    static void fillRandom(int a[])
    {
        int L=1, U=100;
        
        for(int i=0; i<a.length; i++)
        {
            a[i] = (int) (L+(U-L)*Math.random());
        }
    }
    
    static int[] bubbleSort(int a[])
    {
        int n = a.length;
        int i, j, t;
        
        for(i=0; i<=n-2; i++)   // Passes
        {
            for(j=0; j<=n-2-i; j++)     // Compare and Swap
            {
                if(a[j] > a[j+1])       // > ASC , < DESC
                {
                    t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
        
        return a;
    }
}