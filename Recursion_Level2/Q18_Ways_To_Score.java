package Recursion_Level2;

public class Q18_Ways_To_Score 
{
    public static void main(String[] args) 
    {
        int n = 13;
        fun(n, "");
    }
    
    static void fun(int n, String ans)
    {
        if(n==0)
            System.out.println(ans);
        else if(n<0)
        {
            
        }
        else
        {
            fun(n-1, ans+"1");
            fun(n-3, ans+"3");
            fun(n-5, ans+"5");
        }
    }
}