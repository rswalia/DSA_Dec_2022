package Matrix;

import java.util.Arrays;

public class Q16_sort_diagonols 
{
    public static void main(String[] args) 
    {
        int a[][] = {{9,9,9},{8,8,8},{7,7,7}};
        System.out.println("--- ORIGINAL MATRIX ---");
        print(a);
        
        sortDiagonols(a);
        
        System.out.println("--- AFTER SORTING DIAGONOLS ---");
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

    static void sortDiagonols(int a[][])
    {
        int i, j, n=a.length, m=a[0].length;
        int b[] = new int[n];
        
        for(i=0; i<n; i++)
        {
            for(j=0; j<m; j++)
            {
                //Left Diagonol
                if(i==j)
                {
                    //2d to 1d
                    b[i] = a[i][j];
                }
            }
        }
        
        Arrays.sort(b);
        
        for(i=0; i<n; i++)
        {
            for(j=0; j<m; j++)
            {
                if(i==j)
                {
                    //1d to 2d
                    a[i][j] = b[i];
                }
            }
        }
    }
}