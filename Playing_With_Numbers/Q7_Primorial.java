package Playing_With_Numbers;

public class Q7_Primorial
{
    public static void main(String[] args) 
    {
        int n = 13;
        System.out.println(primorial(n));
    }
    
    static int primorial(int n)
    {
        int i, prod=1;
        
        for(i=n; i>=2; i--)
        {
            if(isPrime(i))
            {
                prod = prod * i;
            }
        }
        
        return prod;
    }
    
    static boolean isPrime(int n)
    {
        boolean flag = true;
        
        if(n==0 || n==1)
            return false;
        else
        {
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
}