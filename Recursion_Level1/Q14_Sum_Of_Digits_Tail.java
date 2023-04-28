package Recursion_Level1;

public class Q14_Sum_Of_Digits_Tail 
{
    public static void main(String[] args) 
    {
        int n = 12345;
        int sum = 0;
        sumTail(n, sum);
    }
    
    static void sumTail(int n, int sum)
    {
        if(n==0)
            System.out.println(sum);
        else
        {
            int r = n%10;
            sumTail(n/10, sum+r);
        }
    }
}