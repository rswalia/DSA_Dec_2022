package Array_2D;

import java.util.*;

public class practice 
{
    public static void main(String[] args) 
    {
//        int a[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
//        int rect[][] = {{1,2,3,4},{5,6,7,8}};
//        int snake[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
//        int unsort[][] = {{7,9,2},{1,6,8},{3,5,4}};
        
//        int b[][] = trans_swap(a);
//        int b[][] = trans_rect(rect);

//        int b[][] = mirror(a);
        
//        int b[][] = transpose(a);
//        int c[][] = mirror(b);

//        int b[][] = rotate(a);
//        rotate2(a);

//        hzWave(snake);
//        vtWave(snake);

//        sortMatrix(unsort);
//        sortEachRow(unsort);
//        sortEachColumn(unsort);
        
//        print(a);
    }
    
    static void print(int a[][])
    {
        int i, j, n=a.length;
        for(i=0; i<n; i++)//Rows
        {
            for(j=0; j<a[i].length; j++)//Columns
            {
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
    }
   
    static int[][] transpose(int a[][])
    {
        int i, j, n=a.length;
        int b[][] = new int[n][n];
        
        for(i=0; i<n; i++)//Rows
        {
            for(j=0; j<a[i].length; j++)//Columns
            {
                b[j][i] = a[i][j];
            }
        }
        return b;
    }
    
    static int[][] trans_rect(int a[][])
    {
        int i, j, M=a.length, N=a[0].length;
        int b[][] = new int[N][M];
        
        for(i=0; i<M; i++)//Rows
        {
            for(j=0; j<N; j++)//Columns
            {
                b[j][i] = a[i][j];
            }
        }
        return b;
    } 
 
    static int[][] trans_swap(int a[][])
    {
        int i, j, n=a.length;
        
        for(i=0; i<n; i++)//Rows
        {
            for(j=0; j<a[i].length; j++)//Columns
            {
                if(i < j)
                {
                    int temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
                }
            }
        }
        return a;
    }
    
    static int[][] mirror(int a[][])
    {
        int i, j, n=a.length;
        int b[][] = new int[n][n];
        
        for(i=0; i<n; i++)//Rows
        {
            for(j=0; j<a[i].length; j++)//Columns
            {
                //logic
                b[i][n-1-j] = a[i][j];
            }
        }
        return b;
    }
    
    static int[][] rotate(int a[][])
    {
        int i, j, n=a.length;
        int b[][] = new int[n][n];
        
        for(i=0; i<n; i++)//Rows
        {
            for(j=0; j<a[i].length; j++)//Columns
            {
                //Logic
                b[j][n-1-i] = a[i][j];
            }
        }
        return b;
    }
    
    static void rotate2(int a[][])
    {
        int i, j, n=a.length;
        int b[][] = new int[n][n];
        
        for(i=0; i<n; i++)//Rows
        {
            for(j=0; j<a[i].length; j++)//Columns
            {
                //Logic
                b[j][n-1-i] = a[i][j];
            }
        }
        
        //copy back to original
        for(i=0; i<n; i++)//Rows
        {
            for(j=0; j<a[i].length; j++)//Columns
            {
                //Logic
                a[i][j] = b[i][j];
            }
        }
    }
    
    static void hzWave(int a[][])
    {
        int i, j, m=a.length, n=a[0].length;
        
        for(i=0; i<m; i++)//Rows
        {
            if(i%2==0)//even
            {
                for(j=0; j<=n-1; j++)
                {
                    System.out.print(a[i][j] +" ");
                }
            }
            else //odd
            {
                for(j=n-1; j>=0; j--)
                {
                    System.out.print(a[i][j] +" ");
                }
            }
        }
    }
    
    static void vtWave(int a[][])
    {
        int i, j, m=a.length, n=a[0].length;
        
        for(j=0; j<n; j++)//Columns
        {
            if(j%2==0)//even
            {
                for(i=0; i<m; i++)
                {
                    System.out.print(a[i][j] +" ");
                }
            }
            else //odd
            {
                for(i=m-1; i>=0; i--)
                {
                    System.out.print(a[i][j] +" ");
                }
            }
        }
    }
    
    static void sortMatrix(int a[][])
    {
        int i, j, k, n=a.length, m=a[0].length;
        int b[] = new int[n*m];
        
        //2d to 1d
        k=0;
        for(i=0; i<n; i++)
        {
            for(j=0; j<m; j++)
            {
                b[k] = a[i][j];
                k++;
            }
        }
        
        //sort
        Arrays.sort(b);
        
        //1d to 2d
        k=0;
        for(i=0; i<n; i++)
        {
            for(j=0; j<m; j++)
            {
                a[i][j] = b[k];
                k++;
            }
        }
    }
    
    static void sortEachRow(int a[][])
    {
        int i, n=a.length;
        
        for(i=0; i<n; i++)
        {
            Arrays.sort(a[i]);
        }
    }

    static void sortEachColumn(int a[][])
    {
        
    }
    
    //wrong
    static void borderElements(int a[][])
    {
        int i, j, m=a.length, n=a[0].length;
        
        for(i=0; i<m; i++)
        {
            for(j=0; j<n; j++)
            {
                if(i==0)
                {
                    System.out.print(a[i][j] +" ");
                }
                else if(i == 3)
                {
                    System.out.print(a[i][j] +" ");
                }
                else if(j==0)
                {
                    System.out.print(a[i][j] +" ");
                }
                else if(j == 4)
                {
                    System.out.print(a[i][j] +" ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
        
    }
    
    
}