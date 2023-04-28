package Recursion_Level1;

public class Q13_Count_Digits_Head 
{
    public static void main(String[] args) 
    {
        int n = 1234;
        System.out.println(countHead(n));
    }
    
    static int countHead(int n)
    {
        if(n==0)
            return 0;
        else
            return 1 + countHead(n/10);
    }
}