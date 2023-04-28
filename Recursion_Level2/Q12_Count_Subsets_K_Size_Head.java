package Recursion_Level2;

public class Q12_Count_Subsets_K_Size_Head 
{
    public static void main(String[] args)
    {
        String s = "ABC";
        int k = 2;
        System.out.println(countSubsets(s, k));
    }
    
    static int countSubsets(String s, int k)
    {
        return countSubsets(s, "", k);
    }
    
    static int countSubsets(String s, String ans, int k)
    {
        if(s.equals(""))
        {
            if(ans.length()==k)
                return 1;
            else
                return 0;
        }
        else
        {
            char ch = s.charAt(0);
            s = s.substring(1);
            int include = countSubsets(s, ans+ch, k);
            int dont_include = countSubsets(s, ans, k);
            return (include + dont_include);
        }
    }
}