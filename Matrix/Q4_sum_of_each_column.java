package Matrix;

public class Q4_sum_of_each_column 
{
    public static void main(String[] args) 
    {
        int a[][] = { {1,2,3}, {4,5,6}, {7,8,9} };
        int i, j;
        
        for(i=0; i<a.length; i++)
        {
            int sum = 0;//sum reset for each row
            for(j=0; j<a[i].length; j++)
            {
                sum = sum + a[j][i];
            }
            System.out.println("Sum of Column "+ i +" is "+ sum);
        }

//        for(j=0; j<a.length; j++)
//        {
//            int sum = 0;
//            for(i=0; i<a[0].length; i++)
//            {
//                sum = sum + a[i][j];
//            }
//            System.out.println("Sum of Column "+ j +" is "+ sum);
//        }
    }
}