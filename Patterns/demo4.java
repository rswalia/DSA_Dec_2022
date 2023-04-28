/*
A 
A B 
A B C 
A B C D 
A B C D E 
*/
package Patterns;

public class demo4
{
    public static void main(String[] args) 
    {
        int i, j;
        
        for(i=1; i<=5; i++)     // Rows
        {
            for(j=1; j<=i; j++) // Columns
            {
                System.out.print((char)(64+j)+" ");
            }
            System.out.println();
        }
    }
}