package Array_examples;

import java.util.ArrayList;

public class Subarray_With_Given_Sum_GFG
{
    public static void main(String[] args) 
    {
        int a[] = { 1,2,3,7,5 };
        int s = 12;
        
        ArrayList<Integer> al = new ArrayList<>();
        al = subarraySum(a, a.length, s);
        System.out.println(al);
    }
    
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] a, int n, int target) 
    {
        ArrayList<Integer> al = new ArrayList<>();
        
        int sum = 0;
        
        for(int i=0; i<n; i++)
        {
            if(sum < target)
            {
                sum = sum + a[i];
            }
            else if(sum > target)
            {
                sum = sum - a[0];
                
                if(sum == target)
                {
                    
                }
            }
            else if(sum == target)
            {
                
            }
        }
        
        return al;
    }
}