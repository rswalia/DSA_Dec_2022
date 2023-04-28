package Recursion_Level2;

public class Q19_Count_Ways_To_Eat_Strawberry_Nagarro_Tail 
{
    public static void main(String[] args) 
    {
        int n = 5;
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
//            System.out.println(ans);
            count[0]++;
        }
        else if(n<0)
        {
            
        }
        else
        {
            fun(n-1, ans+"1", count);
            fun(n-2, ans+"2", count);
        }
    }
}