package Algorithms;

import java.util.*;

public class Sieve_Of_Eratosthenos
{
    public static void main(String[] args) 
    {
        int n = 50;
        filterPrime(n);
//        int cnt = countPrimesLeetcode(n);
//        System.out.println(cnt);
    }
    
    static void filterPrime(int n)
    {
        if(n==0 || n==1)
        {
            System.out.println("No Primes !!!");
        }
        else
        {
            int arr[] = new int[n+1];
            
            for(int i=0; i<arr.length; i++)
            {
                arr[i] = i;
            }
            
            System.out.println(Arrays.toString(arr));
            
            for(int i=2; i<=Math.sqrt(n); i++)
            {
                // if number is already crossed (eg- 4), Don't Try
                if(arr[i] != 0)
                {
                    for(int j=2; i*j<=n; j++)
                    {
                        if(arr[i*j] != 0)
                        {
                            arr[i*j] = 0;
                        }
                    }
                }
            }
            
            System.out.println(Arrays.toString(arr));
            
            int cnt = 0;
            
            for(int i=2; i<=n; i++)
            {
                if(arr[i] != 0)
                    cnt++;
            }
            
            System.out.println(cnt+" Primes");
        }
    }
    
    static int countPrimesLeetcode(int n) 
    {
        if(n==0 || n==1)
        {
            return 0;
        }
        else
        {
            int a[] = new int[n+1];
            for(int i=0; i<a.length; i++)
            {
                a[i] = i;
            }
//            System.out.println(Arrays.toString(a));
            
            for(int i=2; i<=Math.sqrt(n); i++)
            {
                if(a[i]!=0)
                {
                    for(int j=2; i*j<=n; j++)
                    {
                        if(a[i*j]!=0)
                        {
                            a[i*j] = 0;
                        }
                    }
                }
            }
            
//            System.out.println(Arrays.toString(a));
            
            int cnt = 0;
            for(int i=2; i<=n; i++)
            {
                if(a[i]!=0)
                    cnt++;
            }
            return cnt;
        }
    }
    
    static ArrayList<Integer> sieveOfEratosthenesGFG(int n)
    {
        ArrayList<Integer> al = new ArrayList<>();
        
        if(n==0 || n==1)
        {
            return al;
        }
        else
        {
            int a[] = new int[n+1];
            for(int i=0; i<a.length; i++)
            {
                a[i] = i;
            }
//            System.out.println(Arrays.toString(a));
            
            for(int i=2; i<=Math.sqrt(n); i++)
            {
                if(a[i]!=0)
                {
                    for(int j=2; i*j<=n; j++)
                    {
                        if(a[i*j]!=0)
                        {
                            a[i*j] = 0;
                        }
                    }
                }
            }
            
//            System.out.println(Arrays.toString(a));
            
            for(int i=2; i<=n; i++)
            {
                if(a[i]!=0)
                    al.add(a[i]);
            }
            return al;
        }
    }
}