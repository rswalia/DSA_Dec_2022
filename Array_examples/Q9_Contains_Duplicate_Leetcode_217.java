package Array_examples;

import java.util.HashSet;

public class Q9_Contains_Duplicate_Leetcode_217 
{
    public static void main(String[] args) 
    {
        int a[] = {1,2,3,1};
        
        System.out.println(containsDuplicate(a));
    }
    
    static boolean containsDuplicate(int[] a) 
    {
        HashSet<Integer> hs = new HashSet<>();
        
        for(int p : a)
        {
            hs.add(p);
        }
        
        return ( a.length != hs.size() );
    }
}