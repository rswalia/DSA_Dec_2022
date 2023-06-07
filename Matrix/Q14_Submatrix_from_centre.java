package Matrix;

public class Q14_Submatrix_from_centre 
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
        
        int b[][] = subMatrix(a);
        
        System.out.println("--- SUBMATRIX FROM CENTRE ---");
        print(b);
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
    
    static int[][] subMatrix(int a[][])
    {
        int i, j, m=a.length, n=a[0].length;
        int b[][] = new int[m-2][n-2];
        
        for(i=1; i<=m-2; i++)
        {
            for(j=1; j<=n-2; j++)
            {
                b[i-1][j-1] = a[i][j];
            }
        }
        return b;
    }
}