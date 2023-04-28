package Recursion_Level2;

public class Q12_Count_Subsets_K_Size_Tail 
{
    public static void main(String[] args) 
    {
        String s = "ABC";
        int k = 2;
        
        System.out.println(countSubsets(s, k));
    }
    
    static int countSubsets(String s, int k)
    {
        int count[] = {0};    // pass it as Array (single copy of reference datatype)
        countSubsets(s,"", k, count);
        return count[0];
    }
    
    static void countSubsets(String s, String ans, int k, int count[])
    {
        if(s.equals(""))
        {
            System.out.println(ans);
            if(ans.length()==k)
            {
                count[0]++;
                System.out.println("count is "+ count[0]);
            }
        }
        else
        {
            char ch = s.charAt(0);
            s = s.substring(1);
            countSubsets(s, ans+ch, k, count);
            countSubsets(s, ans, k, count);
        }
    }
}