package Matrix;

import java.util.*;

public class Q18_Spiral_list_LeetCode 
{
    public static void main(String[] args) 
    {
//        int a[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        
        List<Integer> al = new ArrayList<>();
        al = spiralOrder2(a);
        System.out.println(al);
    }
    
    public static List<Integer> spiralOrder2(int[][] a) 
    {
        List<Integer> al = new ArrayList<>();
        int n = a.length;
        int m = a[0].length;
        int i,j;
        int x1=0, x2=n-1, y1=0, y2=m-1;

        while (true) 
        {
            if(x1>x2 || y1>y2)
                break;

            // Go Right
            for (j=y1; j<=y2; j++) 
            {
                al.add(a[x1][j]);
            }
            x1++;

            // Go Down
            for (i=x1; i<=x2; i++) 
            {
                al.add(a[i][y2]);
            }
            y2--;

            // Go Left
            if (x1 <= x2) 
            {
                for (j=y2; j>=y1; j--) 
                {
                    al.add(a[x2][j]);
                }
                x2--;
            }

            // Go Up
            if (y1 <= y2) 
            {
                for (i=x2; i>=x1; i--) 
                {
                    al.add(a[i][y1]);
                }
                y1++;
            }
        }

        return al;
    }
    
//    public static List<Integer> spiralOrder(int[][] a) 
//    {
//        List<Integer> list = new ArrayList<>();
//        int i,j;
//        int n = a.length;
//        int m = a[0].length;
//        int x1=0, x2=n-1, y1=0, y2=m-1;
//        
//        i=0;
//        
//        while(true)
//        {
//            if(x1>x2 || y1>y2)
//                break;
//            
//            //go right
//            for(j=x1; j<=x2; j++)
//            {
////                System.out.print(a[i][j] +" ");
//                list.add(a[i][j]);
//            }
//            
//            y1 ++;
//            j--;
//            
//            //go down
//            for(i=y1; i<=y2; i++)
//            {
////                System.out.print(a[i][j] +" ");
//                list.add(a[i][j]);
//            }
//            
//            x2 --;
//            i--;
//            
//            //go left
//            for(j=x2; j>=x1; j--)
//            {
////                System.out.print(a[i][j] +" ");
//                list.add(a[i][j]);
//            }
//            
//            y2 --;
//            j++;
//            
//            //go up
//            for(i=y2; i>=y1; i--)
//            {
////                System.out.print(a[i][j] +" ");
//                list.add(a[i][j]);
//            }
//            
//            x1 ++;
//            i++;
//        }
//        
//        System.out.println(list);
//        return list;
//    }
}