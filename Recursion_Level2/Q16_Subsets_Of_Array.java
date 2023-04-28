package Recursion_Level2;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Q16_Subsets_Of_Array 
{
    public static void main(String[] args) 
    {
        int a[] = {10,20,30};
        subsets(a, "", 0);
    }
    
    static void subsets(int a[], String ans, int i)
    {
        if(i==a.length)
        {
            System.out.println(ans);
            
            int arr[] = convertToIntArray(ans);
            System.out.println(Arrays.toString(arr));
        }
        else
        {
            int num = a[i];
            subsets(a, ans+num+" ", i+1);
            subsets(a, ans, i+1);
        }
    }
    
    static int[] convertToIntArray(String s)
    {
        s = s.trim();
        
        if(s.equals(""))
        {
            int a[] = new int[0];
            return a;
        }
        else
        {
            StringTokenizer st = new StringTokenizer(s);
            
            int n = st.countTokens();
            int a[] = new int[n];
            
            for(int i=0; i<n; i++)
            {
                a[i] = Integer.parseInt(st.nextToken());
            }
            return a;
        }
    }
}