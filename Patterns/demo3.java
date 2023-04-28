/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15
*/
package Patterns;

public class demo3
{
    public static void main(String[] args) 
    {
        int i, j;
        int k = 1;  // Continous Pattern
        
        for(i=1; i<=5; i++)     // Rows
        {
            for(j=1; j<=i; j++) // Columns
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}