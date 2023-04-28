package Recursion_Level2;

import java.util.ArrayList;
import java.util.List;

public class Q6_List_Of_Subsets_Of_String2
{
    public static void main(String[] args) 
    {
        String s = "ABC";
        System.out.println(subsets(s));
    }
    
    static List<String> subsets(String s)
    {
        ArrayList<String> al = new ArrayList<>();
        subsets(s,"", al);
        return al;
    }
    // al is passed by reference, so only 1 copy of al will exist
    
    static void subsets(String s, String ans, ArrayList<String> al)
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
            subsets(s, ans+ch, al);
            subsets(s, ans, al);
        }
    }
}