package Recursion_Level1;

public class Q8_Reverse_String_Tail 
{
    public static void main(String[] args) 
    {
        String s = "ABCD";
        reverse(s, "");
    }
    
    static void reverse(String s, String ans)
    {
        if(s.equals(""))
        {
            System.out.println(ans);
        }
        else
        {
            char ch = s.charAt(0);
            s = s.substring(1);
            reverse(s, ch+ans);
        }
    }

}