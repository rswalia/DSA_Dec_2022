package Matrix;

public class Q6_mirror_of_matrix 
{
    static int[][] mirror(int a[][])
    {
        int i, j, M=a.length, N=a[0].length;
        int b[][] = new int[M][N];
        
        for(i=0; i<M; i++)
        {
            for(j=0; j<N; j++)
            {
                b[i][N-1-j] = a[i][j];
            }
        }
        return b;
    }
    
    static void print(int a[][])
    {
        int i,j;
        for(i=0; i<a.length; i++)
        {
            for(j=0; j<a[i].length; j++)
            {
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) 
    {
        int a[][] = { {1,2,3}, {4,5,6}, {7,8,9} };
        
        int b[][] = mirror(a);
        print(b);
    }
}