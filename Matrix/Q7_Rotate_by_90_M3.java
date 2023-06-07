//without using another matrix
package Matrix;

public class Q7_Rotate_by_90_M3 
{
    public static void main(String[] args) 
    {
        int a[][] = { {1,2,3}, {4,5,6}, {7,8,9} };
        rotate(a);
        print(a);
    }
    
    static void print(int a[][])
    {
        int i, j, n=a.length;
        for(i=0; i<n; i++)//Rows
        {
            for(j=0; j<a[0].length; j++)//Columns
            {
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
    }
    
    static void rotate(int a[][])
    {
        int i, j, n=a.length;
        int b[][] = new int[n][n];
        
        for(i=0; i<n; i++)//Rows
        {
            for(j=0; j<a[0].length; j++)//Columns
            {
                b[j][n-1-i] = a[i][j];
            }
        }
        
        //copy b in a
        for(i=0; i<n; i++)//Rows
        {
            for(j=0; j<a[0].length; j++)//Columns
            {
                a[i][j] = b[i][j];
            }
        }
    }
}