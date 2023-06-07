package Algorithms.Sorting;

import java.util.Arrays;

public class Quick_Sort 
{
    public static void main(String[] args) 
    {
        int a[] = { 8,7,3,2,10,6,9,1,4,5 };
        
        quickSort(a, 0, a.length-1);
        System.out.println("Sorted array: " + Arrays.toString(a));
    }
    
    public static void quickSort(int[] a, int l, int u) 
    {
//        if (l >= u)
//        {
//            
//        }
//        else
        if(l < u)
        {
            int pos = partition(a, l, u);
            
            // Recursively sort elements before and after the partition index
            quickSort(a, l, pos-1);
            quickSort(a, pos+1, u);
        }
    }
    
    static int partition(int a[], int l, int u)
    {
        int i, j, t;
        int pivot = a[u];   // 5
        i = l-1;
        
        for(j=l; j<=u-1; j++)
        {
            if(a[j] <= pivot)
            {
                i++;
                
                //Swap a[j] with a[i]
                t = a[j];
                a[j] = a[i];
                a[i] = t;
            }
        }
        
        //Swap a[i+1] with pivot
        t = a[i+1];
        a[i+1] = a[u];
        a[u] = t;
        
        return i+1;
    }
}