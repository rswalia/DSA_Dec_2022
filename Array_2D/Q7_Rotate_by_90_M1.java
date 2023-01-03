//Rotate = Transpose + Mirror
package Array_2D;

public class Q7_Rotate_by_90_M1 
{
    public static void main(String[] args) 
    {
        int a[][] = { {1,2,3}, {4,5,6}, {7,8,9} };
        
        int b[][] = transpose(a);
        int c[][] = mirror(b);
        
        print(c);
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
    
    static int[][] transpose(int a[][])
    {
        int i, j, n=a.length;
        int b[][] = new int[n][n];
        
        for(i=0; i<n; i++)//Rows
        {
            for(j=0; j<a[0].length; j++)//Columns
            {
                b[i][j] = a[j][i];
            }
        }
        return b;
    }
    
    static int[][] mirror(int a[][])
    {
        int i, j, n=a.length;
        int b[][] = new int[n][n];
        
        for(i=0; i<n; i++)//Rows
        {
            for(j=0; j<a[0].length; j++)//Columns
            {
                b[i][j] = a[i][n-1-j];
            }
        }
        return b;
    }  
}