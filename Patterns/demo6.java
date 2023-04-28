/*
    1
   12
  123
 1234
12345
*/
package Patterns;

public class demo6
{
    public static void main(String[] args) 
    {
        int i, j, k;
        
        for(i=1; i<=5; i++)     // Rows
        {
            // Spaces
            for(j=1; j<=5-i; j++) 
            {
                System.out.print(" ");
            }
            
            // Numbers
            for(k=1; k<=i; k++) 
            {
                System.out.print(k);
            }
            
            System.out.println();
        }
    }
}