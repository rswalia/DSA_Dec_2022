package Playing_With_Numbers;

import java.util.ArrayList;
import java.util.List;

public class Q9_List_Of_Prime_Index 
{
    public static void main(String[] args) 
    {
        int a[] = { 5,7,32,65,21,74,13 };
        List<Integer> al = new ArrayList<>();
        al = findIndex(a);
        System.out.println(al);
    }
    
    static List<Integer> findIndex(int a[])
    {
        List<Integer> al = new ArrayList<>();
        int i, n=a.length;
        
        for(i=0; i<n; i++)
        {
            if(isPrime(a[i]))
            {
                al.add(i);
            }
        }
        
        return al;
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