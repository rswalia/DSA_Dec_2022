package extras;

public class intToString 
{
    public static void main(String[] args) 
    {
        int n = 30;
        
        String s = Integer.toString(n);
//        String s = String.valueOf(n);
//        String s = "" + n; //concatenation
        
        System.out.println(s);
    }
}