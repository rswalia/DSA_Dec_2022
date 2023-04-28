package Recursion_Level2;

public class Q21_Number_Partition_Max_Product_TCS_DIGITAL 
{
    public static void main(String[] args) 
    {
        int n = 8;
        System.out.println(maxProd(n));
    }
    
    static int maxProd(int n)
    {
        int max[] = {0};
        fun(n, "", max);
        return max[0];
    }
    
    static void fun(int n, String ans, int max[])
    {
        if(n==0)
        {
//            System.out.println(ans);
        }
        else
        {
            for(int i=1; i<=n; i++)
            {
                fun(n-i, ans+i, max);
            }
        }
    }
}