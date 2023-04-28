package Recursion_Level2;

public class Q5_Tree_Recursion
{
    public static void main(String[] args) 
    {
        fun(4);
    }
    
    static void fun(int n)
    {
        if(n==0)
            System.out.print("X ");
        else if(n<0)
        {
            System.out.print("# ");
        }
        else
        {
            fun(n-2);
            System.out.print(n+" ");
            fun(n-3);
        }
    }
    
}