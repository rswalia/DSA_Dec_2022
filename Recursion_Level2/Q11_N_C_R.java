package Recursion_Level2;

public class Q11_N_C_R 
{
    public static void main(String[] args) 
    {
        int n = 4;
        int r = 2;
        System.out.println(comb(n, r));
    }
    
    static int comb(int n, int r)
    {
        if(r==0 || r==n)
            return 1;
        else
            return comb(n-1, r) + comb(n-1, r-1);
    }
}