package Recursion_Level1;

public class Sum_Of_Numbers_Tail 
{
    public static void main(String[] args) 
    {
        //////////// using Loops //////////////
        /*
        int i, n=5, sum=0;
        for(i=1; i<=n; i++)
        {
            sum = sum + i;
        }
        System.out.println(sum);
        */
        ///////////////////////////////////////
        //////////// using Recursion //////////////
        
        fun(5,0);
    }   
    
    static void fun(int n, int sum)
    {
        if(n==1)
        {
            sum = sum + n;
            System.out.println(sum);
        }
        else
        {
            fun(n-1, sum+n);
        }
    }
}