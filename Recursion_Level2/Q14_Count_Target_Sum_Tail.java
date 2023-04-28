package Recursion_Level2;

public class Q14_Count_Target_Sum_Tail 
{
    public static void main(String[] args) 
    {
        int a[] = {2,8,10};
        int target = 10;
        System.out.println(countTarget(a, target));
    }
    
    static int countTarget(int a[], int target)
    {
        int count[] = {0};
        countTarget(a, target, "", 0, count, 0);
        return count[0];
    }
    
    static void countTarget(int a[], int target, String ans, int sum, int count[], int i)
    {
        if(i==a.length)
        {
            System.out.println(ans);
            if(sum==target)
            {
//                System.out.println(ans);
                count[0]++;
                System.out.println("count is "+count[0]);
            }
        }
        else
        {
            int num = a[i];
            countTarget(a, target, ans+num+" ", sum+num, count, i+1);
            countTarget(a, target, ans, sum, count, i+1);
        }
    }
}