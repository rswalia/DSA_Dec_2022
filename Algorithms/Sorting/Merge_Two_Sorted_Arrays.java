package Algorithms.Sorting;

import java.util.Arrays;

public class Merge_Two_Sorted_Arrays 
{
    public static void main(String[] args) 
    {
        int a[] = { 1,4,7,9 };
        int b[] = { 2,3,8,10,12,15 };
        
        int c[] = merge(a, b);
        
        System.out.println("--After Merging--");
        System.out.println(Arrays.toString(c));
    }
    
    static int[] merge(int a[], int b[])
    {
        int m = a.length;
        int n = b.length;
        
        int c[] = new int[m+n];
        
        int i,j,k;
        
        i=0;
        j=0;
        k=0;
        
        while(true)
        {
            if(a[i] < b[j])
            {
                c[k] = a[i];
                k++;
                i++;
                
                // a[] array ends, copy remaining from b[]
                if(i==m)
                {
                    for(j=j; j<=n-1; j++)
                    {
                        c[k] = b[j];
                        k++;
                    }
                    break;
                }
            }
            else
            {
                c[k] = b[j];
                k++;
                j++;
                
                // b[] array ends, copy remaining from a[]
                if(j==n)
                {
                    for(i=i; i<=m-1; i++)
                    {
                        c[k] = a[i];
                        k++;
                    }
                    break;
                }
            }
        }
        
        return c;
    }
}