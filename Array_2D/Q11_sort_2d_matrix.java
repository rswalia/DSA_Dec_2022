package Array_2D;

import java.util.Arrays;

public class Q11_sort_2d_matrix 
{
    public static void main(String[] args) 
    {
        int a[][] = {{7,9,2},{1,6,8},{3,5,4}};
        
        sortMatrix(a);
        
        print(a);
    }
    
    static void print(int a[][])
    {
        int i, j, n=a.length;
        
        for(i=0; i<n; i++)//Rows
        {
            for(j=0; j<a[i].length; j++)//Columns
            {
                System.out.print(a[i][j] +"\t");
            }
            System.out.println();
        }
    }
    
    static void sortMatrix(int a[][])
    {
        int i, j, k=0, m=a.length, n=a[0].length;
        int b[] = new int[m*n];
        
        //Step 1, copy from 2d matrix to 1d array
        for(i=0; i<m; i++)//Rows
        {
            for(j=0; j<n; j++)//Columns
            {
                //Logic
                b[k] = a[i][j];
                k++;
            }
        }
        
        //Step 2, sort 1d array
        Arrays.sort(b);
        
        //Step 3, copy back 1d arrray to 2d matrix
        k=0;
        for(i=0; i<m; i++)//Rows
        {
            for(j=0; j<n; j++)//Columns
            {
                //Logic
                a[i][j] = b[k];
                k++;
            }
        }
    }

}