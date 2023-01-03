package Array_2D;

public class Q5_transpose_by_swapping 
{
    static void print(int a[][])
    {
       int i, j;
       
       for(i=0; i<a.length; i++)
       {
           for(j=0; j<a[i].length; j++)
           {
               System.out.print(a[i][j] + " ");
           }
           System.out.println();
       }
    }
    
    public static void main(String[] args) 
    {
        int a[][] = { {1,2,3}, {4,5,6}, {7,8,9} };
        int i,j;
        
        for(i=0; i<a.length; i++)
       {
           for(j=0; j<a[i].length; j++)
           {
               if(i < j)
               {
                   int temp = a[i][j];
                   a[i][j] = a[j][i];
                   a[j][i] = temp;
               }
           }
       }
        
        print(a);
    }
}