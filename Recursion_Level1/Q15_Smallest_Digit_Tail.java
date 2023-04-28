package Recursion_Level1;

public class Q15_Smallest_Digit_Tail 
{
    public static void main(String[] args) 
    {
        int n = 1234;
        int small = n%10;   // 4
        smallTail(n, small);
    }
    
    static void smallTail(int n, int small)
    {
        if(n==0)
            System.out.println(small);
        else
        {
            int r = n%10;
            if(small > r)
                small = r;
            smallTail(n/10, small);
        }
    }
}