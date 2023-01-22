package Array_2D;

public class Q19_Fill_border 
{
    public static void main(String[] args) 
    {
        int M=4;
        int N=6;
        fillBorder(M,N);
    }
    
    static void fillBorder(int m, int n)
    {
        int a[][] = new int[m][n];
        int i, j;
        
        for(i=0; i<m; i++)
        {
            for(j=0; j<n; j++)
            {
                if(i==0 || i==m-1)
                {
                    a[i][j] = 1;
                }
                if(j==0 || j==n-1)
                {
                    a[i][j] = 1;
                }
            }
        }
        print(a);
    }
    
    static void print(int a[][])
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
}