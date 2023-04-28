package Playing_With_Numbers;

public class Q5_Next_Prime 
{
    public static void main(String[] args) 
    {
        int n = 64;
        System.out.println(nextPrime(n));
    }
    
    static int nextPrime(int n)
    {
        int ans;
        
        for(int i=n+1 ; ; i++)
        {
            if(isPrime(i))
            {
                ans = i;
                break;
            }
        }
        
        return ans;
    }
    
    static boolean isPrime(int n)
    {
        if(n==0 || n==1)
            return false;
        
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