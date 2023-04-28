package Recursion_Level2;

public class Q13_Target_Sum_Tail 
{
    public static void main(String[] args) 
    {
        int a[] = {2,8,10};
        String ans = "";
        int target = 10;
        
        targetSum(a, target, 0, ans, 0);
    }
    
    static void targetSum(int a[], int target, int i, String ans, int sum)
    {
        if(i==a.length)
        {
            if(sum==target)
            {
                System.out.println(ans);
            }
        }
        else
        {
            int num = a[i];
            targetSum(a, target, i+1, ans+num+" ", sum+num);
            targetSum(a, target, i+1, ans, sum);
        }
    }
}