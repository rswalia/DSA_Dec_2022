package Recursion_Level2;

public class Q15_Check_Target_Sum 
{
    public static void main(String[] args) 
    {
        int a[] = {2,8,10};
        String ans = "";
        int target = 10;
        System.out.println(targetSum(a, target, 0, ans, 0));
    }
    
    static boolean targetSum(int a[], int target, int i, String ans, int sum)
    {
        if(i==a.length)
        {
            if(sum==target)
            {
                System.out.println(ans);
                return true;
            }
            else
                return false;
        }
        else
        {
            int num = a[i];
            boolean in = targetSum(a, target, i+1, ans+num+" ", sum+num);
            boolean ex = targetSum(a, target, i+1, ans, sum);
            return in||ex;
        }
    }
}