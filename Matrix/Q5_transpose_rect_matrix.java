package Matrix;

public class Q5_transpose_rect_matrix 
{
    static int[][] transpose(int a[][])
    {
        int i, j, M=a.length, N=a[0].length;
        int b[][] = new int[N][M];
        
        for(i=0; i<N; i++)//Rows
        {
            for(j=0; j<M; j++)//Columns
            {
                b[i][j] = a[j][i];
            }
        }
        return b;
    }
    
    static void print(int a[][])
    {
        int i, j;
        
        for(i=0; i<a.length; i++)
        {
            for(j=0; j<a[i].length; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) 
    {
        int a[][] = { {1,2,3,4}, {5,6,7,8} };
        
        int b[][] = transpose(a);
        print(b);
    }
}