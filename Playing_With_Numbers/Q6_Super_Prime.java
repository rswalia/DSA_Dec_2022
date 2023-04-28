package Playing_With_Numbers;

public class Q6_Super_Prime 
{
    public static void main(String[] args) 
    {
        int n = 41;
        System.out.println(isSuperPrime(n));
    }
    
    static boolean isSuperPrime(int n)
    {
        int sum = 0;
        boolean flag = false;
        
        for(int i=1; i<=n; i++)
        {
            if(isPrime(i))
            {
                if(sum < n)
                {
                    sum = sum + i;
                }
                else if(sum > n)
                {
                    break;
                }
                else if(sum == n)
                {
                    flag = true;
                    break;
                }
            }
        }
        
        return flag && isPrime(n);
    }
    
    static boolean isPrime(int n)
    {
        if(n==0 || n==1)
            return false;
        
        boolean flag = true;
        
        for(int i=2; i<=Math.sqrt(n); i++)
        {
            if(n%i==0)  // not prime
            {
                flag = false;
                break;
            }
        }
        
        return flag;
    }
}