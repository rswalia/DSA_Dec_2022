package Array_2D;

import java.util.Arrays;

public class demo2
{
    void print(int a[][])
    {
        int i, j, n=a.length, m=a[0].length;
        
        for(i=0; i<n; i++)
        {
            for(j=0; j<m; j++)
            {
                System.out.print(a[i][j] +"\t");
            }
            System.out.println();
        }
    }

    void sumOfD(int a[][])
    {
        int i, j, n=a.length, m=a[0].length, sum=0;
        
        for(i=0; i<n; i++)
        {
            for(j=0; j<m; j++)
            {
                if(i==j)//left
                {
                    sum = sum + a[i][j];
                }
                if(i+j==2)//right
                {
                    sum = sum + a[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    void upperHalf(int a[][])
    {
        int i, j, n=a.length, m=a[0].length;
        
        for(i=0; i<n; i++)
        {
            for(j=0; j<m; j++)
            {
                if(i<=j)
                {
                    System.out.print(a[i][j] );
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
        int i, j, n=a.length, m=a[0].length, sum;
        
        for(i=0; i<n; i++)
        {
            sum=0;
            for(j=0; j<m; j++)
            {
                sum = sum + a[i][j];
            }
            System.out.println("Sum of Row "+ i +" is "+ sum);
        }
    }

    void sumOfEachColumn(int a[][])
    {
        int i, j, n=a.length, m=a[0].length, sum;
        
        for(i=0; i<n; i++)
        {
            sum=0;
            for(j=0; j<m; j++)
            {
                sum = sum + a[j][i];
            }
            System.out.println("Sum of Column "+ i +" is "+ sum);
        }

//        for(j=0; j<m; j++)
//        {
//            sum=0;
//            for(i=0; i<n; i++)
//            {
//                sum = sum + a[i][j];
//            }
//            System.out.println("Sum of Column "+ j + " is "+ sum);
//        }
    }

    int[][] transpose1(int a[][])
    {
        int i, j, n=a.length, m=a[0].length;
        int b[][] = new int[n][n];
        
        for(i=0; i<n; i++)
        {
            for(j=0; j<m; j++)
            {
                b[j][i] = a[i][j];
            }
        }
        return b;
    }

    int [][] transpose2(int a[][])
    {
        int i, j, M=a.length, N=a[0].length;
        int b[][] = new int[N][M];
        
        for(i=0; i<M; i++)
        {
            for(j=0; j<N; j++)
            {
                b[j][i] = a[i][j];
            }
        }
        return b;
    }

    int[][] transpose3(int a[][])
    {
        int i, j, n=a.length, m=a[0].length;
        
        for(i=0; i<n; i++)
        {
            for(j=0; j<m; j++)
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
        int i, j, n=a.length, m=a[0].length;
        int b[][] = new int[n][n];
        
        for(i=0; i<n; i++)
        {
            for(j=0; j<m; j++)
            {
                b[i][n-1-j] = a[i][j];
            }
        }
        return b;
    }

    int[][] rotate90(int a[][])
    {
        int i, j, n=a.length, m=a[0].length;
        int b[][] = new int[n][n];
        
        for(i=0; i<n; i++)
        {
            for(j=0; j<m; j++)
            {
                //logic
                b[j][n-1-i] = a[i][j];
            }
        }
        return b;
    }

    void rotate90_M3(int a[][])
    {
        int i, j, n=a.length, m=a[0].length;
        int b[][] = new int[n][n];
        
        for(i=0; i<n; i++)
        {
            for(j=0; j<m; j++)
            {
                b[j][n-1-i] = a[i][j];
            }
        }
        
        for(i=0; i<n; i++)
        {
            for(j=0; j<m; j++)
            {
                a[i][j]= b[i][j];
            }
        }
    }

    int[][] rotate180(int a[][])
    {
        int i, j, n=a.length, m=a[0].length;
        int b[][] = new int[n][n];
        
        for(i=0; i<n; i++)
        {
            for(j=0; j<m; j++)
            {
                b[n-1-i][n-1-j] = a[i][j];
            }
        }
        return b;
    }

    void hzWave(int a[][])
    {
        int i, j, n=a.length, m=a[0].length;
    
        for(i=0; i<n; i++)
        {
            if(i%2==0)
            {
                for(j=0; j<=m-1; j++)
                {
                    System.out.print(a[i][j] +" ");
                }
            }
            else
            {
                for(j=m-1; j>=0; j--)
                {
                    System.out.print(a[i][j] +" ");
                }
            }
        }
    }

    void vtWave(int a[][])
    {
        int i, j, n=a.length, m=a[0].length;
        
        for(j=0; j<m; j++)
        {
            if(j%2==0)
            {
                for(i=0; i<=n-1; i++)
                {
                    System.out.print(a[i][j] +" ");
                }
            }
            else
            {
                for(i=n-1; i>=0; i--)
                {
                    System.out.print(a[i][j] +" ");
                }
            }
        }
    }

    void sortMatrix(int a[][])
    {
        int i, j, k, n=a.length, m=a[0].length;
        int b[] = new int[n*n];
        
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

    void sortEachRow(int a[][])
    {
        int i, j, n=a.length, m=a[0].length;
        
        for(i=0; i<n; i++)
        {
            Arrays.sort(a[i]);
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

    int[][] submatrix(int a[][])
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
                a[i][j]= b[k];
                k++;
            }
        }
    }

    void sortDiag(int a[][])
    {
        int i, j, k, n=a.length, m=a[0].length;
        int b[] = new int[n];
        
        //2d to 1d
        k=0;
        for(i=0; i<n; i++)
        {
            for(j=0; j<m; j++)
            {
                if(i==j) //left diagonol
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
            for(j=0; j<m; j++)
            {
                if(i==j)
                {
                    a[i][j] = b[k];
                    k++;
                }
            }
        }
    }

    void traverseBorder(int a[][])
    {
        int i, j, n=a.length, m=a[0].length;
        int x1=0, x2=m-1, y1=0, y2=n-1;
        
        //go right
        for(j=x1; j<=x2; j++)
        {
            System.out.print(a[0][j] +" ");
        }
        
        y1++;
        
        //go down
        for(i=y1; i<=y2; i++)
        {
            System.out.print(a[i][m-1] +" ");
        }
        
        x2--;
        
        //go left
        for(j=x2; j>=x1; j--)
        {
            System.out.print(a[n-1][j] +" ");
        }
        
        y2--;
        
        //go up
        for(i=y2; i>=y1; i--)
        {
            System.out.print(a[i][0]+" ");
        }
        
    }

    int[][] spiralGenerate(int n)
    {
        int i, j, k;
        int x1=0, x2=n-1, y1=0, y2=n-1;
        int a[][] = new int[n][n];
        
        k=1;
        i=0;
        
        while(true)
        {
//            if(k>(n*n))
//                break;
            
            if(x2<x1 || y2<y1)
                break;
            
            //go right
            for(j=x1; j<=x2; j++)
            {
                a[i][j] = k++;
            }
            y1++;
            j--;
            //go down
            for(i=y1; i<=y2; i++)
            {
                a[i][j] = k++;
            }
            x2--;
            i--;
            //go left
            for(j=x2; j>=x1; j--)
            {
                a[i][j] = k++;
            }
            y2--;
            j++;
            //go up
            for(i=y2; i>=y1; i--)
            {
                a[i][j] = k++;
            }
            x1++;
            i++;
        }
        return a;
    }

}