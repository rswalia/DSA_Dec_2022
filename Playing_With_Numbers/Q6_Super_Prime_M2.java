package Playing_With_Numbers;

public class Q6_Super_Prime_M2 
{
    public static void main(String[] args) 
    {
        int n = 41;
        System.out.println(isSuperPrime(n));
//        System.out.println(nextPrime(n));
    }
    
    static boolean isSuperPrime(int n)
    {
        int sum = 0;
        int num = 2;
        boolean flag = true;
        
        while(true)
        {
            sum = sum + num;
            
            if(sum < n)
            {
                num = nextPrime(num);
            }
            else if(sum > n)
            {
                flag = false;
                break;
            }
            else if(sum == n)
            {
                flag = true;
                break;
            }
        }
        
        return flag && isPrime(n);
    }
    
    static int nextPrime(int n)
    {
        int ans;
        
        for(int i=n+1 ;  ; i++)
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
            if(n%i==0)  // not prime
            {
                flag = false;
                break;
            }
        }
        
        return flag;
    }
}