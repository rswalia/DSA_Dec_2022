package Recursion_Level2;

public class Q19_Count_Ways_To_Eat_Strawberry_Nagarro_Head
{
    public static void main(String[] args) 
    {
        int n = 5;
        System.out.println(count(n));
    }
    
    static int count(int n)
    {
        return fun(n, "");
    }
    
    static int fun(int n, String ans)
    {
        if(n==0)
        {
//            System.out.println(ans);
            return 1;
        }
        else if(n<0)
        {
            return 0;
        }
        else
        {
            return fun(n-1, ans+"1") + fun(n-2, ans+"2");
        }
    }
}