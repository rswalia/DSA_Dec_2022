package Recursion_Level1;

public class demo3_1_to_5
{
    public static void main(String[] args) 
    {
        fun(1);
    }    
    static void fun(int n)
    {
        if(n==5)
        {
            System.out.println("Stop");
        }
        else
        {
            System.out.print(n +" ");
            fun(n+1);
        }
    }
}