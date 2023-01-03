package Array_2D;;

public class Q2_upper_half 
{
    static void upperHalf(int a[][])
    {
        int i, j;
        for(i=0; i<a.length; i++)
        {
            for(j=0; j<a[i].length; j++)
            {
                if(i<=j)
                {
                    System.out.print(a[i][j]);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) 
    {
        int a[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        upperHalf(a);
    }
}