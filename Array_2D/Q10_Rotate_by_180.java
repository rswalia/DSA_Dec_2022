//Rotate by 180
package Array_2D;

public class Q10_Rotate_by_180 
{
    public static void main(String[] args) 
    {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        
        int b[][] = rotate180(a);
        
        print(b);
    }
    
    static void print(int a[][])
    {
        int i, j, n=a.length;
        
        for(i=0; i<n; i++)//Rows
        {
            for(j=0; j<a[i].length; j++)//Columns
            {
                System.out.print(a[i][j] +"\t");
            }
            System.out.println();
        }
    }

    static int[][] rotate180(int a[][])
    {
        int i, j, n=a.length;
        int b[][] = new int[n][n];
        
        for(i=0; i<n; i++)//Rows
        {
            for(j=0; j<a[i].length; j++)//Columns
            {
                //Logic
                b[n-1-i][n-1-j] = a[i][j];
            }
        }
        
        return b;
    }

}