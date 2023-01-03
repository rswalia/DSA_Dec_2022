package Array_2D;

public class Q8_Horizontal_Wave 
{
    public static void main(String[] args) 
    {
        int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int i, j, m=a.length, n=a[0].length;
        
        for(i=0; i<m; i++)//Rows
        {
            if(i%2==0)//even
            {
                for(j=0; j<=n-1; j++)//forward loop for Columns
                {
                    System.out.print(a[i][j] +" ");
                }
            }
            else//odd
            {
                for(j=n-1; j>=0; j--)//reverse loop for Columns
                {
                    System.out.print(a[i][j] +" ");
                }
            }     
        }
    }
}