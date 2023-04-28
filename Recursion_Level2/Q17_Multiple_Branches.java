package Recursion_Level2;

public class Q17_Multiple_Branches 
{
    public static void main(String[] args) 
    {
        int n = 4;
        fun(n);
    }
    
    static void fun(int n)
    {
        if(n==0)
        {
            System.out.print("X ");
        }
        else if(n<0)
        {
            
        }
        else
        {
            System.out.print(n+" ");
            for(int i=1; i<=n; i++)
            {
                fun(n-i);
            }
            /*
            fun(n-1);
            fun(n-2);
            fun(n-3);
            */
        }
    }
}