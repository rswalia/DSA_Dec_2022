package Recursion_Level2;

public class Q13_Subsets_Of_Array_String 
{
    public static void main(String[] args) 
    {
        int a[] = {2,8,10};
        String ans = "";
        subsets(a, ans, 0);
    }
    
    static void subsets(int a[], String ans, int i)
    {
        if(i==a.length)
        {
            System.out.println(ans);    // ans in String
        }
        else
        {
            int num = a[i];
            subsets(a, ans+num+" ", i+1);
            subsets(a, ans, i+1);
        }
    }
}