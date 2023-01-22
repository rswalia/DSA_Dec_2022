package Array_2D;

import java.util.*;

public class Q18_Spiral_list_LeetCode 
{
    public static void main(String[] args) 
    {
        int a[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        spiralOrder(a);
    }
    
    public static List<Integer> spiralOrder(int[][] a) 
    {
        List<Integer> list = new ArrayList<>();
        int i=0, j, k=1, m=a.length, n=a[0].length;
        int x1=0, x2=m-1, y1=0, y2=n-1;
        
//        list.add(30);
        
        while(true)
        {
            if(x1>x2 || y1>y2)
                break;
            
            //go right
            for(j=x1; j<=x2; j++)
            {
//                System.out.print(a[i][j] +" ");
                list.add(a[i][j]);
            }
            
            y1 ++;
            j--;
            
            //go down
            for(i=y1; i<=y2; i++)
            {
//                System.out.print(a[i][j] +" ");
                list.add(a[i][j]);
            }
            
            x2 --;
            i--;
            
            //go left
            for(j=x2; j>=x1; j--)
            {
//                System.out.print(a[i][j] +" ");
                list.add(a[i][j]);
            }
            
            y2 --;
            j++;
            
            //go up
            for(i=y2; i>=y1; i--)
            {
//                System.out.print(a[i][j] +" ");
                list.add(a[i][j]);
            }
            
            x1 ++;
            i++;
        }
        System.out.println(list);
        return list;
    }
}