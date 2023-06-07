package Matrix;

public class Q9_Vertical_Wave 
{
    public static void main(String[] args) 
    {
        int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int i, j, m=a.length, n=a[0].length;
        
        for(j=0; j<=n-1; j++)//Columns
        {
            if(j%2==0)//even
            {
                for(i=0; i<=m-1; i++)//forward loop for Rows
                {
                    System.out.print(a[i][j]+" ");
                }
            }
            else
            {
                for(i=m-1; i>=0; i--)//reverse loop for Rows
                {
                    System.out.print(a[i][j] +" ");
                }
            }
        }
    }
}