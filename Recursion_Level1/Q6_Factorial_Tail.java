package Recursion_Level1;

public class Q6_Factorial_Tail 
{
    public static void main(String[] args) 
    {
        fun(5,1);
    }
    
    static void fun(int n, int prod)
    {
        if(n==1)
        {
            prod = prod * n;
            System.out.println(prod);
        }
        else
        {
            fun(n-1, prod*n);
        }
    }
}