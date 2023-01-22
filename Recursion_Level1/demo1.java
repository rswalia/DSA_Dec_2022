package Recursion_Level1;

public class demo1 
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
//            fun(n-1); // Asceneding
            System.out.print(n +" ");
            fun(n-1); // Descending
        }
    }
}