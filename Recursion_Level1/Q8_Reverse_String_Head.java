package Recursion_Level1;

public class Q8_Reverse_String_Head 
{
    public static void main(String[] args) 
    {
        String s = "ABCD";
        
        String rev = fun(s, 0);
        System.out.println(rev);
    }
    
     static String fun(String s, int i)
    {
        if(i==s.length())
        {
            
        }
        else
        {
            char ch = s.charAt(i);
            return fun(s, i+1) + ch;
        }
        return null;
    }
}