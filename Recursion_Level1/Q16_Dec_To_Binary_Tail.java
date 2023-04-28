package Recursion_Level1;

public class Q16_Dec_To_Binary_Tail
{
    public static void main(String[] args) 
    {
        int n = 19;
        String ans = "";
        decToBinaryTail(n, ans);
    }
    
    static void decToBinaryTail(int n, String ans)
    {
        if(n==0)
            System.out.println(ans);
        else
        {
            int r = n%2;
            decToBinaryTail(n/2, r+ans);
        }
    }
}