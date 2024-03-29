package Playing_With_Numbers;

public class Q3_Twin_Primes 
{
    public static void main(String[] args) 
    {
        for(int i=1; i<=100; i++)
        {
            if(isPrime(i) && isPrime(i+2))
            {
                System.out.println(i+" , "+ (i+2) );
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
                flag = false;   // not prime
                break;
            }
        }
        
        return flag;
    }   
}