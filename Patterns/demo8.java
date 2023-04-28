/*
    1
   121
  12321
 1234321
123454321
*/
package Patterns;

public class demo8
{
    public static void main(String[] args) 
    {
        int i, j, k, l;
        
        for(i=1; i<=5; i++)     // Rows
        {
            for(j=1; j<=5-i; j++) // Spaces
            {
                System.out.print(" ");
            }
            
            for(k=1; k<=i; k++) // N1
            {
                System.out.print(k);
            }
            
            for(l=i-1; l>=1; l--) // N2
            {
                System.out.print(l);
            }
            
            System.out.println();
        }
    }
}