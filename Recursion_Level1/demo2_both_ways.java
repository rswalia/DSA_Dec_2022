package Recursion_Level1;

public class demo2_both_ways 
{
    public static void main(String[] args) 
    {
        fun(3);
    }
    
    static void fun(int n)
    {
        if(n==0)
        {
            System.out.print("Stop ");
        }
        else
        {
            System.out.print(n +" ");
            fun(n-1);
            System.out.print(n +" ");
        }
    }
}