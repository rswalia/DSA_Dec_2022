package Array_2D;

import java.util.Arrays;

public class Q15_sort_submatrix 
{
    public static void main(String[] args) 
    {
        int a[][] = {
                    {1,1,1,1,1,1},
                    {4,4,4,4,4,4},
                    {2,2,2,2,2,2},
                    {3,3,3,3,3,3},
                    {5,5,5,5,5,5},
                    };
        System.out.println("--- ORIGINAL MATRIX ---");
        print(a);
        
        sortSubmatrix(a);
        
        System.out.println("--- SORTED SUBMATRIX ---");
        print(a);
    }
    
    static void print(int a[][])
    {
        int i, j, m=a.length, n=a[0].length;
        
        for(i=0; i<m; i++)
        {
            for(j=0; j<n; j++)
            {
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
    }
    
    static void sortSubmatrix(int a[][])
    {
        int i, j, k, m=a.length, n=a[0].length;
        int b[] = new int[(m-2)*(n-2)];
        
        //2d to 1d
        k=0;
        for(i=1; i<=m-2; i++)
        {
            for(j=1; j<=n-2; j++)
            {
                b[k] = a[i][j];
                k++;
            }
        }
        
        //sort
        Arrays.sort(b);
        
        //1d to 2d
        k=0;
        for(i=1; i<=m-2; i++)
        {
            for(j=1; j<=n-2; j++)
            {
                a[i][j] = b[k];
                k++;
            }
        }
    }
}