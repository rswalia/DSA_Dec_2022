import java.math.*;

public class BigInteger_demo3 
{
    public static void main(String[] args) 
    {
        BigInteger a = new BigInteger("-8");
        BigInteger b = BigInteger.ONE;
        
        /*
        a>b  =  1
        same =  0
        a<b  = -1
        */
        
        System.out.println(a.compareTo(b));
                
    }
}