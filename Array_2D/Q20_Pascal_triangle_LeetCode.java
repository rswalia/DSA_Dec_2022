package Array_2D;

import java.util.*;

public class Q20_Pascal_triangle_LeetCode
{
    public static void main(String[] args) 
    {
        int n=5;
        generate(n);
    }
    
    static List<List<Integer>> generate(int n)
    {
        n=n-1;//LeetCode modification
        int i, j;
        
        //create (n+1)*(n+1) matrix
        int a[][] = new int[n+1][n+1];
        
        //fill first column with 1
        for(i=0; i<=n; i++)
        {
            a[i][0] = 1;
        }
        
        //Pascal triangle Logic
        for(i=1; i<=n; i++)
        {
            for(j=1; j<=i; j++)
            {
                a[i][j] = a[i-1][j-1] + a[i-1][j];
            }
        }

        //Generate List
        List<List<Integer>> mainList = new ArrayList<>();
        for(i=0; i<=n; i++)
        {
            ArrayList<Integer> al = new ArrayList<>();
            for(j=0; j<=i; j++)
            {
                al.add(a[i][j]);
            }
            mainList.add(al);
        }
//        System.out.println(mainList);
        return mainList;
    }
}