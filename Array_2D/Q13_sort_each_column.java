package Array_2D;

import java.util.Arrays;

public class Q13_sort_each_column
{
    public static void main(String[] args) 
    {
        int a[][] = {{7,9,2},{1,6,8},{3,5,4}};
        sortEachColumn(a);
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
    
    static void sortEachColumn(int a[][])
    {
        int i, j, n=a.length, m=a[0].length;
        int b[] = new int[m];
        
        for(j=0; j<m; j++)
        {
            //2d to 1d
            for(i=0; i<n; i++)
            {
                b[i] = a[i][j];
            }
            
            //sort
            Arrays.sort(b);
            
            //1d to 2d
            for(i=0; i<n; i++)
            {
                a[i][j] = b[i];
            }
        }
    }
}