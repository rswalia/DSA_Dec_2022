package Recursion_Level2;

public class Q20_Ways_To_Climb_Stairs_Amazon 
{
    public static void main(String[] args) 
    {
        int n = 4;
        fun(n, "");
    }
    
    static void fun(int n, String ans)
    {
        if(n==0)
        {
            System.out.println(ans);
        }
        else if(n<0)    // Fixed Partition - Invalid base case
        {
            
        }
        else
        {
            fun(n-1, ans+"1");
            fun(n-2, ans+"2");
            fun(n-3, ans+"3");
        }
    }
    
}