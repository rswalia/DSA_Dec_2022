package Playing_With_Numbers;

public class Q2_All_Primes_btw_1_100 
{
    public static void main(String[] args) 
    {
        for(int i=1; i<=100; i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+", ");
            }
        }
    }
    
    static boolean isPrime(int n)
    {
        if(n==0 || n==1)
        {
            return false;
        }
        
        boolean flag = true;
        
        for(int i=2; i<=Math.sqrt(n); i++)
        {
            if(n%i==0)
            {
                flag = false;
                break;
            }
        }
        
        return flag;
    }
}