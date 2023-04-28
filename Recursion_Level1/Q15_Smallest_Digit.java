package Recursion_Level1;

public class Q15_Smallest_Digit 
{
    public static void main(String[] args) 
    {
        int n = 1234;
        int small = n%10;   // 4
        
        while(n!=0)
        {
            int r = n%10;
            
            if(small > r)
                small = r;
            
            n = n/10;
        }
        
        System.out.println(small);
    }
}