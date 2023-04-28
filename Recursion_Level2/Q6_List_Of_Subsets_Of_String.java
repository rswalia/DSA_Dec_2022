package Recursion_Level2;

import java.util.ArrayList;
import java.util.List;

public class Q6_List_Of_Subsets_Of_String 
{
    static ArrayList<String> al = new ArrayList<>();    // declare ArrayList Globally
    
    public static void main(String[] args) 
    {
        String s = "ABC";
        System.out.println(subsets(s));
    }
    
    static List<String> subsets(String s)
    {
        subsets(s,"");
//        subsets2(s, "", 0);
        return al;
    }
    
    static void subsets(String s, String ans)
    {
        if(s.equals(""))
        {
            System.out.println(ans);
            al.add(ans);
        }
        else
        {
            char ch = s.charAt(0);
            s = s.substring(1);
            subsets(s, ans+ch);
            subsets(s, ans);
        }
    }

    static void subsets2(String s, String ans, int i)
    {
        if(i==s.length())
        {
            System.out.println(ans);
            al.add(ans);
        }
        else
        {
            char ch = s.charAt(i);
            subsets2(s, ans+ch, i+1);
            subsets2(s, ans, i+1);
        }
    }

}