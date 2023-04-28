package Recursion_Level2;

public class Q2_Tree_Recursion 
{
    public static void main(String[] args) 
    {
        fun(3);
    }
    
    static void fun(int n)
    {
        if(n==0)
        {
            System.out.print("X ");
        }
        else
        {
            fun(n-1);
            System.out.print(n+" ");
            fun(n-1);
        }
    }
}