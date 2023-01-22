package Array_2D;

import java.util.Arrays;

public class Q12_sort_each_row 
{
    public static void main(String[] args) 
    {
        int a[][] = {{7,9,2},{1,6,8},{3,5,4}};
        sortEachRow(a);
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
    
    static void sortEachRow(int a[][])
    {
        int i, j, n=a.length;
        
        for(i=0; i<n; i++)//Rows
        {
            for(j=0; j<a[i].length; j++)//Columns
            {
                //uses Quick sort
                Arrays.sort(a[i]);
            }
        }
    }
}