package Recursion_Level1;

public class Q14_Sum_Of_Digits_Head 
{
    public static void main(String[] args) 
    {
        int n = 12345;
        int sum = 0;
        System.out.println(sumHead(n));
    }
    
    static int sumHead(int n)
    {
        if(n==0)
            return 0;
        else
        {
            int r = n%10;
            return sumHead(n/10) + r;
        }
    }
}