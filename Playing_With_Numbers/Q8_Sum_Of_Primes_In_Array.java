package Playing_With_Numbers;

public class Q8_Sum_Of_Primes_In_Array 
{
    public static void main(String[] args) 
    {
        int a[] = { 5,7,32,65,21,74,13 };
        System.out.println(sumOfPrimes(a));
    }
    
    static int sumOfPrimes(int a[])
    {
        int i, sum = 0;
        
        for(i=0; i<a.length; i++)
        {
            if(isPrime(a[i]))
            {
//                System.out.print(a[i]+"+");
                sum = sum + a[i];
            }
        }
        
        return sum;
    }
    
    static boolean isPrime(int n)
    {
        boolean flag = true;
        
        if(n==0 || n==1)
            return false;
        else
        {
            int i;
            
            for(i=2; i<=Math.sqrt(n); i++)
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