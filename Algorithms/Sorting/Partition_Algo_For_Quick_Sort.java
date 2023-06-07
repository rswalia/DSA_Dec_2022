package Algorithms.Sorting;

import java.util.Arrays;

public class Partition_Algo_For_Quick_Sort
{
    public static void main(String[] args) 
    {
        int a[] = { 8,7,3,2,10,6,9,1,4,5 };
        
        System.out.println("Index of Pivot = "+ partition(a, 0, a.length-1));
        System.out.println("--After Partion--");
        System.out.println(Arrays.toString(a));
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