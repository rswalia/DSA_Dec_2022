import java.math.*;

public class BigInteger_demo1 
{
    public static void main(String[] args) 
    {
        BigInteger a = new BigInteger("123456789123456789123456789");
//        System.out.println(a);
        BigInteger b = new BigInteger("84362216789123456789123456789");

        //Operations
        BigInteger c = a.add(b);
        System.out.println(c);
        
        BigInteger d = a.subtract(b);
        System.out.println(d);
        
        BigInteger e = a.multiply(b);
        System.out.println(e);
        
        BigInteger f = a.divide(b);
        System.out.println(f);
    } 
}