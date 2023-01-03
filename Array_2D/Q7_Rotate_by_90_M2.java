package Array_2D;

public class Q7_Rotate_by_90_M2
{
    public static void main(String[] args) 
    {
        int a[][] = { {1,2,3}, {4,5,6}, {7,8,9} };
        
        int b[][] = rotate(a);
        
        print(b);
    }
    
    static void print(int a[][])
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
    
    static int[][] rotate(int a[][])
    {
        int i, j, n=a.length;
        int b[][] = new int[n][n];
        
        for(i=0; i<n; i++)//Rows
        {
            for(j=0; j<a[0].length; j++)//Columns
            {
                b[j][n-1-i] = a[i][j] ;
            }
        }
        return b;
    }
}