/*
5 4 3 2 1 
5 4 3 2 
5 4 3 
5 4 
5
*/
package Patterns;

public class demo5
{
    public static void main(String[] args) 
    {
        int i, j;
        
        for(i=1; i<=5; i++)     // Rows             // Vertically Flip --> change outer loop (i = 5-->1)
        {
            for(j=5; j>=i; j--) // Columns
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}