package Array_examples;

import java.util.HashSet;

public class Q4_Target_Sum 
{
    public static void main(String[] args) 
    {
        int a[] = {1,8,10,7,6,5,9};
        int target = 18;
        
        System.out.println(twoSum(a, target));
    }
    
    static boolean twoSum(int a[], int target)
    {
        HashSet<Integer> hs = new HashSet<>();
        
        for(int p : a)
        {
            hs.add(p);
        }
        
        boolean flag = false;
        
        for(int i=0; i<a.length; i++)
        {
            int diff = target - a[i];
            
            if(hs.contains(diff))
            {
                flag = true;
                break;
            }
        }
        
        return flag;
    }
}