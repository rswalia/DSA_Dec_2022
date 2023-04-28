package Recursion_Level2;

public class Q6_Subsets_Of_String 
{
    public static void main(String[] args)
    {
        String s = "ABC";
        String ans = "";
        subsets(s, ans);
    }
    
    static void subsets(String s, String ans)
    {
        if(s=="")
        {
            System.out.println(ans);
        }
        else
        {
            char ch = s.charAt(0);
            s = s.substring(1);
            subsets(s, ans+ch);
            subsets(s,ans);
        }
    }
}