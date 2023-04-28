package extras;

public class max_wealth 
{
    public static void main(String[] args) 
    {
        int a[][] = {{2,8,7},{7,1,3},{1,9,5}};
        
        int b = maximumWealth(a);
        System.out.println(b);
    }
    
    static int maximumWealth(int[][] a) 
    {
        int i, j, m=a.length, n=a[0].length, sum, max=0;
        for(i=0; i<m; i++)
        {
            sum=0;
            for(j=0; j<n; j++)
            {
                sum = sum + a[i][j];
            }
//            max = Math.max(sum, max);
            
            if(sum>max)
                max = sum;
        }
        return max;
    }
}