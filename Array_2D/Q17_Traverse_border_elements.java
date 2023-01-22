package Array_2D;

public class Q17_Traverse_border_elements 
{
    public static void main(String[] args) 
    {
        int a[][] = {
                    {1,2,3,4,5},
                    {6,7,8,9,10},
                    {11,12,13,14,15},
                    {16,17,18,19,20},
                    };
        
        System.out.println("--- ORIGINAL MATRIX ---");
        print(a);
        System.out.println("--- BORDER ELEMENTS ---");
        traverseBorder(a); 
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
    
    static void traverseBorder(int a[][])
    {
        int i, j, m=a.length, n=a[0].length;
        int x1=0, x2=n-1, y1=0, y2=m-1;
        
        //go right
        for(j=x1; j<=x2; j++)
        {
            System.out.print(a[0][j] + " ");
        }
        
        y1 ++;

        //go down
        for(i=y1; i<=y2; i++)
        {
            System.out.print(a[i][4] + " ");
        }
        
        x2 --;

        //go left
        for(j=x2; j>=x1; j--)
        {
            System.out.print(a[3][j] + " ");
        }
        
        y2 --;

        //go up
        for(i=y2; i>=y1; i--)
        {
            System.out.print(a[i][0] + " ");
        }
    }
}