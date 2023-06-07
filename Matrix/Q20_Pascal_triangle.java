package Matrix;

public class Q20_Pascal_triangle 
{
    public static void main(String[] args) 
    {
        /*
        int i, n=4;
        for(i=0; i<=n; i++)
        {
            System.out.println((int)(Math.pow(11, i)));
        }
        */
        
        int n=4;
        pascalTriangle(n);
    }
    
    static void pascalTriangle(int n)
    {
        int i, j;
        
        //create (n+1)*(n+1) matrix
        int a[][] = new int[n+1][n+1];
        
        //fill first column with 1
        for(i=0; i<=n; i++)
        {
            a[i][0] = 1;
        }
        
        for(i=1; i<=n; i++)
        {
            for(j=1; j<=i; j++)
            {
                a[i][j] = a[i-1][j-1] + a[i-1][j];
            }
        }
        print(a);
    }
    
    static void print(int a[][])
    {
        int i, j;
        for(i=0; i<a.length; i++)
        {
            for(j=0; j<a[i].length; j++)
                if(a[i][j]==0){
                    System.out.print(" ");
                }
                else{
                    System.out.print(a[i][j] +"\t");
                }
            System.out.println();
        }
    }
}