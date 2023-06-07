package Algorithms.Sorting;

import java.util.Arrays;

public class Split_And_Merge_Back 
{
    public static void main(String[] args) 
    {
        int a[] = { 40,50,     10,20 };
        
        //int a[] = { 20, 10 };
        
//        int a[] = {40,50,  10};
        
        System.out.println("-- original --");
        System.out.println(Arrays.toString(a));
        
        int L = 0;
        int U = a.length-1;
        int mid = (L+U)/2;
        
        splitAndMergeBack(a, L, mid, U);
        
        System.out.println("-- After Split and Merge Back---");
        System.out.println(Arrays.toString(a));
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