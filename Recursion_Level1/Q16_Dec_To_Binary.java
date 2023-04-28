package Recursion_Level1;

public class Q16_Dec_To_Binary 
{
    public static void main(String[] args) 
    {
        int n = 5;
        String ans = "";
        
        while(n!=0)
        {
            int r = n%2;
            ans = r + ans;
            n = n/2;
        }
        
        System.out.println(ans);
    }
}