package Recursion_Level2;

public class Q18_Count_Ways_To_Score_Head
{
    public static void main(String[] args) 
    {
        int n = 13;
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
            int a = fun(n-1, ans+"1");
            int b = fun(n-3, ans+"3");
            int c = fun(n-5, ans+"5");
            return a+b+c;
        }
    }
}