package Recursion_Level2;

public class Q1_Tree_Recursion 
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
            System.out.print(n+" ");
            fun(n-1);
            fun(n-1);
        }
    }
}