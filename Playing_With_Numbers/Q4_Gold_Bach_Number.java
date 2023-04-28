package Playing_With_Numbers;

public class Q4_Gold_Bach_Number 
{
    public static void main(String[] args) 
    {
        int n = 30;
//        System.out.println(isGoldBach(n));
        printGoldBach(n);
    }
    
    static boolean isGoldBach(int n)
    {
        boolean flag = false;
        
        for(int i=1; i<=n/2; i++)
        {
            if(isPrime(i) && isPrime(n-i))
            {
                flag = true;
                break;
            }
        }
        
        return flag;
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
    
    static void printGoldBach(int n)
    {   
        for(int i=1; i<=n/2; i++)
        {
            if(isPrime(i) && isPrime(n-i))
            {
                System.out.println(i+" + "+ (n-i));
            }
        }
    }
}