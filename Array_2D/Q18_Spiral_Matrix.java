package Array_2D;

public class Q18_Spiral_Matrix 
{
    public static void main(String[] args) 
    {
        int n = 4;
        int a[][] = new int[n][n];
        System.out.println("--- SPIRAL MATRIX ---");
        spiralMatrix(a);
        print(a);
    }
    
    static void print(int a[][])
    {
        int i, j, m=a.length, n=a[0].length;
        
        for(i=0; i<m; i++)
        {
            for(j=0; j<n; j++)
            {
                System.out.print(a[i][j] +"\t");
            }
            System.out.println();
        }
    }
    
    static void spiralMatrix(int a[][])
    {
        int i, j, k, m=a.length, n=a[0].length;
        int x1=0, x2=n-1, y1=0, y2=m-1;
        
        i=0;
        k=1;
        
        while(true)
        {
            if(k>n*n)
            {
                break;
            }
                
            //go right
            for(j=x1; j<=x2; j++)
            {
                a[i][j] = k++;
            }

            y1 ++;
            j--;

            //go down
            for(i=y1; i<=y2; i++)
            {
                a[i][j] = k++;
            }

            x2 --;
            i--;

            //go left
            for(j=x2; j>=x1; j--)
            {
                a[i][j] = k++;
            }

            y2 --;
            j++;

            //go up
            for(i=y2; i>=y1; i--)
            {
                a[i][j] = k++;
            }

            x1 ++;
            i++;
        }
    }  
}