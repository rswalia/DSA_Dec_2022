/*
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5
*/
package Patterns;

public class demo1 
{
    public static void main(String[] args) 
    {
        int i, j;
        
        for(i=1; i<=3; i++)     // Rows
        {
            for(j=1; j<=5; j++) // Columns
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}