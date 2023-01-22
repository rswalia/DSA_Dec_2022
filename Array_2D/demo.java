package Array_2D;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demo 
{
    int[][] syntax(int a[][])
    {
        int i, j, n=a.length;
        int b[][] = new int[n][n];
        
        for(i=0; i<n; i++)//Rows
        {
            for(j=0; j<a[i].length; j++)//Columns
            {
                //Logic
            }
        }
        return b;
    }
    
    void print(int a[][])
    {
        int i, j;
        for(i=0; i<a.length; i++)
        {
            for(j=0; j<a[i].length; j++)
            {
                System.out.print(a[i][j] +"\t");
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
                //Logic
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
                //Logic
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
                //Logic
                b[j][n-1-i] = a[i][j];
            }
        }
        
        //copy back to original
        for(i=0; i<n; i++)//Rows
        {
            for(j=0; j<m; j++)//Columns
            {
                //Logic
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

    int[][] rotate180(int a[][])
    {
        int n=a.length, m=a[0].length;
        int b[][] = new int[n][m];
        
        for (int i=0; i<n; i++)//Rows
        {
            for (int j=0; j<m; j++)//Columns
            {
                b[i][j] = a[n-1-i][n-j-1];
            }
        }
        return b;
    }

    void sortMatrix(int a[][])
    {
        int i, j, k=0, n=a.length, m=a[0].length;
        int b[] = new int[n*m];
        
        //Step 1, convert 2d to 1d
        for(i=0; i<n; i++)//Rows
        {
            for(j=0; j<m; j++)//Columns
            {
                //Logic
                b[k] = a[i][j];
                k++;
            }      
        }
        
        //Step 2, sort
        Arrays.sort(b);
        
        //Step 3, convert back 1d to 2d
        k=0;
        
        for(i=0; i<n; i++)//Rows
        {
            for(j=0; j<m; j++)//Columns
            {
                //Logic
                a[i][j] = b[k];
                k++;
            }      
        }
    }
    
    void sortEachRow(int a[][])
    {
        int i, j, n=a.length;
        
        for(i=0; i<n; i++)//Rows
        {
            for(j=0; j<a[0].length; j++)//Columns
            {
                //Logic
                Arrays.sort(a[i]);
            }      
        }
    }

    void sortEachColumn(int a[][])
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

    int[][] subMatrix(int a[][])
    {
        int i, j, M=a.length, N=a[0].length;
        int b[][] = new int[M-2][N-2];
        
        for(i=1; i<=M-2; i++)
        {
            for(j=1; j<=N-2; j++)
            {
                b[i-1][j-1] = a[i][j];
            }
        }
        return b;
    }

    void sortCentre(int a[][])
    {
        int i, j, k, M=a.length, N=a[0].length;
        int b[] = new int[(M-2)*(N-2)];
        
        //2d to 1d
        k=0;
        for(i=1; i<=M-2; i++)
        {
            for(j=1; j<=N-2; j++)
            {
                b[k] = a[i][j];
                k++;
            }
        }
        
        //sort
        Arrays.sort(b);
        
        //1d to 2d
        k=0;
        for(i=1; i<=M-2; i++)
        {
            for(j=1; j<=N-2; j++)
            {
                a[i][j] = b[k];
                k++;
            }
        }
    }

    void sortDiagonol(int a[][])
    {
        int i, j, k, n=a.length, m=a[0].length;
        int b[] = new int[n];
        
        //2d to 1d
        k=0;
        for(i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
            {
                if(i==j) //left
                {
                    b[k] = a[i][j];
                    k++;
                }
            }
        }
        
        //sort
        Arrays.sort(b);
        
        //1d to 2d
        k=0;
        for(i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
            {
                if(i==j) //left
                {
                    a[i][j] = b[k];
                    k++;
                }
            }
        }
    }

    void traverseBorder(int a[][])
    {
        int i, j, m=a.length, n=a[0].length;
        int x1=0, x2=n-1, y1=0, y2=m-1;
        
        //go right
        for(j=x1; j<=x2; j++)
        {
            System.out.print(a[0][j] +" ");
        }
        
        y1 ++;
        
        //go down
        for(i=y1; i<=y2; i++)
        {
            System.out.print(a[i][n-1] +" ");
        }
        
        x2 --;
        
        //go left
        for(j=x2; j>=x1; j--)
        {
            System.out.print(a[m-1][j] +" ");
        }
        
        y2 --;
        
        //go up
        for(i=y2; i>=y1; i--)
        {
            System.out.print(a[i][0] +" ");
        }
    }
    
    int[][] spiralMatrix(int n)
    {
        int a[][] = new int[n][n];
        int i=0, j=0, k=1;
        int x1=0, x2=n-1, y1=0, y2=n-1;
        
        while(true)
        {
            if(k>(n*n))
                break;
            
            //go right
            for(j=x1; j<=x2; j++)
            {
                a[i][j] = k;
                k++;
            }
            
            y1 ++;
            j--;
            
            //go down
            for(i=y1; i<=y2; i++)
            {
                a[i][j] = k;
                k++;
            }
            
            x2 --;
            i--;
            
            //go left
            for(j=x2; j>=x1; j--)
            {
                a[i][j] = k;
                k++;
            }
            
            y2 --;
            j++;
            
            //go up
            for(i=y2; i>=y1; i--)
            {
                a[i][j] = k;
                k++;
            }
            
            x1 ++;
            i++;
        }
        return a;
    }

    public List<Integer> spiralOrder(int[][] a) 
    {
        List<Integer> list = new ArrayList<>();
        int i=0, j, k=1, m=a.length, n=a[0].length;
        int x1=0, x2=m-1, y1=0, y2=n-1;
        
//        list.add(30);
        
        while(true)
        {
            if(x1>x2 || y1>y2)
                break;
            
            //go right
            for(j=x1; j<=x2; j++)
            {
//                System.out.print(a[i][j] +" ");
                list.add(a[i][j]);
            }
            
            y1 ++;
            j--;
            
            //go down
            for(i=y1; i<=y2; i++)
            {
//                System.out.print(a[i][j] +" ");
                list.add(a[i][j]);
            }
            
            x2 --;
            i--;
            
            //go left
            for(j=x2; j>=x1; j--)
            {
//                System.out.print(a[i][j] +" ");
                list.add(a[i][j]);
            }
            
            y2 --;
            j++;
            
            //go up
            for(i=y2; i>=y1; i--)
            {
//                System.out.print(a[i][j] +" ");
                list.add(a[i][j]);
            }
            
            x1 ++;
            i++;
        }
        System.out.println(list);
        return list;
    }

    void pascalTriangle(int n)
    {
        int i, j;
        //create a (n+1)*(n+1) matrix
        int a[][] = new int[n+1][n+1];
        
        //fill 1st column with 1
        for(i=0; i<=n; i++)
        {
            a[i][0] = 1;
        }
        
        for(i=1; i<=n; i++)
        {
            for(j=1; j<=i; j++)
            {
                a[i][j] = a[i-1][j-1] + a[i-1][j];
            }
        }
        
        printPascal(a);
    }
    
    void printPascal(int a[][])
    {
        int i, j;
        for(i=0; i<a.length; i++)
        {
            for(j=0; j<a[i].length; j++)
                if(a[i][j]==0)
                {
                    System.out.print("");
                }
                else{
                    System.out.print(a[i][j] +"\t");
                }
            System.out.println();
        }
    }

}