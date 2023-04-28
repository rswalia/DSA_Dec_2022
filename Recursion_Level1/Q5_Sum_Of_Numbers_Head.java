package Recursion_Level1;

public class Q5_Sum_Of_Numbers_Head 
{
    public static void main(String[] args) 
    {
        System.out.println(fun(5));
    }
    
    static int fun(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
            return n + fun(n-1);
        }
    }
}