package Matrix;

public class Q3_sum_of_each_row 
{
    public static void main(String[] args) 
    {
        int a[][] = { {1,2,3}, {4,5,6}, {7,8,9} };
        int i, j;
        
        for(i=0; i<a.length; i++)
        {
            int sum = 0;
            for(j=0; j<a[i].length; j++)
            {
                sum = sum + a[i][j];
            }
            System.out.println("Sum of Row "+ i +" is "+ sum);
        }
    }
}