package Recursion_Level2;

import java.util.ArrayList;
import java.util.List;

public class Q7_Subsets_Of_K_Size_Of_String 
{
    public static void main(String[] args) 
    {
        String s = "ABC";
        int K = 2;
        System.out.println(KsizeSubsets(s, K));
    }
    
    static List<String> KsizeSubsets(String s, int K)
    {
        ArrayList<String> al = new ArrayList<>();
        
        subsets(s, "", al, K);
        
        return al;
    }
    
    static void subsets(String s, String ans, ArrayList<String> al, int K)
    {
        if(s.equals(""))
        {
            if(ans.length()==K)
            {
                al.add(ans);
            }
        }
        else
        {
            char ch = s.charAt(0);
            s = s.substring(1);
            subsets(s, ans+ch, al, K);
            subsets(s, ans, al, K);
        }
    }
}