package Recursion_Level2;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Q9_Unique_Subsets_Of_String_Lexographical_Order 
{
    public static void main(String[] args)
    {
        String s = "ABCAB";
        System.out.println(subsets(s));
    }
    // TreeSet = increasing order (Lexographical)
    static List<String> subsets(String s)
    {
        TreeSet<String> ts = new TreeSet<>();
        ArrayList<String> al = new ArrayList<>();
        subsets(s, "", ts);
        al.addAll(ts);
        return al;
    }
    static void subsets(String s, String ans, TreeSet<String> ts)
    {
        if(s.equals(""))
        {
            ts.add(ans);
        }
        else
        {
            char ch = s.charAt(0);
            s = s.substring(1);
            subsets(s, ans+ch, ts);
            subsets(s, ans, ts);
        }
    }
}