package Recursion_Level2;

public class Q6_Subsets_Of_String2
{
    public static void main(String[] args)
    {
        String s = "ABC";
        String ans = "";
        subsets(s, ans, 0);
    }
    
    static void subsets(String s, String ans, int i)
    {
        if(i==s.length())
        {
            System.out.println(ans);
        }
        else
        {
            char ch = s.charAt(i);
            subsets(s, ans+ch, i+1);
            subsets(s, ans, i+1);
        }
    }
}