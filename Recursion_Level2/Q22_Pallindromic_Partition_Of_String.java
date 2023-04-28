package Recursion_Level2;

import java.util.TreeSet;

public class Q22_Pallindromic_Partition_Of_String 
{
    public static void main(String[] args) 
    {
        String s = "AACBB";
        
        TreeSet<String> ts = new TreeSet<>();
        
        subsets(s, "", 0, ts);
       
        System.out.println(ts);
        
    }
    
    static void subsets(String s, String ans, int i, TreeSet<String> ts)
    {
        if(i==s.length())
        {
            ans = ans.trim();
//            System.out.println(ans);
            ts.add(ans);
        }
        else
        {
            char ch = s.charAt(i);
            
            // include "A "
            subsets(s, ans+ch+" ", i+1, ts);
            
            // include "A"
            subsets(s, ans+ch, i+1, ts);
        }
    }
}