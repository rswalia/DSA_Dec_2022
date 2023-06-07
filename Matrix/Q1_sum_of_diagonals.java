package Matrix;

public class Q1_sum_of_diagonals 
{
    static int sumOfDiagonals(int a[][])
    {
        int i ,j ,sum=0;
        
        for(i=0; i<a.length; i++)
        {
            for(j=0; j<a[i].length; j++)
            {
                //left diagonal
                if(i==j || i+j==2) //common element counted once
                {
                    sum = sum + a[i][j];
                }
                
                //right diagonal
//                if(i+j==2)
//                {
//                    sum = sum + a[i][j];
//                }
            }
        }
        
        return sum;
    }
    
    public static void main(String[] args) 
    {
        int a[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        int ans = sumOfDiagonals(a);
        System.out.println(ans);
    }
}