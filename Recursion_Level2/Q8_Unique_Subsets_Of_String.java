/*
HashSet         fast access
TreeSet         increasing order
LinedHashSet    maintain insertion order
*/
package Recursion_Level2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Q8_Unique_Subsets_Of_String 
{
    public static void main(String[] args) 
    {
        String s = "ABCABC";
        System.out.println(subsets(s));
    }
    
    static List<String> subsets(String s)
    {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        ArrayList<String> al = new ArrayList<>();
        subsets(s, "", lhs);
        al.addAll(lhs);
        return al;
    }
    
    static void subsets(String s, String ans, LinkedHashSet<String> lhs)
    {
        if(s.equals(""))
        {
            lhs.add(ans);
        }
        else
        {
            char ch = s.charAt(0);
            s = s.substring(1);
            subsets(s, ans+ch, lhs);
            subsets(s, ans, lhs);
        }
    }
}