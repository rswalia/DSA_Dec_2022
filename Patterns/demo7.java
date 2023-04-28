/*
   *
  ***
 *****
*******
*/
package Patterns;

public class demo7
{
    public static void main(String[] args) 
    {
        int i, j, k;
        
        for(i=1; i<=4; i++)     // Rows
        {
            for(j=1; j<=4-i; j++) // Spaces
            {
                System.out.print(" ");
            }
            
            for(k=1; k<=2*i-1; k++) // Numbers
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}