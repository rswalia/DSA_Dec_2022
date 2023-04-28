package Recursion_Level2;

public class Q14_Count_Target_Sum_Head
{
    public static void main(String[] args) 
    {
        int a[] = {2,8,10};
        int target = 10;
        System.out.println(countTarget(a, target));
    }
    
    static int countTarget(int a[], int target)
    {
        return countTarget(a, target, 0, 0);
    }
    
    static int countTarget(int a[], int target, int sum, int i)
    {
        if(i==a.length)
        {
            if(sum==target)
                return 1;
            else
                return 0;
        }
        else
        {
            int num = a[i];
            int in = countTarget(a, target, sum+num, i+1);
            int ex = countTarget(a, target, sum, i+1);
            return in+ex;
        }
    }
}