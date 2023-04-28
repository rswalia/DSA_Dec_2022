package Recursion_Level2;

public class Q17_Number_Partition 
{
    public static void main(String[] args) 
    {
        int n = 3;
        fun(n, "");
    }
    
    static void fun(int n, String ans)
    {
        if(n==0)
            System.out.println(ans);
        else
        {
            for(int i=1; i<=n; i++)
            {
                fun(n-i, ans+i+" ");
            }
        }
    }
}