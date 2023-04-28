package Recursion_Level2;

public class Number_Partion_Without_Repetition 
{
    public static void main(String[] args) 
    {
        int n = 4;
        fun(n, "", n);
    }
    
    static void fun(int n, String ans, int max)
    {
        if(n==0)
        {
            System.out.println(ans);
        }
        else
        {
            for(int i=1; i<=n; i++)
            {
                if(i<=max)
                {
                    fun(n-i, ans+i, i);
                }
            }
        }
    }
}