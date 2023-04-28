package Playing_With_Numbers;

public class Q1_Check_Prime 
{
    public static void main(String[] args) 
    {
        int n = 1;
        System.out.println(isPrime(n));
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