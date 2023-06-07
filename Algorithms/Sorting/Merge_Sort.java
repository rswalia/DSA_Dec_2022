package Algorithms.Sorting;

import java.util.Arrays;

public class Merge_Sort 
{
    public static void main(String[] args)
    {
        int a[] = { 8,7,6,5,4,3,2,1 };
        
        int L = 0;
        int U = a.length-1;
        
        divide(a, L, U);
        
        System.out.println("-- After Sorting --");
        System.out.println(Arrays.toString(a));
    }
    
    static void divide(int a[], int L , int U)
    {
        if(L==U)
        {
            
        }
        else
        {
            int mid = (L+U)/2;
            divide(a, L, mid);
            divide(a, mid+1, U);
            
            splitAndMergeBack(a, L, mid, U);
        }
    }
    
    static void splitAndMergeBack(int orig[], int L, int mid, int U)
    {
        System.out.println("L: "+L+", mid: "+mid+",U: "+U);
     
        // STEP 1 (SPLIT)
        
        int a[] = new int[(mid+1)-L];
        int b[] = new int[U-mid];
        
        int m = a.length;
        int n = b.length;
        
        // copy content to a[] and b[]
        for(int i=0; i<m ; i++)
        {
            a[i] = orig[i+L];
        }
        
        for(int i=0; i<n ; i++)
        {
            b[i] = orig[i+(mid+1)];
        }
        
        System.out.println("a[] --> "+Arrays.toString(a));
        System.out.println("b[] --> "+Arrays.toString(b));
       
        /////////////////////////////////////////////////////
        
        // STEP 2 (MERGE BACK)
        
        int i,j,k;
        
        i=0;
        j=0;
        k=L;
        
        while(true)
        {
            if(a[i]<b[j])
            {
                orig[k] = a[i];
                k++;
                i++;
             
                // a[] array ends, copy remaining from b[] and stop
                if(i==m)
                {
                    for( j=j ; j<=n-1; j++)
                    {
                        orig[k] = b[j];
                        k++;
                    }
                    
                    break;
                }
                
            }
            else
            {
                orig[k] = b[j];
                k++;
                j++;
                
                // if b[] ends, copy remaining from a[] and stop
                if(j==n)
                {
                    for(i=i; i<=m-1; i++)
                    {
                        orig[k] = a[i];
                        k++;
                    }
                    
                    break;
                }
            }
        }
        
         
    }
}