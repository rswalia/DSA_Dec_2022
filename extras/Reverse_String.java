package extras;

public class Reverse_String 
{
    public static void main(String[] args) 
    {
        String s = "Hello";
        
        System.out.println(reverse(s));
        
//        System.out.println(s);
    }
    
    static String reverse(String s)
    {
        String rev = "";
        
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            rev = ch + rev;
        }
        
        return rev;
    }
}