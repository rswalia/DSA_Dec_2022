package Big_Integer;

import java.math.*;

public class BigInteger_demo2 
{
    public static void main(String[] args) 
    {
//        int i, n = 5;
        BigInteger n = new BigInteger("200");
        BigInteger i = BigInteger.ONE;        
        
//        int fact=1;
        BigInteger fact = BigInteger.ONE;
        
        
//        for(i=n; i>=1; i=i-1)
        for(i=n ; i.compareTo(BigInteger.ONE)>=0  ; i = i.subtract(BigInteger.ONE))
        {
            fact = fact.multiply(i);
        }
        
        System.out.println(fact);
    }
}