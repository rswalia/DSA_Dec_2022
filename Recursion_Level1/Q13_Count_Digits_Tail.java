package Recursion_Level1;

public class Q13_Count_Digits_Tail 
{
    public static void main(String[] args) 
    {
        int n = 1235;
        int count = 0;
        countTail(n, count);
    }
    
    static void countTail(int n, int count)
    {
        if(n==0)
            System.out.println(count);
        else
        {
//            int r = n%10;
            countTail(n/10, count+1);
        }
    }
}