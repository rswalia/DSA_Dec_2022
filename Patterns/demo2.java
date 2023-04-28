/*
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5
*/
package Patterns;

public class demo2
{
    public static void main(String[] args) 
    {
        int i, j;
        
        for(i=1; i<=5; i++)     // Rows
        {
            for(j=1; j<=i; j++) // Columns
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}