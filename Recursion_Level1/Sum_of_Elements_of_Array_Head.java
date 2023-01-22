package Recursion_Level1;

public class Sum_of_Elements_of_Array_Head 
{
    public static void main(String[] args)
    {
        int a[] = {10,20,30,40,50};
        
        System.out.println(fun(a,4));
    }
    
    static int fun(int[] a, int i)
    {
        if(i==0)
        {
            return a[0];
        }
        else
        {
            return a[i]+fun(a,i-1);
        }
    }
}