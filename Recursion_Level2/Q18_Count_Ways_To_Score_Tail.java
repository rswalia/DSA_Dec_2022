package Recursion_Level2;

public class Q18_Count_Ways_To_Score_Tail
{
    public static void main(String[] args) 
    {
        int n = 13;
        System.out.println(count(n));
    }
    
    static int count(int n)
    {
        int count[] = {0};
        fun(n, "", count);
        return count[0];
    }
    
    static void fun(int n, String ans, int count[])
    {
        if(n==0)
        {
            System.out.println(ans);
            count[0]++;
        }
        else if(n<0)
        {
            
        }
        else
        {
            fun(n-1, ans+"1", count);
            fun(n-3, ans+"3", count);
            fun(n-5, ans+"5", count);
        }
    }
}