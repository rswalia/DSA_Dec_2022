package Array_examples;

public class Q8_Monotonic_Array_Leetcode_896 
{
    public static void main(String[] args) 
    {
        int a[] = {1,2,2,3,4};
        
        System.out.println(isMonotonic(a));
    }
    
    static boolean isMonotonic(int[] a) 
    {
        return asc(a) || desc(a);
    }
    
    static boolean asc(int[] a) 
    {
        int l = a.length;
        boolean flag = true;
        
        for(int i=0; i<=l-2; i++)
        {
            if(a[i] <= a[i+1])
                flag = flag & true;
            else
                flag = flag & false;
        }
        
        return flag;
    }
    
    static boolean desc(int[] a) 
    {
        int l = a.length;
        boolean flag = true;
        
        for(int i=0; i<=l-2; i++)
        {
            if(a[i] >= a[i+1])
                flag = flag & true;
            else
                flag = flag & false;
        }
        
        return flag;
    }
}