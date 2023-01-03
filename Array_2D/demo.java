package Array_2D;

public class demo 
{
    void print(int a[][])
    {
        int i, j;
        for(i=0; i<a.length; i++)
        {
            for(j=0; j<a[i].length; j++)
            {
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
    }
    
    int sumOfD(int a[][])
    {
        int i, j, sum=0;
        for(i=0; i<a.length; i++)
        {
            for(j=0; j<a[i].length; j++)
            {
                if(i==j || i+j==2)
                {
                    sum = sum + a[i][j];
                }
//                if(i+j==2)
//                {
//                    sum = sum + a[i][j];
//                }
            }
        }
        return sum;
    }
 
    void upperHalf(int a[][])
    {
        int i, j;
        for(i=0; i<a.length; i++)
        {
            for(j=0; j<a[i].length; j++)
            {
                if(i<=j)
                {
                    System.out.print(a[i][j]);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    void sumOfEachRow(int a[][])
    {
        int i, j;
        for(i=0; i<a.length; i++)//Rows
        {
            int sum = 0;
            for(j=0; j<a[i].length; j++)//Columns
            {
                sum = sum + a[i][j];
            }
            System.out.println("Sum of Row "+ i +" is "+ sum);
        }
    }
    
    void sumOfEachColumn(int a[][])
    {
        int i, j;
        for(j=0; j<a[0].length; j++)//Columns
        {
            int sum = 0;
            for(i=0; i<a.length; i++)//Rows
            {
                sum = sum + a[i][j];
            }
            System.out.println("Sum of Column "+ j +" is "+ sum);
        }
    }
    
    void sumOfEachColumn_M2(int a[][])
    {
        int i, j;
        for(i=0; i<a.length; i++)//Rows
        {
            int sum = 0;
            for(j=0; j<a[i].length; j++)//Columns
            {
                sum = sum + a[j][i];
            }
            System.out.println("Sum of Column "+ j +" is "+ sum);
        }
    }

    int[][] transpose_sq(int a[][])
    {
        int i, j, n=a.length;
        int b[][] = new int[n][n];
        
        for(i=0; i<n; i++)
        {
            for(j=0; j<a[0].length; j++)
            {
                b[j][i] = a[i][j];
//                b[i][j] = a[j][i];
            }
        }
        return b;
    }
    
    int[][] transpose_rect(int a[][])
    {
        int i, j, m=a.length, n=a[0].length;
        int b[][] = new int[n][m];
        
        for(i=0; i<n; i++)//Rows
        {
            for(j=0; j<m; j++)//Columns
            {
                b[j][i] = a[i][j];
//                b[i][j] = a[j][i];
            }
        }
        return b;
    }
    
    int[][] transpose_swap(int a[][])
    {
        int i, j, m=a.length, n=a[0].length;
        
        for(i=0; i<m; i++)//Rows
        {
            for(j=0; j<n; j++)//Columns
            {
                if(i<j)
                {
                    int temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
                }
            }
        }
        return a;
    }

    int[][] mirror(int a[][])
    {
        int i, j, n=a.length;
        int b[][] = new int[n][n];
        
        for(i=0; i<n; i++)//Rows
        {
            for(j=0; j<a[0].length; j++)//Columns
            {
                b[i][n-1-j] = a[i][j];
            }
        }
        return b;
    }

    int[][] rotate(int a[][])
    {
        int i, j, n=a.length, m=a[0].length;
        int b[][] = new int[n][m];
        
        for(i=0; i<n; i++)//Rows
        {
            for(j=0; j<m; j++)//Columns
            {
                b[j][n-1-i] = a[i][j];
            }
        }
        return b;
    }

    void rotate2(int a[][])
    {
        int i, j, n=a.length, m=a[0].length;
        int b[][] = new int[n][m];
        
        for(i=0; i<n; i++)//Rows
        {
            for(j=0; j<m; j++)//Columns
            {
                b[j][n-1-i] = a[i][j];
            }
        }
        
        //copy back to original
        for(i=0; i<n; i++)//Rows
        {
            for(j=0; j<m; j++)//Columns
            {
                a[i][j] = b[i][j];
            }
        }
    }

    void horizontalWave(int a[][])
    {
        int i, j, m=a.length, n=a[0].length;
        
        for(i=0; i<m; i++)//Rows
        {
            if(i%2==0)//even
            {
                for(j=0; j<=n-1; j++)//forward loop for Columns
                {
                    System.out.print(a[i][j] +" ");
                }
            }
            else//odd
            {
                for(j=n-1; j>=0; j--)//reverse loop for Columns
                {
                    System.out.print(a[i][j] +" ");
                }
            }     
        }
    }
    
    void verticalalWave(int a[][])
    {
        int i, j, m=a.length, n=a[0].length;
        
        for(j=0; j<=n-1; j++)//Columns
        {
            if(j%2==0)//even
            {
                for(i=0; i<=m-1; i++)//forward loop for Rows
                {
                    System.out.print(a[i][j]+" ");
                }
            }
            else
            {
                for(i=m-1; i>=0; i--)//reverse loop for Rows
                {
                    System.out.print(a[i][j] +" ");
                }
            }
        }
    }
}